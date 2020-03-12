package clientAndMain;

import Delegator.BuissnessDelegator;

public class Main {

	public static void main(String[] args) {
		
		BuissnessDelegator dele=new BuissnessDelegator();
		dele.setServiceType("Oneservice");
		
		Client cli=new Client(dele);
		cli.execute();
	}

}
