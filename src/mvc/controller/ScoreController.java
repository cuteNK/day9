package mvc.controller;
import java.util.Scanner;
public class ScoreController {

	public static void main(String[] args) {
//		�л� �����͸� �Է� �޾Ƽ� StudentVO ��ü�� ���� (���� �л� ����: �ݺ���)
//		������ StudentVO ��ü�� ArrayList�� �߰�
		Scanner s1 = new Scanner(System.in);	// ���ڿ�
		Scanner s2 = new Scanner(System.in);	// ����
		
		System.out.println("* �л����� ������ �Է¹޽��ϴ�.");
		while (true) {
			System.out.print("* ���� �Է�: ");
			String name = s1.nextLine();
			System.out.println("* �й� �Է�: ");
			int stuID = s2.nextInt();
			
			System.out.print("* ����ؼ� ���� �л��� ������ �Է��Ͻðڽ��ϱ�?(y/n): ");
			String msg = s1.nextLine();
			if(msg.equals("n") || msg.equals("no"))
				break;
			
		}

	}

}
