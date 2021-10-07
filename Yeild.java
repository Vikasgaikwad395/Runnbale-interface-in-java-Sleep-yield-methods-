
class DeolaThread extends Thread{
	public void run() {
		for(int i = 0; i<5; i++) {
			Thread.yield();
			System.out.println("Bahubali........");
		}
	}
}


public class Yeild {

	public static void main(String[] args) {
			DeolaThread d = new DeolaThread();
			d.start();
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Main Thread");
			}
			
	}

}
