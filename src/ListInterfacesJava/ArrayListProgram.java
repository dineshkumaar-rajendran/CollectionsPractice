package ListInterfacesJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListProgram {

	public static void method() {
		ArrayList<Object> ar = new ArrayList();
		ar.add("Dinesh");
		ar.add("Rajesh");
		ar.add("Kumaar");
		ar.add("Ganesh");
		ar.add("Dinesh");

		System.out.println(ar.contains("Rajesh"));
		System.out.println(ar.indexOf("Dinesh") <= 0);
		//System.out.println(ar.lastIndexOf("Dinesh Kumaar")); // True = exact value false =-1
		System.out.println("O"+ ar.remove("Rajesh"));
		System.out.println("Remove "+ar);

		ArrayList<Object> cloneList = (ArrayList<Object>) ar.clone();

		System.out.println(cloneList);
		
		ArrayList<Integer> aro = new ArrayList<Integer>(Arrays.asList(1,2,4,5,7,8,9,0));
		aro.removeIf(num -> num%2==0);
		System.out.println(aro);
		
		

		Iterator itr = ar.iterator();

		while (itr.hasNext()) {
			Object temp = itr.next();
			// System.out.println(temp);

		}

		Employee emp1 = new Employee("Dinesh", 26, "CTS");
		Employee emp2 = new Employee("Saran", 22, "Delivery");
		Employee emp3 = new Employee("Nive", 26, "Service");

		Employee emp4 = new Employee("Dinesh", 26, "CTS");
		Employee emp5 = new Employee("Saran", 22, "Delivery");
		Employee emp6 = new Employee("Nive", 24, "Service");

		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);

		ArrayList<Employee> arr1 = new ArrayList<>();
		arr1.add(emp4);
		arr1.add(emp5);
		arr1.add(emp6);

		// arr1.addAll(arr);

		Iterator<Employee> itrr = arr1.iterator();

		while (itrr.hasNext()) {
			Employee Temp = itrr.next();
			/*
			 * System.out.println(Temp.name); System.out.println(Temp.age);
			 * System.out.println(Temp.dept);
			 */

		}
		System.out.println("###############");
		// arr1.removeAll(arr);

		for (int i = 0; i < arr1.size(); i++) {
			/*
			 * System.out.println(arr1.get(i).name); System.out.println(arr1.get(i).age);
			 * System.out.println(arr1.get(i).dept);
			 */ }
		System.out.println("###############");

		for (int i = 0; i < arr1.size(); i++) {
			/*
			 * System.out.println("I "+arr1.get(i).name);
			 * System.out.println("R "+arr1.get(i).age);
			 * System.out.println("I "+arr1.get(i).dept);
			 */
		}

	}

	public static void main(String[] args) {
		method();
	}

}
