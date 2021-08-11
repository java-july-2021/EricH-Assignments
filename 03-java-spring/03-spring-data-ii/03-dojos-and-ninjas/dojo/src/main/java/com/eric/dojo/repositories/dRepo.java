package com.eric.dojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eric.dojo.models.Dojo;


@Repository
public interface dRepo extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();

}
