package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import edu.esprit.game.utils.Data;

public class Level3 {
	public static void main(String[] args) {
	List<Employee> employees = Data.employees();

//1
		String names = employees.stream()
				.map(employee -> employee.getName())
				.reduce("", (acc, name) -> acc + " " + name);
		//2

		String namesMaj = employees.stream()
				.map(employee -> employee.getName())
				.map(String::toUpperCase)
				.collect(Collectors.joining("#"));
		//3
		Set<Employee> emps = employees.stream()
				.collect(Collectors.toSet());
//4
		TreeSet<Employee> emps2 = employees.stream().collect(Collectors.toCollection(TreeSet::new));

	/* TO DO 5: Retourner une Map qui regroupe les employ�s par salaire */
		Map<Integer, List<Employee>> map = employees.stream()
				.collect(Collectors.groupingBy(employee -> employee.getSalary(), Collectors.toList()));
//6
		/* TO DO 6: Retourner une Map qui regroupe les nom des employ�s par salaire */
		Map<Integer, String> mm = employees.stream().collect(Collectors.groupingBy(employee -> employee.getSalary(), Collectors.mapping(employee -> employee.getName(), Collectors.joining(", "))));
		;/*TO DO 6*/
//7
		IntStream salariesStream = employees.stream().mapToInt(Employee::getSalary);

		String s = "Min" + salariesStream.min().getAsInt() + ", "
				+ "Max " + salariesStream.max().getAsInt() + ", "
				+ "moy: " + salariesStream.average().getAsDouble() + ", "
				+ "somme: " + salariesStream.sum() + ", "
				+ "Count: " + salariesStream.count();

		System.out.println(s);

	}
}
