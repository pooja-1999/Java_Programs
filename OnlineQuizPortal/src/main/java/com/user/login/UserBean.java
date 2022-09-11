package com.user.login;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "usertable")
@EnableTransactionManagement
public class UserBean 
{
	
	
	
		
		@Id
		@Column(name = "userid")
		private int userid;


		@Column(name = "username")
		private String username;
		@Column(name = "email")
		private String email;
		@Column(name = "PhoneNo")
		private String phoneNo;
		@Column(name = "City")
		private String city; 
		
		public UserBean() {
			
		}
		

		public int getUserid() {
			return userid;
		}


		public void setUserid(int userid) {
			this.userid = userid;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPhoneNo() {
			return phoneNo;
		}


		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}
		
		

		
	}



