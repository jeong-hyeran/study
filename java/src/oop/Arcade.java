package oop;

import java.util.Stack;

public class Arcade{
	
	// 필드
	private String name;
	private boolean open;
	private boolean music;
	private int music_volume;
	private Stack<String> musicList = new Stack<String>();

	private static int asset;
	private static String musicName;
	
	private final int MAX_VOLUME = 100; 
	private final int MIN_VOLUME = 1;
	

	public Arcade() {
		music = true;
		open = true;
		musicList.push("Arcade 노래");
		musicName = musicList.peek();
		toString();
		
	}
	


	//getter setter(메서드)
	public static String getMusicName() {
		return musicName;
	}
	
	public static void setMusicName(String musicName) {
		Arcade.musicName = musicName;
	}

	
	public Stack<String> getMusicList() {
		return musicList;
	}


	public void setMusicList(Stack<String> musicList) {
		this.musicList = musicList;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean isMusic() {
		return music;
	}

	public void setMusic(boolean music) {
		this.music = music;
	}

	public int getMusic_volume() {
		return music_volume;
	}

	public void setMusic_volume(int music_volume) {
		this.music_volume = music_volume;
	}

	public static int getAsset() {
		return asset;
	}

	public static void setAsset(int asset) {
		Arcade.asset = asset;
	}

	public static String getMesicName() {
		return musicName;
	}

	public static void setMesicName(String mesicName) {
		Arcade.musicName = mesicName;
	}

	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}

	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}
	
	//메서드
	public void open() { // 가게의 영업여부를 알려줌
		open = !open;
		if(open) {
			System.out.println("가게 영업 중");
		}else {
			System.out.println("가게 영업 종료");
		}
	}
	public void musicOnOff() { // 음악 재생 여부
		music = !music;
		if(music) {
			System.out.println("음악 재생");
		}else {
			System.out.println("음악 종료");
		}
	}
	public void musicVolumeUp() { // 음악볼륨 증가
		if(music && music_volume <= MAX_VOLUME) {
			++music_volume;
			System.out.println("음악볼륨이 1 커졌습니다. 현재 볼륨 : " + music_volume);
		}else {
			System.out.println("최대음량입니다.");
		}
	}
	public void musicVolumeDown() { // 음악볼룸 감소
		if(music && music_volume >= MIN_VOLUME) {
		--music_volume;
		System.out.println("음악볼륨이 1 작아졌습니다.현재 볼륨 : " + music_volume);
		}else {
			System.out.println("최소볼륨입니다");
		}
	}
	public Stack<String> musicAdd(String a){ //음악추가
		musicList.push(a);
//		System.out.println(musicName + "이 음악목록에 추가되었습니다.");
		return musicList;
	}
	public String currentMusicName(){ //현재 노래 제목을 반환
		musicName = musicList.peek();		
		return musicName;
	}
	public String nextMusic(){ // 다음 노래를 재생
		musicList.pop();
		musicName = musicList.peek();		
		return musicName;
	}
	
	@Override
	public String toString() {
//		currentMusicName();
		String format = "(%s) %s - 현재 %s 재생 중";
		Object[] args = {open ? "영업중" : "영업끝", name, musicName }; // 여기에 뮤직이름이 현재 재생중인 음악이 오게 하려면..?
		return String.format(format, args);
	}

//	public String toString (int answer, int count, int answerCount) {
//		String format = "정답 : %s (%s번 시도)  - 총 %s번 맞췄습니다.";
//		Object[] args = {answer, count, answerCount };
//		return String.format(format, args);
//	}

}


