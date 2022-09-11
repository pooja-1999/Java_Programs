package com.user.register;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "registertable")
@EnableTransactionManagement
public class User 
{
	
	
	
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "token")
		private int token;


		@Column(name = "username")
		private String username;
		@Column(name = "password")
		private String password;
		 
		
		public User() {
			
		}


		public int getToken() {
			return token;
		}


		public void setToken(int token) {
			this.token = token;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}
		

		
	}
