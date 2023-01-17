package jan_16;

import java.util.Set;
import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0f));
		set.add("second");
		set.add(new Integer(4));

		System.out.println(set);
		//중복이 허용이 안되며 순서가 작성한대로 나오지 않는다
	}
}
