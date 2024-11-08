package LAB5;

import java.util.Objects;

public class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	   // Переопределение метода equals() для корректного сравнения объектов
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, age);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person {name: " + name + ", age: " + age + " }"; 
	}
	
}
