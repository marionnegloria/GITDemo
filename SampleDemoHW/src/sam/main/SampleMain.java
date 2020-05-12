package sam.main;

import sam.method.SampleMethods;
import sam.obj.SampleObject;

public class SampleMain {

	public static void main(String[] args) {
		
		SampleMethods sm = new SampleMethods();
		SampleObject so = new SampleObject();
		so.setfName("Milan");
		so.setlName("Dog");
		so.setOutString("Hello");
		
		
		System.out.println(sm.printHelloWorld(so.getfName(), so.getlName(), so.getOutString()));

	}

}
