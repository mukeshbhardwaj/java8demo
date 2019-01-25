public class Test{
	public static void main(String[] args) {
		Operation<Integer> add=(i,j)->i+j;
		System.out.println(add.process(20, 10));
		
		Operation<Integer> sub=(i,j)->i-j;
		System.out.println(sub.process(100, 20));
		
		Operation<String> addstr=(i,j)->i+j;
		System.out.println(addstr.process("mukesh ", "bhardwaj"));
	}
}

@FunctionalInterface
 interface Operation<T>
{
 public T process(T i,T j);
 
 default void  add() {	 
 }
 
 static void  add1() {	 
 }
}


/*class Add implements Operation{

	@Override
	public int process(int i, int j) {
		return i+j;
	}
	
}

class Sub implements Operation{

	@Override
	public int process(int i, int j) {
		return i-j;
	}
	
}*/