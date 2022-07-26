import java.util.ArrayList;

public class Validation {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("mirudula@gmail.com");
		list.add("gokul1@gmail.com");
		list.add("arun12@gmail.com");
		list.add("rohit7@gmail.com");
		
		System.out.println(list);
		
		String searchstr = "arun142@gmail.com";
		System.out.println("\nSearch mailid:" + searchstr);
		
		if(list.contains(searchstr)) {
			System.out.println("\nMailId is Found");
		}
		else {
			System.out.println("\nMailId is Not Found");
		}
	}

}
