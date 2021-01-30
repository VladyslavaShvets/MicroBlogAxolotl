package WWSIS.Microblog.dao;

import static org.junit.Assert.*;
//asercje czy potrzebne
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import WWSIS.Microblog.dao.*;
import WWSIS.Microblog.model.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)
public class TestFollowerDao {
		@Autowired
	    FollowerDao followerDAO;
		
		@Autowired
		PostDao postDao ;
	    
	    @Autowired
	    UserDao userDAO;
	    
	    
	    User newFollowed;

	    User newFollower;
	    
	    @Before
	    public void setUp () {
	    	this.newFollower = new User(0, null, null, null, null);
	        this.newFollower.userId = 33;
	        this.newFollower.email = "Myku@myk.com";
	        this.newFollower.password = "ll";
	        this.newFollower.userName = "Myk";

	        this.newFollower = new User(0, null, null, null, null);
	        this.newFollowed.userId = 34;
	        this.newFollowed.email = "Vlada@vl.com";
	        this.newFollowed.password = "kk";
	        this.newFollowed.userName = "Vlad";
	    }
	    

	    @Test
	    public void testAddFollower () {
	    	followerDAO.addFollower(newFollowed, newFollower);
	    }

	    @Test
	    public void deleteFollower () {
	    	followerDAO.deleteFollower(newFollowed, newFollower);
	    }
	    @Test
	    public boolean isFollowing() {
	    	return followerDAO.isFollowing(newFollowed, newFollower);
	    }
	    
    }