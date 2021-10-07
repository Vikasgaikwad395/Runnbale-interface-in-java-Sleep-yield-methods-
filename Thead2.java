class Child extends Thread{
	public void run() {
		System.out.println("Thread Started..........");
			for(int i = 0; i < 5; i++) {
				System.out.println("Hiiii..........");
			
			try {
			 Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}System.out.println("Thread Ended............");
	}
	}
	
}
public class Thead2 {
		public static void main(String[] args) {
			
			Child c = new Child();
			c.start();
		}
}
