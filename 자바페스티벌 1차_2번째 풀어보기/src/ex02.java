import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ѽð��� �Է��ϼ���: ");
		int weekhour = sc.nextInt();
		if (weekhour<8) {
			System.out.println("�� �ӱ���"+weekhour*5000);
		}
		else {
			System.out.println("���ӱ���: "+ (int)((5000*1.5)*(weekhour-8)+(5000*8)));
		}
	}

}
