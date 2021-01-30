package WWSIS.Microblog.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import WWSIS.Microblog.dao.FollowerDao;
import WWSIS.Microblog.dao.PostDao;
import WWSIS.Microblog.dao.UserDao;
import WWSIS.Microblog.model.User;

public class TestServiceFollower {

	@Autowired
    MicroblogServiceFollower followerService;
	
	@Autowired
	MicroblogService postService ;
    
    @Autowired
    MicroblogServiceUser userService;
    
    
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
    	followerService.addFollower(newFollowed, newFollower);
    }

    @Test
    public void deleteFollower () {
    	followerService.deleteFollower(newFollowed, newFollower);
    }
    @Test
    public boolean isFollowing() {
    	return followerService.isFollowing(newFollowed, newFollower);
    }

}
