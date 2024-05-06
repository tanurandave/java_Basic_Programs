package javaPrograms;

public class Thread_Example_1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    Thread_Example_1 thread = new Thread_Example_1();
			    thread.start();
			    System.out.println("This code is outside of the Thread");
			  }
			  public void run() {
			    System.out.println("This code is running in a Thread");
			  }
			
	

}
