package day4;

public class UseWatch {
	public static void main (String [] args) {
		String name = args[0];
		int price = Integer.parseInt(args[1]);
		String strapType = args[2];
		boolean isWaterProof = Boolean.parseBoolean(args[3]);
		int discountPercentage = Integer.parseInt(args[4]);
		int netPrice = price-(price*discountPercentage)/100;
		System.out.println("Brand = " + name + " " + "Netprice = " + netPrice );
		
	
		
	}

}


 class Watch {
	 String brand;
	 int price;
	 String strapType;
	 boolean isWaterProof;
	 int discountPercentage;
	 int netPrice;
 }