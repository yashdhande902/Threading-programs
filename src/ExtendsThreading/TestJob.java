package ExtendsThreading;

public class TestJob {

	public static void main(String[] args) {
Job1 obj1=new Job1();
Job2 obj2=new Job2();

obj1.setName("JOBA");
obj2.setName("JOBB");		

obj1.start();//calling at a time
obj2.start();

System.out.println(Thread.currentThread().getName()+" bye");
	}

}
