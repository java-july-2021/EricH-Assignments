package com.eric.LanguageProj.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.eric.LanguageProj.models.Language;

@Repository
public interface LanguageRepo extends CrudRepository<Language, Long> {
	 // this method retrieves all the books from the database
    List<Language> findAll();
 
}
