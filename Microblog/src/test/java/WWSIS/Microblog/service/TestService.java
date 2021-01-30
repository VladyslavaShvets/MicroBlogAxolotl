package WWSIS.Microblog.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import WWSIS.Microblog.dao.PostDao;

public class TestService {

	@Autowired
	PostDao postDao ;
	
	
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
