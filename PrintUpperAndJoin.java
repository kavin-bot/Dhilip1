package day4;

public class PrintUpperAndJoin {
	public static void main (String [] args) {
	String []k = args[0].split(",");
	String u1 = k[0].toUpperCase();
	String u2 = k[1].toUpperCase();
	String join = u1.concat(u2);
	System.out.println(join);
	}

}
