package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n �Է�:");
		int num = sc.nextInt();
		
		// ��µǴ� ������ ����ϰ� ���� ����
		int sum =1;
		for (int i = 1 ; i<=num ; i++) {
			System.out.print(sum+ " ");
		   sum+=i;   // 1-> 2 -> 4 -> 7 ������ ���� �ʿ�
		}

	}

}
