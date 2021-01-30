package WWSIS.Microblog.dao;

import WWSIS.Microblog.model.*;

public interface FollowerDao {

	void addFollower(User ownerid, User userid);
	
	int deleteFollower(User ownerid, User userid);
	
	boolean isFollowing(User ownerid, User userid);
	
}