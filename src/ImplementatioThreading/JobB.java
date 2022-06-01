package ImplementatioThreading;

public class JobB implements Runnable {

	@Override
	public void run() {
for(int i=1;i<=10;i++) {
	System.out.println("yash..");
}
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
	}
	

}
