package WWSIS.Microblog.service;

import java.util.List;
import WWSIS.Microblog.model.Follower;
import WWSIS.Microblog.model.User;
import WWSIS.Microblog.model.Post;

public interface MicroblogService {
	
	public List<Post> getUserPosts(int userId);
	
	public List<Post> getUserFeed(int userId);
	
	public List<Post> getPublicFeed();
	
	public void addUserPost(Post post);
}
