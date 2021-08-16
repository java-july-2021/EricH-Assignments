package com.eric.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eric.Overflow.models.Answer;

@Repository
public interface aRepo extends CrudRepository<Answer, Long> {
	List<Answer> findAll();

}
