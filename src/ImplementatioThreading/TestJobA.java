package ImplementatioThreading;

public class TestJobA {

	public static void main(String[] args) throws InterruptedException  {

JobA obj1=new JobA();
JobB obj2=new JobB();

obj1.run();//only run method acces//no start and get method not accessible
//if want to access start method then use thread object
Thread t1=new Thread(obj1);//new state
Thread t2=new Thread(obj2);

t1.setPriority(10);
t2.setPriority(1);

t1.start();//ready to run state
t2.start();

t1.join();
t2.join();
	}

}
