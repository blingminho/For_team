package kdata.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//�л� ������ �����ϴ� Class
//list�� 1���� �����ǵ���
public class StudentManager {
	private static List<Student> list;

	public StudentManager() {
		if (list == null) {
			list = new ArrayList<>();
		}
	}

	// �л� ���� �߰� �޼ҵ�
	public void add(Student std) {

	}

	public void add(int num, String name) {
		// list.get(new Student(num, name));//??
	}

	public void add() {
		boolean duplicated = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("1-1) �л��̸��Է�");
		String name = sc.nextLine();

		System.out.println("1-2) �й��Է�");
		try {
			int num = sc.nextInt();
			for (Student student : list) {
				if (student.equals(new Student(num, name)) || student.getNum() == num) {
					duplicated = true;
					System.out.println("�л������� �ߺ��˴ϴ�.");
				}
			}
			if (duplicated == false) {
				list.add(new Student(num, name));
			}
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
		System.out.println("1-3) �л��Է��� �Ϸ�Ǿ����ϴ�.");
	}

	// �л� ����Ʈ ��� �޼ҵ�
	public void pirnt() {
		// �й� �̸�
		// --------------
		// for��
		System.out.println("�й� �̸� �ּ� ��ȭ��ȣ ���� ���� ���� ���� ���");
		System.out.println("------------------------");
		Collections.sort(list);
		Iterator<Student> std = list.iterator();
		while (std.hasNext()) {
			Student s = std.next();
			System.out.println(s.getNum() + "\t\t" + s.getName());
		}

	}

	public void end() {
	}

}
