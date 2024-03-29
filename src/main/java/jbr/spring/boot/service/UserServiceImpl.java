package jbr.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.spring.boot.dao.UserRepository;
import jbr.spring.boot.model.Login;
import jbr.spring.boot.model.User;


public class UserServiceImpl implements UserService {

  @Autowired
  public UserRepository userRepo;

  public void addUser(User user) {
    userRepo.save(user);
  }

  public User validateUser(Login login) {
    return userRepo.findById(login.getUsername()).get();
  }

}
