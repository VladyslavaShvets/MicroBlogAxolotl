package WWSIS.Microblog.dao.impl;

import WWSIS.Microblog.dao.PostDao;
import WWSIS.Microblog.model.Post;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


@Transactional
public class PostDaoImpl implements PostDao {
	
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
		String hql = "SELECT P.postText FROM Post P, User U " +
					 "WHERE P.userId = userId AND " + 
					 "(U.userId IN (SELECT userId FROM " +
					 "";		
		Query query = entityManager.createQuery(hql);
		List results = query.getResultList();
		return results;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Post> getPublicFeed(int userId) {
		String hql = "SELECT P.postText FROM Post P";
		Query query = entityManager.createQuery(hql);
		List results = query.getResultList();
		return results;
	}
	
	@SuppressWarnings({ "unused", "rawtypes" })
	public void addUserPost(Post post) {
		String hql = "SELECT P.postText FROM Post P";
		Query query = entityManager.createQuery(hql);
		List results = query.getResultList();
	}

}

