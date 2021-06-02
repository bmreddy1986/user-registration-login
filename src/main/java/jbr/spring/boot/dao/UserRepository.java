package jbr.spring.boot.dao;

import org.springframework.data.repository.CrudRepository;

import jbr.spring.boot.model.User;


public interface UserRepository extends CrudRepository<User, String> {

}
