package day4;

public class UseLaptop {
	public static void main (String [ ] args) {
		Laptop laptop1 = new Laptop();
		laptop1.brand = args[0];
		laptop1.price = Integer.parseInt(args [1]);
		laptop1.isTouchScreen = Boolean.parseBoolean(args[2]);
		
		
		Laptop laptop2 = new Laptop();
		laptop2.brand = args[3];
		laptop2.price = Integer.parseInt(args [4]);
		laptop2.isTouchScreen = Boolean.parseBoolean(args[5]);
		 
		System.out.println("Brand = " + laptop1.brand + " " + "Price = " + laptop1.price + " " + "TouchScreen = " + laptop1.isTouchScreen);
		System.out.println("Brand = " + laptop2.brand + " " + "Price = " + laptop2.price + " " + "TouchScreen = " + laptop2.isTouchScreen);
		
	}

}


 class Laptop {
	 String brand;
	 int price;
	 boolean isTouchScreen;
 }