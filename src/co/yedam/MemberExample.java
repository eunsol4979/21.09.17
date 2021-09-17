package co.yedam;

public class MemberExample {
	public static void main(String[] args) {

		Member m1 = new Member();
		m1.memberId = 10;
		m1.name = "�ڹ̸�";
		m1.phone = "010-1111-2222";

		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "ȫ�浿";
		m2.phone = "010-3333-4444";

		/*
		 * < ���� >
		 * 
		 * for(�ڷ��� ������: �迭��){
		 * 
		 * ������ �迭�� ��ȯ�ϸ鼭 �ݺ��� ���;
		 * 
		 * }
		 */
		Member[] members = { m1, m2 };
		for (Member m : members) {
			System.out.println("���̵� : " + m.memberId);
			System.out.println("�̸� : " + m.name);
			System.out.println("����ó : " + m.phone);
		}

		m1.name = "��̸�";
		members[0].phone = "010-5555-6666";
		for (Member m : members) {
			m.showInfo();
		}

	}
}

class Member {

	// �ʵ�(��������)

	int memberId;
	String name;
	String phone;

	// �޼ҵ�(���)
	void showInfo() {
		System.out.println("���̵� : " + memberId + ", �̸� : " + name + ", ����ó : " + phone);

	}
}