package jan_12.banking.service;

import java.util.Arrays;
import java.util.Random;

public class AccountNumberGenerator {
	int num1;
	int num2;
	
	public static String generateAccountNum() {
		int max = 9999;
		Random r = new Random();
		int result = 0;
		int[] nums = new int[2];
		for(int i = 0 ; i < 2; i++) {
			do {
				result = r.nextInt(max + 1);
				nums[i] = result;
			}while(result < 1000);
		}
//		StringBuilder sb = new StringBuilder();
//		
//		for(int j = 0; j < nums.length; j++) {
//			sb.append(nums[j]);
//			if(j < nums.length-1) {
//				sb.append("-");
//			}
//		}
		
		System.out.println(Arrays.toString(nums));
		return nums[0] + "-" + nums[1];
	
		
	}
	
	public static void main(String[] args) {
		String s = generateAccountNum();
		System.out.println(s);
	}
}
