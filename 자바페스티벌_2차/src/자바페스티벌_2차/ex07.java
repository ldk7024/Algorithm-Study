package �ڹ��佺Ƽ��_2��;

import java.util.Random;

public class ex07 {

	public static void main(String[] args) {
      // ���� ����ϱ�
      Random rd = new Random();
      
      //�ζ� ��ȣ�� ���� �迭
      int lotto[] = new int[6];
	
      for(int i = 0 ; i<lotto.length; i++) {
    	  lotto[i] = rd.nextInt(45)+1;
    	  
    	  // �ߺ��Ǵ� ���� �ִ��� ������ �Ǵ��ϴ� �ݺ���
    	  for(int j = 0 ; j< i ; j++) {
    		  if(lotto[i] == lotto[j]) {
    			  i--;
    			  break;
    		  }
    	  }
      }
	
	// Ȯ���� ���� for�� ���
    for(int i =0 ; i<lotto.length ; i++) {
    	System.out.println("����� ����: "+lotto[i]);
    }	
	
	
	
	
	
	
	
	
	}

}
