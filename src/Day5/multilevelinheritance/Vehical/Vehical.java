package Day5.multilevelinheritance.Vehical;

public class Vehical {
	
	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.vehicleType();
		
		BMW m=new BMW();
		m.vehicleType();
		m.brand();
		m.speed();
		
		BMW800 m1=new BMW800();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
	}
		
	
	

}
