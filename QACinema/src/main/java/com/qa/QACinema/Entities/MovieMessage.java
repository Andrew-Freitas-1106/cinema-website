package com.qa.QACinema.Entities;

import java.sql.Date;
import java.time.LocalTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MovieMessage {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
	
	@Temporal(TemporalType.TIME)
	private java.util.Date creationDate;
	private String text;
	
	
	public MovieMessage() {
		
	}

	public MovieMessage(Long id, String text, User creator, Date creationDate) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.text = text;
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	

}
