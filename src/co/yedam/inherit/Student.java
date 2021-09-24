package co.yedam.inherit;

// People 상속 Student
public class Student extends People{
	private int studentNo;
	
	Student(String name, String ssn) {
		super(name,ssn); //부모클래스 호출
	}
	
	Student(String name, String ssn, int studentNo) {
		super(name,ssn); //super를 통해서 불러와야함 
		this.studentNo = studentNo;
		
	}
	
	public int getStudentNo() {
		return studentNo;
	}

	// overide
	@Override
	public void showInfo() {
		
		System.out.println("Name : " + super.getName() + ", SSN: " + this.getSsn() 
		+ ", SNO : " + this.getStudentNo());
		
		
	}

	//Student -> People -> Object(최상위 클래스)
	@Override
	public String toString() {
		return "학생 [이름 " + this.getName() + " 주민번호 " + this.getSsn() + " 학번 " + this.getStudentNo() + "]";
	}
	
	
}
