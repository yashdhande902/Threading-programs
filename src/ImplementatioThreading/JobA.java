package ImplementatioThreading;

public class JobA implements Runnable {

	@Override
	public void run() {
for(int i=5;i<=10;i++) {
	System.out.println("hiii>> ");
}
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	

}
