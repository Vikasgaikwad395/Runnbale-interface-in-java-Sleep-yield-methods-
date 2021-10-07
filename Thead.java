

class ChildThread extends Thread{
	public void run() {
		for(int i = 0; i < 5;i++) {
			System.out.println("This is ChildThread");
		}
	}
}
public class Thead {
			 public static void main(String[] args) {
				 ChildThread c = new ChildThread();
				 c.start();
				 
				 for(int i = 0;i < 5;i++) {
					 System.out.println("This is Thread Class");
				 }
			}
}
