package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class ex09_ä���ν�_Ǯ�̹�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� >> ");
		int input = sc.nextInt();
		
		// 2�κ��� �����ؼ� ��� ���� �ٲ� �� �ֽ��ϴ�.	
	    for(int i = 2 ; i<= input ; i++) {
	    	while(input%i ==0) {
	    		input /= i;
	    		System.out.print(i);
	    		if(i<input) {System.out.print("*");
	    		}
	    	}
	    }	
	
	
	}

}
