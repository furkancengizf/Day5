package business.concreates;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import business.abstract.UserService;
import core.abstracts.LoggerService;
import dataAccess.abstract.UserDao;
import entities.concreates.User;

public class UserDao implements UserService{
  private UserDao UserDao;
  private LoggerService LoggerService;
  private ArrayList<String> E-mailList = new ArrayList<String>();
  
  public static boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	public static boolean isEmailValidOnClick() {
		return true;
	}
	
	public UserDao(UserDao userDao){
	
	this.userDao = userDao;
	}
	
  @Override
  public void Add(){
    
     if (E-mailList.contains(get.E-mail())){
     System.out.printlyn("Bu E-mail Zaten Başka Bir Kullanıcı Tarafından Kullanılıyor")
     return;
   }
   
     if(User.get.Password().length<5){
   System.out.printlyn("Şifre en az 6 karekter olmalıdır")
   return;
   
 }
   
    if (User.get.FirstName().length<2{
      System.out.printlyn("Kullanıcı Adı 2'Den Büyük Olmalıdır")
    }
    
    if (User.get.LastName().length<2{
       System.out printlyn("Kullanıcı Soyadı 2'Den Büyük Olmalıdır")
     }
   
    
    
  }
}