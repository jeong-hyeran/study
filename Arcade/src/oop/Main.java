package oop;


public class Main {

	public static void main(String[] args) {
	
		
		Arcade a = new Arcade();

		
		UpDownGame ud = new UpDownGame("업다운");
		System.out.println(ud.getName());
		System.out.printf("가게 게임기 총 비용 %,d만원 \n", a.getAsset());
		System.out.println(ud);
		ud.game();
		System.out.println(ud.currentMusicName());
		
		Cham ch = new Cham("참참참");
		System.out.println(ch.getName());
		System.out.printf("가게 게임기 총 비용 %,d만원 \n", a.getAsset());
		System.out.println(ch);
		
		ch.game();
		
		
	}

}



