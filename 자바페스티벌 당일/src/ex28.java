import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �ݾ� �Է�:");
		int num = sc.nextInt();
		System.out.println("�ܵ�: "+num+"��");
		System.out.println("10000��"+num/10000+"��");
		System.out.println("5000��"+num%10000/5000+"��");
		System.out.println("1000��"+num%10000%5000/1000+"��");
		System.out.println("500��"+num%10000%5000%1000/500+"��");
		System.out.println("100��"+num%10000%5000%1000%500/100+"��");
				
	}

}
