package dataAccess.abstracts;

import java.util.List;

import entities.concreates.User;

public interface UserDao{
  void add(User user);
  void update(User user);
  User get(int E-mail);
  List<User> getall();
  
}