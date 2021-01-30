package WWSIS.Microblog.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int userId;

	@Column(name="Name", nullable = false, unique = true)
	public String userName;
	
	@Column(name="BirthDate", nullable = false)
	private Date birthDate;

	@Column(name="Email", nullable = false, unique = true)
	public String email;
	
	@Column(name="Password", nullable = false)
	public String password;
	
	public User(int userID, String userName, Date birthDate, String email, String password){
		this.userId = userID;
		this.userName = userName;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
	}
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + userId + ", name=" + userName + ", email=" + email + ", password=" + password + "]";
	}
	
}