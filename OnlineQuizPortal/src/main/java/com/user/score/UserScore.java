package com.user.score;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "userscore")
@EnableTransactionManagement
public class UserScore {
	
	
	
		
		
		
			
			@Id
			@Column(name = "userid")
			private int userid;


			@Column(name = "username")
			private String username;
			@Column(name = "score")
			private int score;
			@Column(name = "position")
			private int position;
			
			public UserScore() {
				
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

			public int getScore() {
				return score;
			}

			public void setScore(int score) {
				this.score = score;
			}

			public int getPosition() {
				return position;
			}

			public void setPosition(int position) {
				this.position = position;
			}
			

			
		

}
