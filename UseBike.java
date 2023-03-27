package day4;

public class UseBike {
	public static void main (String [] args) {
		String []a = args[0].split(",");
		Bike bike1 = new Bike();
		bike1.bikeName = a[0];
		bike1.price = Integer.parseInt(a[1]);
		bike1.color = a[2];
		
		String []b = args [1].split(",");
		Bike bike2 = new Bike();
		bike2.bikeName = b[0];
		bike2.price = Integer.parseInt(b[1]);
		bike2.color = b[2];
		System.out.println("Brand = " + bike1.bikeName + " " + " Price = " + bike1.price + " " + "BikeColour = " + bike1.color);
		System.out.println("Brand = " + bike2.bikeName + " " + " Price = " + bike2.price + " " + "BikeColour = " + bike2.color);

		
	}

}


   class Bike {
	   String bikeName;
	   int price;
	   String color;
	   
   }