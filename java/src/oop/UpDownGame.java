package oop;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame extends Arcade{
	
	private int answer = 0 ; //(랜덤 함수로 만든 정답)
	private static int answerCount = 0 ; //(업다운 게임을 해서 정답을 맞춘 횟수)
	private static int count = 1 ; //(시도 횟수)
	
	public UpDownGame(String name) {
		super();
		setName(name);
		setAsset(getAsset()+100);
	}

	public static int getAnswerCount() {
		return answerCount;
	}

	public static void setAnswerCount(int answerCount) {
//		answerCount ++;
		UpDownGame.answerCount = answerCount;
	}
	


	public void game() {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int num = 0;
		answer = ran.nextInt(100)+1;
		while (true) {
			
			
			System.out.print("숫자를 입력하세요 : ");
			String st = sc.nextLine();
			num = Integer.parseInt(st);

		
			if(answer > num) {
				System.out.println(num + "보다 UP");
				count++;
			}else if(answer < num) {
				System.out.println(num + "보다 DOWN");
				count++;
			}else {
				setAnswerCount(answerCount+1);
				System.out.printf("정답 : %s (%s번 시도)  - 총 %s번 맞췄습니다.",answer, count, answerCount);
				break;
			}
			
		}

			sc.close();
			
	
	
	}				

}
