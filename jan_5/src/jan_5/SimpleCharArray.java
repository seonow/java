package jan_5;

public class SimpleCharArray {

	public static void main(String[] args) {
		SimpleCharArray sa = new SimpleCharArray();
		char[] characters = sa.createArray();
		sa.printArray(characters);
	}
	
	//배열 26개 만든 배열 출력
	
	//a에서 z까지 문자 26개를 가진 char배열 리턴
	public char[] createArray() {
		char[] s = new char[26];
		for(int i = 0 ; i < s.length ; i++) {
			s[i] = (char)('A' + i);
		}
		return s;
	}
	
	//전달된 배열의 원소를 출력
	public void printArray(char[] array) {
		System.out.print("[");
		for(int i = 0 ; i < array.length; i++) {
			System.out.print(array[i]);
			if((i + 1) < array.length) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}
	
	
//	public static void main(String[] args) {
//		char[] charArr;
//		charArr = new char[26];
//		
//		for(int i = 0 ; i < charArr.length; i++) {
//			System.out.println("[" + i + "] = " + (charArr[i] = (char)(65+i)));
//		}
//	}
//}

