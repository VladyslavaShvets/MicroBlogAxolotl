package WWSIS.Microblog.dao.impl;

import WWSIS.Microblog.dao.PostDao;
import WWSIS.Microblog.model.Post;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


@Transactional
public class FollowerDaoImpl implements PostDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Post> getUserPosts(int userId) {
		String hql = "SELECT P.*, FROM Post P " +
					 "WHERE P.userId = :userId " +
					 "ORDER BY P.date DESC";
		Query query = entityManager.createQuery(hql);
		query.setParameter( "userId" , userId );
		List<Post> results = query.getResultList();
		return results;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Post> getUserFeed(int userId) {
		String hql = "SELECT P.* FROM Post P " +
					 "INNER JOIN User U ON U.userId = P.userId " + 
					 "WHERE U.userId = :userId AND " + 
					 "(U.userId IN (SELECT F.followedUserId FROM Followed F " +
					 "INNER JOIN User ON F.userId = User.userId " +
					 "WHERE P.userId = :userId))" +
					 "ORDER BY P.date";		
		Query query = entityManager.createQuery(hql);
		query.setParameter( "userId" , userId );
		List results = query.getResultList();
		return results;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Post> getPublicFeed() {
		String hql = "SELECT P.* FROM Post P " +
					 "WHERE P.isPublic = TRUE " +
					 "ORDER BY P.date DESC";
		Query query = entityManager.createQuery(hql);
		List results = query.getResultList();
		return results;
	}
	
	public void addUserPost(Post post) {
		String hql = "INSERT INTO Post (UserId, PostText, Public, PostedDate) VALUES (?, ?, ?, ?)";
		Query query = entityManager.createQuery(hql);
		query.setParameter( 1 , post.getUserId() );
		query.setParameter( 2 , post.getPostText() );
		query.setParameter( 3 , post.getIsPublic() );
		query.setParameter( 4 , post.getDate() );
		query.executeUpdate();
	}
}

