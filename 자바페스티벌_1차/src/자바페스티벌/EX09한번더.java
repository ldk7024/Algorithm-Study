package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class EX09�ѹ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	      System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
	      int num = sc.nextInt();
	      int div = 2;

	      System.out.print(num + " = ");

	      while(num>=div) {                     //�Էµ� ���ڰ� �������� ���ں��� ũ�Ű� ���� ������ �ݺ�

	         if(num%div == 0) {                      //���� ������ �������� ��

	            if(num != div) {               //���� �Էµ� ���ڿ� �������� ���ڰ� ���� �ٸ� ���
	               System.out.print(div + "*");   //������ �������� �� ���ڿ� *�� ���
	            }else {
	               System.out.print(div);         //������ �������� �� ���ڸ� ���
	            }

	            num = num/div;                  //������ �ִ� num ���� ���� �����Ѵ�. EX) ���� 24/2==0 �� ��, �� ���� ���� 12�� num�� ����
	            div = 1;                     //div�� �ٽ� 1�� ������ �ڿ� div++�� ���� �ٽ� 2���� ������������� Ȯ���� ��Ų��
	            }

	         div++;                           //if���� ���ǿ� �������� ������ �״�� div ���� 1�� �������� �ݺ��ȴ�
	         }

	}

}
