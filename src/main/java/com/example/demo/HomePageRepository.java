package com.example.demo;

import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomePageRepository extends JpaRepository<HomePageData,Long> {

	void saveAndFlush(user userdatamodel);

	void deleteByName(String name);







	

	

}
