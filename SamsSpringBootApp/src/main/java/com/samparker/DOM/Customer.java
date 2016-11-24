package com.samparker.DOM;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="customers")
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long customerId;
	
	@Column(name="firstName")
	private String firstName;

	@Column(name="lastName")
	private String lastName;
	
	protected Customer(){};
	
	@JsonCreator
	public Customer(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	};
	
	@JsonIgnore
	public Long getId(){
		return this.customerId;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	@Override
	public String toString(){
		return String.format("Id: %s, FirstName: %s, LastName %s", this.customerId, this.firstName, this.lastName);
	}
	
}
