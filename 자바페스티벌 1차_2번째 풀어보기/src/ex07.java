import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1�Է�>>");
		int num1 = sc.nextInt();
		System.out.print("����2�Է�>>");
		int num2 = sc.nextInt();
		int x=0;
        for (int i=1 ; i<=num1 ; i++ ) {
        	if(num1 % i ==0 && num2 % i ==0) {
        		x=i;
        	}
        
        }
        System.out.println("�ִ�����: "+  x);
        int num3 = num1*num2/x;
	    System.out.println("�ּҰ����:"+ num3);
	}

}
