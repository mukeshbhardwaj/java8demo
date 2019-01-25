import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lab2 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(13);
		list.add(50);
		list.add(10);		
		list.add(9990);
		list.add(10898);
		list.add(10);
		System.out.println(list);
		
		Optional<Integer> opt=list.stream().min((n1,n2)->n1.compareTo(n2));
		if (opt.isPresent()) {
			int minint=opt.get();
			System.out.println(minint);
		}
		
	}
}
