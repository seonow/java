package jan_5;

public class PrimitiveArray {
	public static void main(String[] args) {
		int[] ages;
		ages = new int[5];
		ages[0] = 19;
		ages[1] = 28;
		ages[2] = 54;
		ages[3] = 34;
		ages[4] = 45;
		
		int[] ages2 = new int[] {19, 28, 54, 34, 45};
		for(int i = 0 ; i < ages.length; i++) {
			System.out.println("[" + i + "] = " + (ages[i] == ages2[i]));
		}
	}
}
