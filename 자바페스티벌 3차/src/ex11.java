
public class ex11 {

	public static void main(String[] args) {
		String[]names = {"Queen", "Tod", "kim"};
		System.out.println(findkim(names));

	}
	public static String findkim(String[] a) {
		String result = " ";
		for(int i =0 ; i<a.length; i++) {
			if((a[i]).equals("kim")) {
				result = "�輭���� " + (i+1) + "�� �ִ�.";
				
			}
			
		}
		return result;
	}

}
