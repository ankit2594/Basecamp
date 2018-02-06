package Capabilities;

public class Audi extends Car
{

	@Override
	public void maxSpeed() {
		System.out.println("Max speed: 200-300 km/hr");
		
	}

	@Override
	public void price() {
		System.out.println("price: 25 Lakh-90 Lakh");
		
	}

	@Override
	public void average() {
		System.out.println("Max speed: 20 km/Litre");
		
	}
	public void gps()
	{
		System.out.println("It has gps navigation system also");
	}

}
