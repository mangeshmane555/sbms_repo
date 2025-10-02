package in.mane.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.SimpleStepBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;

import in.mane.entity.Customer;
import in.mane.repo.CustomerRepository;

/*For Spring Batch 5.x and Spring Boot 3.x: If you are using these versions, 
 * also ensure you have removed the @EnableBatchProcessing annotation from your configuration. 
//It is no longer required and can prevent auto-configuration from working.
*/
@Configuration
//@EnableBatchProcessing 
public class CsvBatchConfig {

	@Autowired
	private CustomerRepository customerRepository;
//	
//	@Autowired
//	private StepBuilder stepBuilder;
	
	// Create Reader
	@Bean
	public FlatFileItemReader<Customer> customerReader(){
		
		FlatFileItemReader<Customer> itemReader = new FlatFileItemReader<>();
		itemReader.setResource(new FileSystemResource("src/main/resources/customers.csv"));
		itemReader.setName("csv_reader");
		itemReader.setLinesToSkip(1); // To skip line no
		itemReader.setLineMapper(lineMapper()); // Passing object as each line after conversion
		
		return itemReader;
	}

	private LineMapper<Customer> lineMapper() {
		
		// Creating lineMapper
		DefaultLineMapper<Customer> lineMapper = new DefaultLineMapper<>();
		
		// Creating lineTokenizer
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(",");
		lineTokenizer.setStrict(false);
		lineTokenizer.setNames("id", "firstName", "lastName", "email", "gender", "contactNo", "country", "dob");
		
		// Creating fieldSetMapper
		BeanWrapperFieldSetMapper<Customer> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Customer.class);
		
		// Setting to lineMapper
		lineMapper.setLineTokenizer(lineTokenizer);
		lineMapper.setFieldSetMapper(fieldSetMapper);
		
		return lineMapper;
	}
	
	// Create Processor
	@Bean
	public CustomerProcessor customerProcessor() {
		
		// Data Processing Logic
		return new CustomerProcessor();
	}
	
	// Create Writer
	@Bean
	public RepositoryItemWriter<Customer> repositoryItemWriter(){
		
		RepositoryItemWriter<Customer> repositoryWriter = new RepositoryItemWriter<>();
		
		repositoryWriter.setRepository(customerRepository);
		repositoryWriter.setMethodName("save");
		
		return repositoryWriter;
	}
	
	// Create step
	 @Bean
	    public Step step(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
	        return new StepBuilder("csvStep", jobRepository)
	                .<Customer, Customer>chunk(10, transactionManager)
	                .reader(customerReader())
	                .processor(customerProcessor())
	                .writer(repositoryItemWriter())
	                .build();
	          
	    }
	 
		private TaskExecutor taskExecutor() {
			SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor();
			executor.setConcurrencyLimit(10);
			return executor;
		}
		
	// Create job
	  @Bean
	    public Job importJob(JobRepository jobRepository, Step step) {
	        return new JobBuilder("importJob", jobRepository)
	                .start(step)
	               .build(); 
	    }
	
	
}
