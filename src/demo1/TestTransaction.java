package demo1;

public class TestTransaction {

	public static void main(String[] args) {
Transaction t1=new Transaction();
Transaction t2=new Transaction();

t1.setName("gpay");
t2.setName("Phone pe");


t1.start();
t2.start();
	
	
	} 

}
