package core.concreates;

import core.abstracts.LoggerService;
import jGoogleCustomerValid.jGoogleManager;

public class LoggermanagerAdapter implements LoggerService {
 
	@Override
	public void logToSystem(String message) {
		
		jGoogleManager googleManager=new jGoogleManager();
		googleManager.log(message);
		
	}

}