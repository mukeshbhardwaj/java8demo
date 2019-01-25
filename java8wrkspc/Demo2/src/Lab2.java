import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Lab2 {
/*
	int sqr(int a) {
		return a*a;
	}
	public int add(int a,int b) {
		System.out.println("add of a and b:"+(a+b));
		return a+b;
	}
	public int sub(int a,int b) {
		System.out.println("add of a and b:"+(a-b));
		return a-b;
	}
	public int mul(int a,int b) {
		System.out.println("add of a and b:"+(a*b));
		return a*b;
	}
	public int div(int a,int b) {
		System.out.println("add of a and b:"+(a/b));
		return a/b;
	}
	*/
	public static void main(String[] args) {
		Lab2 lab =new Lab2();
		UnaryOperator<Integer> sqr=(no)->no*no;
		BinaryOperator<Integer> add=(a,b)->a+b;
		BinaryOperator<Integer> sub=(a,b)->a-b;
		BinaryOperator<Integer> mul=(a,b)->a*b;
		BinaryOperator<Integer> div=(a,b)->a/b;
		System.out.println("square of the no is:"+sqr.apply(50));
		
		System.out.println(add.apply(10, 20));
		System.out.println(sub.apply(10, 20));
		System.out.println(mul.apply(10, 20));
		System.out.println(div.apply(10, 20));
		
		
//		lab.add(10, 20);
//		lab.sub(50, 10);
//		lab.mul(10, 20);
//		lab.div(50, 5);
	}
	
}
