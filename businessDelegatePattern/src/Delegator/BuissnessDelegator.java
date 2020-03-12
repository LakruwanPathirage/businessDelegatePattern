package Delegator;

import lookup.BusinessLokkUp;
import services.BusinessService;

public class BuissnessDelegator {

	private BusinessLokkUp lookup=new BusinessLokkUp();
	private BusinessService ser;
	
	public void setServiceType(String type) {
		
		this.ser=lookup.getService(type);
	}
	public void run() {
		ser.process();
	}
	
	
}
