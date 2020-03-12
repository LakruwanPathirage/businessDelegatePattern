package clientAndMain;

import Delegator.BuissnessDelegator;

public class Client {
	
	private BuissnessDelegator BusDele;
	
	
	public Client(BuissnessDelegator buDel) {
		this.BusDele=buDel;
	}
	public void execute() {
		BusDele.run();
	}

}
