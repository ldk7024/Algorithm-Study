import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������: ");
		int now = sc.nextInt();
		System.out.print("��ǥ������: ");
		int target = sc.nextInt();
		int week =1;
		while(now>target) {
		System.out.print(week+"���� ���� ������: ");
		int sum = sc.nextInt();
		week++;
		now-=sum;
		}
        System.out.println(now+"kg"+"�޼�!! �����մϴ�!");
	}

}
