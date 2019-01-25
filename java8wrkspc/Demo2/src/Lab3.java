import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.LongSupplier;

public class Lab3 {
	public static void main(String[] args) {
		Consumer<String> scon = System.out::println;
		scon.accept("Simple single string");
		
		List<String> l1= new ArrayList<>();
		l1.add("aaa");
		l1.add("bbb");
		l1.add("ccc");
		l1.add("ddd");
		
		l1.forEach((item)->System.out.println(item));
		
		l1.forEach(System.out::println);
		
		Consumer<List<String>> listcon=(list)->{
			for(int i=0;i<l1.size();i++) {
				System.out.println(l1.get(i));
			}
		};
		listcon.accept(l1);

		IntPredicate even=(n)->n%2==0;
		System.out.println(even.test(10));
		System.out.println(even.test(13));
		
		
		LongSupplier ss=()->Calendar.getInstance().getTimeInMillis();
		System.out.println(ss.getAsLong());
	}

}
