package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {

		Person p1 = new Person("조은솔", 160, 54, "O형", 27);
		Person p2 = new Person("이정은", 120, 10, "B", 180);
		Person p3 = new Person("허길동", 180, 62, "AB형", 32);
		
		p1.addPerson(p1);
		p1.addPerson(p2);
		p1.addPerson(p3);
		p1.info();
		System.out.println("끝1.");
			
		
	}
}

// 이름, 키, 몸무게, 혈액형, 나이
class Person {
	private String name;
	private double height;
	private double weight;
	private String blood;
	private int age;
	
	private Person[] family;
	

// 생성자
	
	public Person(String name, double height, double weight, String blood, int age) {
		this.name =name;
		this.height = height;
		this.weight = weight;
		this.blood = blood;
		this.age = age;
		family = new Person[3];
		
		
	}
	
// 지정하는 메소드

	public void addPerson(Person person) {
		for (int i = 0; i < family.length; i++) {
			if (family[i] == null) { // 공간이 비어있는지 확인 후 값 넣기
				family[i] = person;
				break;
			}
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void wetHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setBlood(String blood) {
		this.name = blood;
	}

	public void setAge(int age) {
		this.age = age;
	}

// 가져오는 메소드
	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}

	public String getBlood() {
		return this.blood;
	}

	public int getAge() {
		return this.age;
	}
	
	public void info() {
		for(int i=0; i<family.length; i++) {
			if(family[i] != null) {
				System.out.println("이름 : " + family[i].name + ", 키 : " + family[i].height + "몸무게 : " + family[i].weight + ", 혈액형 : " + family[i].blood + ", 나이 : " + family[i].age);
			}
		}

		


}}