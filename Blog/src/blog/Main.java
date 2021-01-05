//ctrl + shift + L  ����Ű ��ü ��� ����
//ctrl + '+','-' ��Ʈ ũ�� ����
//ctrl + D ���� ����
//ctrl + alt + Down �� ���� ����
//ctrl + shift + A ��Ƽ Į�� ����(����)
//alt + Up ����� �̵� 
//ctrl + i �ڵ� �鿩 ����
//ctrl + / �ּ�(���)
//ctrl + space �ڵ��ϼ�
package blog;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean game = true;

		while(game)
		{
			System.out.println("Up & Down �����Դϴ�. ������ ����������. ��ȸ�� 5���Դϴ�.");
			Random r = new Random();
			int k = r.nextInt(100); // 0~99������ ������ ���� ����
			int n = 0;

			for (int i = 1; i <= 5; i++) 
			{
				System.out.print(i+">>");

				try {
					n = sc.nextInt(); // ���� �Է�

					if(n < 0 || n >99){
						System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
						i--;
						continue;
					}

					if(n == k) // ���� ��
					{
						System.out.println("���ϵ帳�ϴ� �����Դϴ�.");
						break;
					}
					else if(n < k) // Up
					{
						System.out.println("Up");
					}
					else //(n > k) Down
					{
						System.out.println("Down");
					}
				} 
				catch (InputMismatchException e) {
					System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
					sc.next();
					i--;
					continue;
				}
			}

			if(n != k) 
			{
				System.out.println("�ƽ����ϴ�. 5ȸ������ ������ ���Ͽ����ϴ�.");
				System.out.println("������ "+k+" �����ϴ�.");
			}

			System.out.println("�ٽ��Ͻðڽ��ϱ�?(y/n)");
			if(sc.next().equals("n"))
			{
				game = false;
				break;
			}
		}
		System.out.println("������ ����Ǿ����ϴ�.");
	}
}



