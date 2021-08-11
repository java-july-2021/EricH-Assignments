package com.eric.dojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eric.dojo.models.Ninja;


@Repository
public interface nRepo extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();

}
