package WWSIS.Microblog.dao;
import static org.junit.Assert.*;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import WWSIS.Microblog.model.Follower;
import WWSIS.Microblog.model.User;
import WWSIS.Microblog.dao.impl.UserDaoImpl;


@RunWith (SpringJUnit4ClassRunner. class )
@ContextConfiguration (locations={ "classpath:applicationContext-test.xml" })
@Transactional
@Rollback ( true )

public class TestUserDaoImpl {
	@Autowired
	UserDao userDAO ;
	
	@Autowired
	User newUser ;
	
	@Before
	public void setUp () {

	}
	
	@Test
	public void getUserByLogin_shouldReturnUsername() {
		Date regData = new Date();
		User newUser = new User(1, "vvv", regData, "vvv@mail.com", "pass123");
		UserDaoImpl testUser = new UserDaoImpl();
		assertEquals(testUser.getUserByLogin(newUser.userName), newUser);
		
	}
	
	@Test
	public void registerNewUser_shouldCreateUser() {
		UserDaoImpl testUser = new UserDaoImpl();
	
	}

}