package day4;

public class PrintFirstLetter {
	public static void main (String [] args) {
		String d[] = args[0].split(",");
		char l1 = d[0].charAt(0);
		char l2 = d[1].charAt(0);
		System.out.println(l1);
		System.out.println(l2);
	}

}
