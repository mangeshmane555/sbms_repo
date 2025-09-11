package in.mane.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.mane.entity.Student;
import jakarta.transaction.Transactional;
@Repository
//public interface StudentRepository extends CrudRepository<entity_class_name, primary_key>
public interface StudentRepository extends JpaRepository<Student, Integer> {

	//Native Query
	@Query(value = "select * from student_dtls", nativeQuery = true)
	public List<Student> getAllStudents();
	
	//HQL
	@Query("from Student")
	public List<Student> getStudents();
	
	
	// select * from student_dtls where student_gender <= : rank;
	//public List<Student> findByGender(String gender);
	
//	select * from student_dtls where student_rank >= : rank;
	//public List<Student> findByRankGreaterThanEqual(Long rank);

//	select * from student_dtls where student_rank <= : rank;
	//public List<Student> findByRankLessThanEqual(Long rank);
	
//	select male students who have student_rank >= 100;
//	select * from student_dtls where student_gender = ? and student_rank >= 100 ;
	//public List<Student> findByGenderAndRankGreaterThanEqual(String gender, Long rank);
	 
//	select * from student_dtls where student_gender is null
	//public List<Student> findByGenderIsNull();

	// For Non Select operation using Data Jpa Custom Query use should use 2 Annotations @Modifying & @Transactional
	@Query("delete from Student where id = :sid")
	@Modifying
	@Transactional
	public void deleteStudent(Integer sid);
	
	@Modifying
	@Transactional
	@Query("update Student set rank = :rank where id= :sid")
	public void updateStudent(Integer sid, Long rank);
	
	@Modifying
	@Transactional
	@Query(value = "insert into student_dtls(student_id, student_name, gender, rank) values(:id, :gender, :name, :rank)", nativeQuery = true)
	public void insertStudent(Integer id, String name, String gender, Long rank);
	
	
}
