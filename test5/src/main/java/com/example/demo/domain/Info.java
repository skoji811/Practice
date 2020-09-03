package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // ①
public class Info{
    @Id // ②
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ③
    private Long id;
    private String name;
    private Integer age;
    private String blood;
    private String birthplace;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }
    public String getBirthplace() {
        return birthplace;
    }
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Override
    public String toString() {
        return "Info [id=" + id + ", name=" + name + ", age=" + age + ", blood=" + blood + ", birthplace=" + birthplace + "]";
    }
}