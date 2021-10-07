
class InterfaceRunnable implements Runnable{
	public void run() {
		for(int i = 0; i<5;i++) {
			System.out.println("Interface Runnable");
		}
		
	}
}
public class MyRunnable{
		public static void main(String[] args) {
			
			for(int i=0;i<5;i++) {
				System.out.println("Runnable Thread");
			}
			
			InterfaceRunnable i = new InterfaceRunnable();
			Thread t = new Thread(i);
			t.start();
			
			
			
		}
}