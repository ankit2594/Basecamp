package Capabilities;

public class Driver 
{
		public void drive(Car c)
		{
			c.maxSpeed();
			c.average();
			c.price();
			if(c instanceof Audi)
			{
				((Audi)c).gps();
			}
		}
}
