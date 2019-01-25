import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lab1 {

	public static void main(String[] args) {

		Stream<String> str = Stream.of("a", "aaaa", "abb", "hfh", "ki", "g", "s");
		str.forEach(System.out::println);
		System.out.println("\n\n");
		str.forEach(System.out::println);

		List<String> list = Stream.of("a", "aaaa", "abb", "hfh", "ki", "g", "s").collect(Collectors.toList());
		list.stream().forEach(System.out::println);
		System.out.println("\n\n");
		list.stream().forEach(System.out::println);
	}
}