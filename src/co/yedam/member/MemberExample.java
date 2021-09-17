package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {

		Member m0 = new Member("user1"); // ������ ȣ��
		Member m1 = new Member("Luna", "�����", "�뱸 �߱� ���ϵ�");
		m1.showInfo();
		
//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "������";
		m1.setName("ȫ�浿");
//		m1.address = "�뱸 �߱� ���ϵ�";
		m1.setAddress("�뱸 �߱� ���ϵ�");
//		System.out.println("���̵� : " + m1.memberId);
		System.out.println("���̵� : " + m1.getMemberId());
//		System.out.println("�̸� : " + m1.name);
		System.out.println("�̸� : " + m1.getName());
		System.out.println("�ּ� : " + m1.getAddress());
		
		Member m2 = new Member("user2");
		m2.showInfo();
		
		Member m3 = new Member("user3","�ȳ�","�뱸 �ϱ� �ȳ絿");
		m3.showInfo();
//		m3.name = "�ڱ浿";
		m3.setName("�ڱ浿");
		m3.showInfo();
		
		
	}
}



class Member {
	// user1(���̵�), ȫ�浿(�̸�), �뱸 �߱� ���ϵ�(�ּ�)

	private String memberId;
	private String name;
	private String address;

	// ������ : �ʵ� �� �ʱ�ȭ
	public Member() {
		memberId = "user1";
		name = "������";
		address = "�뱸 �߱� ���ϵ�";
	}
	
	public Member(String mId) {
		memberId = mId;
	}
	
	public Member(String mId, String n, String a) {
		memberId = mId;
		name = n;
		address = a;
	}
	
	// private ��ü �޼ҵ� ����
	public void setMemberId(String mId) {
		memberId = mId;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAddress(String a) {
		address = a;
	}
	
	// ���� ��ȯ���ִ� �޼ҵ� ����
	public String getMemberId() {
		return memberId; // ��ȯ �ʵ� : ���̵�
	}
	
	public String getName( ) {
		return name; // ��ȯ �ʵ� : �̸�
	}
	
	public String getAddress() {
		return address; // ��ȯ �ʵ� : �ּ�
	}
	
	// �޼ҵ�
	public void showInfo() {
		System.out.println("���̵� : " + memberId + ", �̸� : " + name + ", �ּ� : " + address);
	}

	public void showMemberId() {

	}

	public void showName() {
		System.out.println("�̸� : " + name);

	}

	public void showAddress() {
		System.out.println("�ּ� : " + address);
	}
}
