package com.example.demo1.Repository;

import com.example.demo1.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface StudentRepository extends CrudRepository<User, Long> {
}
