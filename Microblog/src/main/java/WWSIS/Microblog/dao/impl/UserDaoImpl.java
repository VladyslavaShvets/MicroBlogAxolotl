package WWSIS.Microblog.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import WWSIS.Microblog.dao.UserDao;
import WWSIS.Microblog.model.User;

@Transactional
public class UserDaoImpl implements UserDao{
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public User getUserByLogin(String username) {
		String hql = "SELECT U.*, FROM user U " + 
				"WHERE u.UserName = :username ";
		
		Query query = entityManager.createQuery(hql);
		query.setParameter( "username" , username );
			
		return (User) query.getSingleResult();
	}

	@Override
	public void registerNewUser(User newuser) {
		String hql = "INSERT INTO user (UserName, BirthDate, UserPassword, UserEmail)"
				+ " VALUES (:name, :birthDate, :pass, :email) ";
		Query query = entityManager.createQuery(hql);	
		query.setParameter("name", newuser.getUserName());
		query.setParameter("birthDate", newuser.getBirthDate());
		query.setParameter("pass", newuser.getPassword());
		query.setParameter("email", newuser.getEmail());
		int userID = query.executeUpdate ();
	}

}
