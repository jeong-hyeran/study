package waiting;

public class Bank {
	public static void main(String[] args) {
		Waiting_list list = new Waiting_list();
		Human h1 = new Human("홍길동", 25);
		Human h2 = new Human("최민준", 15);
		Human h3 = new Human("김예준", 35);
		Human h4 = new Human("황도윤", 29);
		Human h5 = new Human("권지호", 40);
		Human h6 = new Human("이서현", 30);
		Human h7 = new Human("윤지유", 29);
		Human h8 = new Human("이주원", 32);
		Human h9 = new Human("정지민", 45);
		Human h10 = new Human("윤채원", 55);
		
		list.attend(h10);
		System.out.println("isEmpty : " + list.isEmpty());
		list.call();
		list.attend(h9);
		list.attend(h8);
		list.attend(h7);
		list.attend(h6);
		list.attend(h5);
		list.attend(h4);
		list.attend(h3);
		list.attend(h2);
		list.attend(h1);
//		System.out.println("isFull : " + list.isFull());
//		System.out.printf("대기자 총 %s 명 \n",list.getCount());
		
	}

}
