package �ڹ��佺Ƽ��_2��;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N�Է�: ");
		int count = sc.nextInt();
		System.out.println("x�Է�: ");
		int num = sc.nextInt();
		int su[] = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + "��° ���� �Է� >> ");
			int j = sc.nextInt();
			if (j < num) {
				su[i] = j;
			} else {
				su[i] = 0;
			}
		}
		System.out.print("��� >> ");
		for (int i = 0; i < su.length; i++) {
			if (su[i] > 0) {
				System.out.print(su[i] + " ");

			}

		}

	}

}
