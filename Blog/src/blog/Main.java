//ctrl + shift + L  단축키 전체 목록 보기
//ctrl + '+','-' 폰트 크기 변경
//ctrl + D 한줄 삭제
//ctrl + alt + Down 행 단위 복사
//ctrl + shift + A 멀티 칼럼 편집(세로)
//alt + Up 행단위 이동 
//ctrl + i 자동 들여 쓰기
//ctrl + / 주석(토글)
//ctrl + space 자동완성
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
			System.out.println("Up & Down 게임입니다. 정답을 맞혀보세요. 기회는 5번입니다.");
			Random r = new Random();
			int k = r.nextInt(100); // 0~99까지의 임의의 정수 생성
			int n = 0;

			for (int i = 1; i <= 5; i++) 
			{
				System.out.print(i+">>");

				try {
					n = sc.nextInt(); // 숫자 입력

					if(n < 0 || n >99){
						System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
						i--;
						continue;
					}

					if(n == k) // 정답 시
					{
						System.out.println("축하드립니다 정답입니다.");
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
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					sc.next();
					i--;
					continue;
				}
			}

			if(n != k) 
			{
				System.out.println("아쉽습니다. 5회안으로 맞히지 못하였습니다.");
				System.out.println("정답은 "+k+" 였습니다.");
			}

			System.out.println("다시하시겠습니까?(y/n)");
			if(sc.next().equals("n"))
			{
				game = false;
				break;
			}
		}
		System.out.println("게임이 종료되었습니다.");
	}
}



