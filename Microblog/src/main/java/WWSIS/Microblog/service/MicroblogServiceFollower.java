package WWSIS.Microblog.service;

import java.util.List;

import WWSIS.Microblog.model.User;

public interface MicroblogServiceFollower {
	
	void addFollower(User ownerid, User userid);
	
	int deleteFollower(User ownerid, User userid);
	
	boolean isFollowing(User ownerid, User userid);

}
