package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<comment, Long>{

	void saveAndFlush(user user);

	void save(user user);
}
