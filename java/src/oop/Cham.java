package oop;

import java.util.Random;
import java.util.Scanner;

public class Cham extends Arcade{
	
	final static String[] answer = { "좌", "우", "중"};  //(좌,우,중)이 담길 배열
	static int answerCount = 0; //(참참참을 해서 맞춘 횟수)
	static int count = 1; //(시도 횟수)

	
	public Cham(String name) {
		super();
		setName(name);
		setAsset(getAsset()+100);
	}
	
	

	public static int getAnswerCount() {
		return answerCount;
	}

	public static void setAnswerCount(int answerCount) {
		Cham.answerCount = answerCount;
	}


	public String[] getAnswer() {
		return answer;
	}

	public void game() {
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();
		int index = ran.nextInt(2);
		String cham = answer[index];
		
		while (true) {
			System.out.print("[좌, 우, 중] 하나를 입력하세요 : ");
			String st = sc.nextLine();
		
			if(!cham.equals(st)) {
				count++;
			System.out.println("다시 입력하세요");	
			}else {
				setAnswerCount(answerCount+1);
				System.out.printf("정답입니다.\n%d회 만에 정답을 맞추셨습니다.",count);
				break;
			}
			
		}
		sc.close();
	}

	
	
}
