package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>(List.of(
				new Person("Fred", 20, "M" ),
				new Person("Scott", 23, "M" ),
				new Person("Maria", 34, "F" ),
				new Person("David", 28, "M" ),
				new Person("Morgan", 19, "F" ),
				new Person("Antonio", 20, "M" ),
				new Person("Julia", 40, "F" )
		));
		
		// filter
		List<Person> male = people.stream()
				.filter(person -> person.getGender().equals("M"))
				.collect(Collectors.toList());
		
		male.forEach(System.out::println);

	}

}
