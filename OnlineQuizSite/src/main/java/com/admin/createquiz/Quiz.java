package com.admin.createquiz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "quizormtable")
@EnableTransactionManagement
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "qno")
	private int id;


	@Column(name = "quizid")
	private int quizid;
	@Column(name = "fk_questionid")
	private int questionid;
	
	
	public Quiz() {
		
	}
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getQuizid() {
		return quizid;
	}


	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}


	public int getQuestionid() {
		return questionid;
	}


	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	
	
}
