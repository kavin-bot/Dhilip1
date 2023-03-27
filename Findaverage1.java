package day4;

public class Findaverage1 {
	public static void main(String [] args) {
		String k[] = args[0].split(",");
		int a = Integer.parseInt(k[0]);
		int b = Integer.parseInt(k[1]);
		int c= Integer.parseInt(k[2]);
		int d = Integer.parseInt(k[3]);
	    int e = Integer.parseInt(k[4]);
	    int f = (a+b+c+d+e)/5;
	    System.out.println(f);
	}

}
