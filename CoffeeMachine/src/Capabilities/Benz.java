package Capabilities;

public class Benz extends Car
{

	@Override
	public void maxSpeed() {
		System.out.println("Max speed: 250-350 km/hr");
		
	}

	@Override
	public void price() {
		System.out.println("price: 25 Lakh-95 Lakh");
		
	}

	@Override
	public void average() {
		System.out.println("Max speed: 25 km/Litre");
		
	}
 
}
