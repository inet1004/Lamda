package co.micol.lamda;
// 홀수 출력
public class OddTest implements Runnable{

	@Override
	public void run() {

		
		// 1-100 홀수만 출력
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
		
	}

}
