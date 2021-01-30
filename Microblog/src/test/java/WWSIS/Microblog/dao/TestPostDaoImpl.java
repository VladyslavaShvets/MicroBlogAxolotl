package WWSIS.Microblog.dao;
import static org.junit.Assert.*;

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

@RunWith (SpringJUnit4ClassRunner. class )
@ContextConfiguration (locations={ "classpath:applicationContext-test.xml" })
@Transactional
@Rollback ( true )
public class TestPostDao {
	
	@Autowired
	PostDao postDao ;
	
	@Autowired
	UserDao userDao ;
	
	@Before
	public void setUp () {		
	}
	
	@Test
	public void getUserPosts() {
		assertEquals(1, postDao.getUserPosts(0).size());
		assertEquals(4, postDao.getUserPosts(5).size());
		assertEquals("Dzień dobry", postDao.getUserPosts(1).get(0).getPostText());
		assertEquals(0, postDao.getUserPosts(999).size());	
	}
	
	@Test
	public void getUserFeed() {
		assertEquals("ABC7", postDao.getUserFeed(5).get(0).getPostText());
		assertEquals(7, postDao.getUserFeed(2).size());
		assertEquals(0, postDao.getUserFeed(999).size());
	}

	@Test
	public void getPublicFeed() {
		assertEquals(9, postDao.getPublicFeed().size());
		assertEquals("abcd", postDao.getPublicFeed().get(8).getPostText());
		assertEquals("ABC7", postDao.getPublicFeed().get(0).getPostText());
	}
}