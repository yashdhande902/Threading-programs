package ExtendsThreading;

public class Job2 extends Thread {
	public void run(){
		for(int i=12;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+"  hello..."+i);
		}
}}
