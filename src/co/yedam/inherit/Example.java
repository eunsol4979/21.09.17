package co.yedam.inherit;

public class Example {
	public static void main(String[] args) {

		People p1 = new People("Hong", "20200101-1234567");
		System.out.println("�̸� : " + p1.getName());
		System.out.println("��ȣ : " + p1.getSsn());
		p1.showInfo();
		System.out.println(p1.toString());
		
		System.out.println("--------------");
		
		Student s1 = new Student("Park", "20210101-1234567");
		System.out.println("�̸� : " + s1.getName());
		System.out.println("��ȣ : " + s1.getSsn());
		s1.showInfo();
		System.out.println(s1.toString());
		
		System.out.println("--------------");

		Student s2 = new Student("Choi", "20210202-1234567",110);
		System.out.println("�̸� : " + s2.getName());
		System.out.println("��ȣ : " + s2.getSsn());
		System.out.println("�л���ȣ : " + s2.getStudentNo());
		s2.showInfo();
		
		System.out.println("--------------");
		
		People p2 = new Student("Hwang", "20210202-1234567",120);
//		p1 = new Student("Choi", "20210202-1234567",110);
		
//		p2.getStudentNo(); �θ�Ŭ���� ���� �ڽ�Ŭ������ �޼ҵ� ȣ�� �Ұ���.
		Student s3 = (Student)p2; //�ٿ�ĳ������ ��ĳ���õ� �θ� Ŭ������ ����
		s3.getStudentNo();
		
		if(p1 instanceof Student) {
			Student s4 = (Student) p1;
			s4.getStudentNo();
		} else {
			System.out.println("����ȯ �� �� �����ϴ�");
		}
		
		
		
	}
}
