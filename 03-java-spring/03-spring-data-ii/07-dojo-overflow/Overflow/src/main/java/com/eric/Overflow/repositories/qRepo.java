package com.eric.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eric.Overflow.models.Question;
import com.eric.Overflow.models.Tag;

@Repository
public interface qRepo extends CrudRepository<Question, Long> {
	List<Question> findAll();
	List<Question> findAllByTags(Tag tag);

}
