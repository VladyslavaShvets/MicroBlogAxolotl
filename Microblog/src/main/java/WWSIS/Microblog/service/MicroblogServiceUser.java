package WWSIS.Microblog.service;

import java.util.List;

import WWSIS.Microblog.model.User;

public interface MicroblogServiceUser {
	
	User getUserByLogin(String username);
	
	void registerNewUser(User newuser);

}
