import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.print("���������: ");
     int now = sc.nextInt();
     System.out.print("��ǥ������: ");
     int target = sc.nextInt();
     int week = 0;
      while(target<now) {
    	week++;
    	System.out.print(week + "���� ���� ������: ");
    	int num = sc.nextInt();
    	now-=num;
    	 }
	   System.out.println(now + "kg �޼�!! �����մϴ�!");
	}

}
