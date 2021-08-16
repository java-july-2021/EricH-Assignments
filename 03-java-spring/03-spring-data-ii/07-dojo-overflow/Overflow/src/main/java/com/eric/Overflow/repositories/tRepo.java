package com.eric.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eric.Overflow.models.Tag;
import com.eric.Overflow.models.Question;

@Repository
public interface tRepo extends CrudRepository<Tag, Long> {
	List<Tag> findAll();
	List<Tag> findAllByQuestions(Question question);
	boolean existsBySubject(String subject);
	Tag findBySubject(String subject);
	
}
