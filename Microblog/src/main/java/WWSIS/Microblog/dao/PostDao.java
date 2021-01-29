package WWSIS.Microblog.dao;

import java.util.List;

import WWSIS.Microblog.model.Post;


public interface PostDao {
	
	public List<Post> getUserPosts(int userId);
	
	public List<Post> getUserFeed(int userId);
	
	public List<Post> getPublicFeed();
	
	public void addUserPost(Post post);
}
