package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {

		Person p1 = new Person("������", 160, 54, "O��", 27);
		Person p2 = new Person("������", 120, 10, "B", 180);
		Person p3 = new Person("��浿", 180, 62, "AB��", 32);
		
		p1.addPerson(p1);
		p1.addPerson(p2);
		p1.addPerson(p3);
		p1.info();
		System.out.println("��1.");
			
		
	}
}

// �̸�, Ű, ������, ������, ����
class Person {
	private String name;
	private double height;
	private double weight;
	private String blood;
	private int age;
	
	private Person[] family;
	

// ������
	
	public Person(String name, double height, double weight, String blood, int age) {
		this.name =name;
		this.height = height;
		this.weight = weight;
		this.blood = blood;
		this.age = age;
		family = new Person[3];
		
		
	}
	
// �����ϴ� �޼ҵ�

	public void addPerson(Person person) {
		for (int i = 0; i < family.length; i++) {
			if (family[i] == null) { // ������ ����ִ��� Ȯ�� �� �� �ֱ�
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

// �������� �޼ҵ�
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
				System.out.println("�̸� : " + family[i].name + ", Ű : " + family[i].height + "������ : " + family[i].weight + ", ������ : " + family[i].blood + ", ���� : " + family[i].age);
			}
		}

		


}}