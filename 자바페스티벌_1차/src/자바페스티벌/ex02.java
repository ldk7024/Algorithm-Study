package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("���ѽð��� �Է��ϼ��� :");
    int workhour = sc.nextInt();
    
    if(workhour<8) {
    	System.out.println("�� �ӱ��� "+ (workhour*5000)+"�� �Դϴ�.");
    }
    else {
    	System.out.println("�� �ӱ��� "+(int)((5000*1.5)*(workhour-8)+(5000*8))+"�� �Դϴ�.");
    }
	
	
	
	
	
	}
	}


