package lookup;

import services.BusinessService;
import services.Oneservice;
import services.OtherService;
import services.TwoService;

public class BusinessLokkUp {

	
	
 public  BusinessService getService(String service) {
		
		if(service.equalsIgnoreCase("Oneservice")) {
		
			return new Oneservice();
		}
		if(service.equalsIgnoreCase("TwoService")) {
			
			return new TwoService();
			
		}
		else
			
			return new OtherService();
	}
	
	
}
