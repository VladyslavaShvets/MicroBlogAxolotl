package WWSIS.Microblog.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import WWSIS.Microblog.dao.PostDao;

public class TestService {

	@Autowired
	MicroblogService postService ;
	
	
	@Before
	public void setUp () {		
	}
	
	@Test
	public void getUserPosts() {
		assertEquals(1, postService.getUserPosts(0).size());
		assertEquals(4, postService.getUserPosts(5).size());
		assertEquals("Dzień dobry", postService.getUserPosts(1).get(0).getPostText());
		assertEquals(0, postService.getUserPosts(999).size());	
	}
	
	@Test
	public void getUserFeed() {
		assertEquals("ABC7", postService.getUserFeed(5).get(0).getPostText());
		assertEquals(7, postService.getUserFeed(2).size());
		assertEquals(0, postService.getUserFeed(999).size());
	}

	@Test
	public void getPublicFeed() {
		assertEquals(9, postService.getPublicFeed().size());
		assertEquals("abcd", postService.getPublicFeed().get(8).getPostText());
		assertEquals("ABC7", postService.getPublicFeed().get(0).getPostText());
	}

}
