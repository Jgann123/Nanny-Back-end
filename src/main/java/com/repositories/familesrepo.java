package com.repositories;
import com.models.Families;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface familesrepo extends MongoRepository<Families,String> {
    
 public Families findByFirstName(String firstName);
  public List<Families> findByLastName(String lastName);

}