import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("�ѱݾ� �Է�: ");
     int all = sc.nextInt();
     System.out.println("�ܵ� "+all+"��");
	 System.out.println("10000��: "+ all/10000+"��");
	 System.out.println("5000��: "+ all%10000/5000+"��");
	 System.out.println("1000��: "+ all%10000%5000/1000+"��");
	 System.out.println("500��: "+ all%10000%5000%1000/500+"��");
	 System.out.println("100��: "+ all%10000%5000%1000%500/100+"��");
	
	
	
	
	}

}
