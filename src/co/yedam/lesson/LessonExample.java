package co.yedam.lesson;
/*
 	����Ŭ����(����) + ���̺귯���� Ŭ���� ������ = �ϳ��� ���α׷����� ����
 	��ü ����(�л�, ������, ��) -> ��ü ���� ���
 	�л�(��ü) -> �л�(Ŭ����)
 	������ -> new �л�() : �ν��Ͻ� ����.
 */
public class LessonExample {
	public static void main(String[] args) {

		Teacher t1 = new Teacher("ȫ�浿", "����");

		Student s1 = new Student("��ҿ�", "010-1111", "�뱸 �߱�");
		Student s2 = new Student("������", "010-2222", "�뱸 ����");

		// ������ 1, �л� ������
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3�г� 1��");
		l1.addStudent(s1);
		l1.addStudent(s2);

		Teacher t2 = l1.getTeacher();
		System.out.println("������ �̸� : " + t2.getName());
		System.out.println("������ ���� : " + l1.getTeacher().getMajor());
	
		l1.showStudents();
	}

}

// ������ 1 - �л� ���� Ŭ����
class Lesson {
	private Teacher teacher;
	private String group; // �������� ������ ex) 3-1
	private Student[] students;

	public Lesson() {
		students = new Student[3];
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setGroup(String group) {
		this.group = group;

	}

	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) { // ������ ����ִ��� Ȯ�� �� �� �ֱ�
				students[i] = student;
				break;
			}
		}
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public String getGroup() {
		return this.group;
	}

	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			if(students[i] !=null) { // ������ �־�� ������ ��
			System.out.println("�л� �̸� : " + students[i].getStudentName() 
					+ ", ����ó : " + students[i].getPhone() + ", �ּ� : "
					+ students[i].getAdress());

		}}
	}
}

// �л��̸�, ����ó, �л��ּ�
class Student {
	private String studentName;
	private String phone;
	private String address;

	public Student(String stuedentName, String phone, String address) {
		this.studentName = stuedentName;
		this.phone = phone;
		this.address = address;
	}

	public void setStudentName(String name) {
		this.studentName = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getAdress() {
		return this.address;
	}
}

//������ �̸�, ����
class Teacher {
	// �ʵ�
	private String name;
	private String major;

	// ������
	// Teacher t1 = new Teacher(); -> ��������� �� �ν��Ͻ� ����.
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}

	// �޼ҵ�
	public void setName(String name) {
		this.name = name;

	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getName() {
		return this.name;
	}

	public String getMajor() {
		return this.major;
	}
}