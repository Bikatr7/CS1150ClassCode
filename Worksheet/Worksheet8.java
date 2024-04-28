
public class Worksheet8 
{

	   public static void main(String[] args) 
	   {
		
		SUV aFordSUV = new SUV("Ford");
		SportsCar aBMW = new SportsCar("BMW");
		SUV aChevySUV = new SUV("Chevy");

		System.out.println(aFordSUV.getManufacturer());
		System.out.println(aBMW.getManufacturer());
		System.out.println(aChevySUV.getManufacturer());
		
	   }

} //Worksheet8


class Automobile {
	
	private String manufacturer;
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

}

class SUV extends Automobile {
	
	public SUV(String manufacturer)
	{
		setManufacturer(manufacturer);
		
	}

}

class SportsCar extends Automobile {
	
	public SportsCar(String manufacturer)
	{
		setManufacturer(manufacturer);
		
	}

}


