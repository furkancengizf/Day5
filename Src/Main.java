import business.abstracts.CustomerService;
import business.concreates.CustomerManager;
import core.concreates.LoggermanagerAdapter;
import dataAccess.concreates.HiberNateCustomer;
import entities.concreates.Customer;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HiberNateUser(),new LoggermanagerAdapter());
		User user = new User("furkan", "cengiz", "furkan@gmail.com","123456");
		User user1 = new User("Kullancı2", "Kullancı2", "Kullancı2@gmail.com","123456");
		User user = new User("Kullancı3", "Kullancı3", "Kullancı3@gmail.com","123456");
		User user = new User("Kullancı4", "Kullancı4", "Kullancı4@.","123456");
		User user= new User("Kullancı5", "Kullancı5", "Kullancı5@gmail.com","1");
		
		
		userService.add(user);
		userService.add(user1);
		userService.add(user2);
		userService.add(user3);
		userService.add(user4);
		
		customerService.logIn("furkan@gmail.com","123456");

	}

}