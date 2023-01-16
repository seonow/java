package jan_16;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		list.add("second");
		list.add(new Integer(4));

		System.out.println(list);
		//중복이 허용되며 순서가 작성한대로 나온다
	}
}
