package kdata.manager;

import java.util.Scanner;
import java.util.stream.Stream;

public class StudentManagerTest {

	public static void main(String[] args) {
		//1. �л����� �߰�
		//2. �л� ����Ʈ �̸����� ��������
		//3. �˻�
		//4. ����
		//5. ��ü ����
		//6. �ְ�����
		//7. ��������
		//8. ����
		
		//managerClass���� ��¹� �����ϵ��� mvc
		
		

		// TODO Auto-generated method stub
		// 1. �л� ���� �߰�
		// Ű���� 1���� ������ ���� Student��ü ����
		// Ű���� 1���� ������ StudentManager��ü�� add��� + while(true){}��� + 3�������� break;

		// 2. �л� ����Ʈ �̸����� �������� ���� �� ���
		// Ű���� 2���� ������ ����??

		// 3. ����
		// Ű���� 3���� ������ ����
		// �����ϴ� ���?

		// sc.nextLine(); 1���� ���ڿ� �б�
		// sc.next(); 1�ܾ��� ���ڿ� �б�
		// sc.nextInt(); int�� �б�

		// ���ǹ�(if, switch)���� 1,2,3 Ȯ��
		// +@ : Student��ӹ޾Ƽ� �а� �����Ҽ��� ����??
		// +@ : �̸����� �˻�, ��ȣ�� �˻�
		// +@ : �ʵ尪(�л��̸�)���� ����
		

		StudentManager studentManager = new StudentManager();
		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (num != 3) {
			System.out.println("1.�л��߰�\t\t 2.�л��������\t\t 3.����");
			try {
				num = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("���� 1,2,3�� �ϳ��� �Է����ּ���");
				// TODO: handle exception
			}
			if (num == 1) {
				System.out.println("1.�л������� �Է��մϴ�.");
				studentManager.add();
			} else if (num == 2) {
				System.out.println("2.�л������� ����մϴ�.");
				studentManager.pirnt();
			} else if (num == 3) {
				System.out.println("3.���α׷��� �����մϴ�.");
				studentManager.end();
			}

		}
		sc.close();
	}

}

// Scanner�� main�޼ҵ忡���� �����->mvc, ��ü���� �ʿ��� �����ʹ� �Ű������� ����.

// Stream<T> a = new Stream<T>();//StreamApi ã�ƺ���
