package waiting;


public class Waiting_list implements List{
	
	private int maxSize = 10;
	private Human[] queArray = new Human[maxSize];
	private int front = 0;
	private int rear = 0;
	private int count = 0;
	
	
	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public Human[] getQueArray() {
		return queArray;
	}

	public void setQueArray(Human[] queArray) {
		this.queArray = queArray;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	Human human = new Human();
	
	public boolean isEmpty() {
		boolean result = false;
		if(count ==0) {
			result = front == rear ? true : false;
		}else {
			result = false;
		}
		return result;
	}
	
	public boolean isFull() {
		boolean result = false;
		if(count !=0) {
			result = front == rear ? true : false;
		}
		return result;
	}
	
	public Human call() { // 대기 인원을 호출하는 함수
		Human tmp = new Human();
		if(isEmpty()) {
			System.out.println("대기자가 없습니다.");
		}else {
			tmp = queArray[rear % maxSize];
			front = (front+1) % maxSize;
			setCount(count-1);
			System.out.println(tmp + "님 창구로 오세요");
			age(human);
		}
		System.out.println();
		return tmp;
	}
	
	public void attend(Human human) {  // 대기자 명단에 추가하는 함수
		if(isFull()) {
			System.err.println("대기자가 가득 찼습니다. 더이상 추가 할 수 없습니다.");
		}else {
			rear = (rear+1) % maxSize;
			queArray[rear] = human;
			setCount(count+1);
			if(isFull()==false) {
				System.out.println(human +"님이 대기자 명단에 추가되었습니다.");
			}else {
				System.err.println("대기자가 가득 찼습니다. 더이상 추가 할 수 없습니다.");
			}
		}
		System.out.println();
	}

	@Override
	public void age(Human human) {
//		System.out.println(human.age);
		if(human.age > 20) {
			System.out.println("어서오세요");
		}else {
			System.out.println("보호자를 동반하세요.");
		}
	}
	
	
}
