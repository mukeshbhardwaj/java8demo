
public class Lab1 {

	public static void main(String[] args) {
		Runnable r=()-> System.out.println("in main method Runnable created");
//Thread t=new Thread(()-> System.out.println("in main method thread created"));
		Thread t=new Thread(r);
t.start();
	}

}