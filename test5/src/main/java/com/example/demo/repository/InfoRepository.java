package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Info;

@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {

}