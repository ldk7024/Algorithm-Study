import java.util.Scanner;

public class exs13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자1입력  >>");
	int num1 = sc.nextInt();
	System.out.println("숫자2입력 >>");
    int num2 = sc.nextInt();
    int x=0;
    int sum=0;
    for(int i =1; i<=num2 ; i++) {
    	if(num1%i==0 && num2%i==0) {
    		x=i;
    		
    	}
    	
    	
    }
    	System.out.println("최대공약수"+x);
    	System.out.println("최소공배수"+(num1*num2)/x);
	}

}
