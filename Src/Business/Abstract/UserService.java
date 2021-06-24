package Day5;
import java.util.List;

import entities.concreates.User;


public interface UserService{
  
  void Add(User user);
  List<User> getall;
  void logIn(String E-mail, String Password);
  
}