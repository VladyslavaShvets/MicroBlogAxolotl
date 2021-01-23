package WWSIS.Microblog.dao;

import WWSIS.Microblog.model.Post;
import org.json.JSONArray;

public interface PostDao {
	
	public JSONArray getUserPosts(int userId);
	
	public JSONArray getUserFeed(int userId);
	
	public JSONArray getPublicFeed(int userId);
	
	public void addUserPost(Post post);
}
