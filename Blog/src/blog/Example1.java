package blog;

import java.util.Scanner;

public class Example1 {
	
public static void main(String[] args) {
	
	String q = "�����߿��� �����ϴ� ������ �����ÿ�.\n"
			+ "����\n"
			+ "���\n"
			+ "������\n"
			+ "��\n(�����Ϸ��� x�Է�)";
	Scanner sc = new Scanner(System.in); 
	String choice = ""; // ���� �ʱ�ȭ
	 
	System.out.println(q); // ���� ���
	choice = sc.next(); // nextInt(); �� ����ϸ� ���ڸ� ���� �� ����.
	
			switch(choice)
			{
			case "����" : System.out.println("������ �����Ͽ����ϴ�."); break;
			case "���" : System.out.println("����� �����Ͽ����ϴ�."); break;
			case "������" : System.out.println("�����Ƹ� �����Ͽ����ϴ�."); break;
			case "��" : System.out.println("�踦 �����Ͽ����ϴ�."); break; // ��Ÿ������ break
			default : System.out.println("�߸� �Է��Ͽ����ϴ�."); 						
			}
	}
}