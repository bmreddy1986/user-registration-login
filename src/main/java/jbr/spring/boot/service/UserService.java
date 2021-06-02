package jbr.spring.boot.service;

import jbr.spring.boot.model.Login;
import jbr.spring.boot.model.User;


public interface UserService {

  void addUser(User user);

  User validateUser(Login login);
}
