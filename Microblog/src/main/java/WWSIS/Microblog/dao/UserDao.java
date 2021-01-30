package WWSIS.Microblog.dao;

import WWSIS.Microblog.model.*;

public interface UserDao {
	
	User getUserByLogin(String username);
	
	void registerNewUser(User newuser);
	
}