package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		list.add(0, "JoaoPaulo");
		list.add(0, "JoaoPaulo");
		System.out.println(list.size());

		// list.remove("Anna");

		list.remove(0);
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------");

		list.removeIf(x -> x.charAt(0) == 'M'); // remoção por predicado
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("----------------");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("----------------");
		List<String> list1 = new ArrayList<>();

		list1.add("Maria");
		list1.add("Alex");
		list1.add("Bob");
		list1.add("Anna");
		System.out.println("----------------");
		list1.add(2, "Marco");
		list1.add(0, "JoaoPaulo");

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
	}



}