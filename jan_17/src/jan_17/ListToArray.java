package jan_17;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("math");
		list.add("english");
		list.add("history");
		list.add("physics");
		
		String[] subjects = list.toArray(new String[list.size()]);
		for(String subject : subjects) {
			System.out.println(subject);
		}
	}
}
