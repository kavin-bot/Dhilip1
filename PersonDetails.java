package day4;

public class PersonDetails {
	public static void main (String [] args) {
		String []z = args[0].split(",");
		String name =  z[0];
		int id = Integer.parseInt(z[1]);
		boolean isVaccinate = Boolean.parseBoolean(z[2]);
		long mobileNumber = Long.parseLong(z[3]);
		System.out.println("Name = " + name + " " + "Id = " + id + " " + " IsVaccinate = " + isVaccinate + " " + " MobileNumber = " + mobileNumber);
	}

}
