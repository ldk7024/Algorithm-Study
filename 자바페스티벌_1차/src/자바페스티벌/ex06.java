package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// 1. ������ �Է¹ޱ�
		// 2. 1�� �ڸ� �� Ȯ���ϱ�
		// 3. 1�� �ڸ� ���� �ݿø��� �������� �Ǵ��ϱ�
		// 4. ����� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: " );
        int num = sc.nextInt();
        
        if (num%10<5) {
        	System.out.println("�ݿø� ��"+(num-(num%10)));
        	}
        else {System.out.println("�ݿø� ��"+(num+(10-(num%10))));
        }
	
	
	
	
	}

}
