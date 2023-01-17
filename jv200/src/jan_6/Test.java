package jan_6;

public class Test {
	
	public static void main(String[] args) {
		int[] num = {6,7,8,40,200};
		int[] num2 = {1,2,3,4,5,6,7,8,9,40,60,100};
		int count = 0;
		for(int i = 0 ; i < num.length; i++) {
			for(int j = 0 ; j < num2.length ; j++) {
				if(num[i] == num2[j]) {
				count++;
				System.out.print("인덱스 값: " + num[i] + ": ");
				System.out.print("인덱스: " + i + ", ");
				}
			}
		}
		if((count == 0)) {
			System.out.println("별개");
		}
		else if((count == num.length)||(count == num2.length)) {
			System.out.println("포함");
		}
		else {
			System.out.println("중첩");
		}

	}
}
