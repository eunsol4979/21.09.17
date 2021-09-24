package co.yedam.inherit;

// People ��� Student
public class Student extends People{
	private int studentNo;
	
	Student(String name, String ssn) {
		super(name,ssn); //�θ�Ŭ���� ȣ��
	}
	
	Student(String name, String ssn, int studentNo) {
		super(name,ssn); //super�� ���ؼ� �ҷ��;��� 
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

	//Student -> People -> Object(�ֻ��� Ŭ����)
	@Override
	public String toString() {
		return "�л� [�̸� " + this.getName() + " �ֹι�ȣ " + this.getSsn() + " �й� " + this.getStudentNo() + "]";
	}
	
	
}
