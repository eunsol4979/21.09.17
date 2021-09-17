package co.yedam.lesson;
/*
 	실행클래스(메인) + 라이브러리용 클래스 여러개 = 하나의 프로그램으로 구성
 	객체 구성(학생, 선생님, 반) -> 객체 지향 언어
 	학생(객체) -> 학생(클래스)
 	조은솔 -> new 학생() : 인스턴스 생성.
 */
public class LessonExample {
	public static void main(String[] args) {

		Teacher t1 = new Teacher("홍길동", "국사");

		Student s1 = new Student("김소영", "010-1111", "대구 중구");
		Student s2 = new Student("정혜윤", "010-2222", "대구 서구");

		// 선생님 1, 학생 여러명
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3학년 1반");
		l1.addStudent(s1);
		l1.addStudent(s2);

		Teacher t2 = l1.getTeacher();
		System.out.println("선생님 이름 : " + t2.getName());
		System.out.println("선생님 과목 : " + l1.getTeacher().getMajor());
	
		l1.showStudents();
	}

}

// 선생님 1 - 학생 담을 클래스
class Lesson {
	private Teacher teacher;
	private String group; // 선생님의 반정보 ex) 3-1
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
			if (students[i] == null) { // 공간이 비어있는지 확인 후 값 넣기
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
			if(students[i] !=null) { // 정보가 있어야 가지고 옴
			System.out.println("학생 이름 : " + students[i].getStudentName() 
					+ ", 연락처 : " + students[i].getPhone() + ", 주소 : "
					+ students[i].getAdress());

		}}
	}
}

// 학생이름, 연락처, 학생주소
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

//선생님 이름, 과목
class Teacher {
	// 필드
	private String name;
	private String major;

	// 생성자
	// Teacher t1 = new Teacher(); -> 공간만드는 걸 인스턴스 생성.
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}

	// 메소드
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