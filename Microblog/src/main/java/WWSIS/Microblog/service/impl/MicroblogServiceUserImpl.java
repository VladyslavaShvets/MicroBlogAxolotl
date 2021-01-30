package WWSIS.Microblog.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import WWSIS.Microblog.model.User;
import WWSIS.Microblog.service.MicroblogServiceUser;

@Service
public class MicroblogServiceUserImpl implements MicroblogServiceUser{
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
