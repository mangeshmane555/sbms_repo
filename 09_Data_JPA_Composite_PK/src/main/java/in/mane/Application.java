package in.mane;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mane.entity.Account;
import in.mane.entity.AccountPK;
import in.mane.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		AccountRepository accountRepo = context.getBean(AccountRepository.class);
		
		/*
		// Set the data to the primary key first
		AccountPK pk = new AccountPK();
		pk.setAccId(2);
		pk.setAccType("Savings");
		pk.setAccNum(7800338l);
		
		// Set data to Account class with primary key
		Account ac = new Account();
		ac.setHolderName("Raju");
		ac.setBranch("Ameerpet");
		ac.setAccountPk(pk);
		
		accountRepo.save(ac);
		*/
		
		// Getting the data using composite primary key
		AccountPK pk = new AccountPK();
		pk.setAccId(2);
		pk.setAccType("Savings");
		pk.setAccNum(7800338l);
		
		Optional<Account> optional = accountRepo.findById(pk);
		Account account = optional.get();
		System.out.println(account.toString());
		
		
		
	}

}
