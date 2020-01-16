package co.micol.lamda;

public class ThreadTest {
	public static void main(String[] args) {
		// 두 함수가 번갈라서 반복 수행함.
		// 스레드 생성 홀수
		// 객테생성과 생성 ->익명클래스로 만들어 부모인터페이스 이름으로->람다식으로 줄임
		// 아래 한줄이 람다 표현식임
		Thread t1 = new Thread(() -> { //new Runnable(타입){ run(){바디} }  바디와 타입만 가져온경우
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 1) {
					System.out.print(i + ", ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});// 객체선언 생성->;
		t1.start();
		Thread t2 = new Thread(() -> {
			// 1~100 짝수만 출력
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0) {
					System.out.print(i + ", ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t2.start();
	}

}

//익명 클래스
//class InnerOddTask implements Runnable {
//
//	@Override
//	public void run() {
//
//		// 1-100 홀수만 출력
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 1) {
//				System.out.print(i + ", ");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//	}
//
//}