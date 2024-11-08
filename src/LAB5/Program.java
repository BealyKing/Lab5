package LAB5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		Program program = new Program();
		program.go();
	}
	
	public void go() {
		DataStorage<Integer> arr = new DataStorage<Integer>(5);
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		
		
		arr.info();
		
		arr.remove(200);
		arr.remove(300);
		
		arr.info();
		
		
		
		
		DataStorage<Person> arrayPerson = new DataStorage<Person>(3);
		
		
		Person person1 = new Person("Maksim", 23);
		arrayPerson.add(person1);
		Person person2 = new Person("Vlad", 24);
		arrayPerson.add(person2);
		Person person3 = new Person("Vladimir", 30);
		arrayPerson.add(person3);
		
		arrayPerson.info();
		arrayPerson.remove(person3);
		arrayPerson.info();
	}

}
