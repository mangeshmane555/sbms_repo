package in.mane.beans;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("User Dao : Constructor");
	}
}
