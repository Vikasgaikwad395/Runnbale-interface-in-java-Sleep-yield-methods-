
class GetSetThread extends Thread{
	public void run() {
		System.out.println("Child Thread...........");
	}
}


public class GetSet {

	public static void main(String[] args) {
			 	System.out.println(Thread.currentThread().getName());
			 	
		GetSetThread g = new GetSetThread();
		g.start();
		System.out.println(g.getName());
		g.setName("ThunderBird");
		System.out.println(g.getName());
		
		
		GetSetThread g1 = new GetSetThread();
		g1.start();
		System.out.println(g1.getName());
		g1.setName("Stark");
		System.out.println(g1.getName());
	}

}
