class Lab1Oldhelper extends Thread{
	@Override
	public void run() {
		System.out.println("in un metod of Lab1old Helper");
	}
}


public class Lab1Old {

	public static void main(String[] args) {
		Lab1Oldhelper Lab1Oldhelper=new Lab1Oldhelper();
		Lab1Oldhelper.start();

	}

}
