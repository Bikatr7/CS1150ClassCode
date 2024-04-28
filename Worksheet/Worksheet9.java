public class Worksheet9 
{

	public static void main(String[] args) 
	{
		Automobile9[] cars = new Automobile9[5];

		cars[0] = new SUV9("Ford");
		cars[1] = new SUV9("Chevy");
		cars[2] = new SUV9("Toyota");
		cars[3] = new SUV9("BMW");
		cars[4] = new SUV9("Audi");
		
		for(int i = 0; i < cars.length; i++)
		{
			System.out.println(cars[i].getManufacturer());
		}
	}

}

class Automobile9 
{
	private String manufacturer;

	public Automobile9(String manufacturer) 
	{
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() 
	{
		return manufacturer;
	}
}

class SUV9 extends Automobile9
{

	public SUV9(String manufacturer) 
	{
		super(manufacturer);
	}
}

class SportsCar9 extends Automobile9
{

	public SportsCar9(String manufacturer) 
	{
		super(manufacturer);
	}
}
