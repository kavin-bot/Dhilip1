package day4;

public class StringPerformance {
	public static void main (String [] args) {
		String s[] = args[0].split("-");
		String u3 = s[2].toUpperCase();
		String u4 = s[3].toUpperCase();
		System.out.println(u3.concat(u4));
		System.out.println(s[0].endsWith("e"));
		System.out.println(s[2].length());
		System.out.println(s[1].charAt(0));
		System.out.println(s.length);
		
		
		
		
		
		
		
	}

}
