package Capabilities;

import java.util.*;;

public class Main {

	public static void main(String[] args) {
		Driver d=new Driver();
		System.out.println("Select the car of which you want description audi/benz");
		Scanner kb=new Scanner(System.in);
		String s=kb.next();
		if(s.equalsIgnoreCase("audi"))
		d.drive(new Audi());
		else if(s.equalsIgnoreCase("benz"))
		d.drive(new Benz());
		else
		{
			System.out.println("please select a correct car");
		}

	}

}
