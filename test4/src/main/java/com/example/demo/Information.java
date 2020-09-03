package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="information")
public class Information {
    @Id
    private Integer id;
    
    private String name;
    
    private Integer age;
    
    public Integer getId() {
        return id;
    }
	public String getName() {
		return name;
	}
	public Integer getage() {
		return age;
	}
}