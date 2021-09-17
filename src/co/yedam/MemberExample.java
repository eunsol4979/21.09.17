package co.yedam;

public class MemberExample {
	public static void main(String[] args) {

		Member m1 = new Member();
		m1.memberId = 10;
		m1.name = "박미림";
		m1.phone = "010-1111-2222";

		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "홍길동";
		m2.phone = "010-3333-4444";

		/*
		 * < 구조 >
		 * 
		 * for(자료형 변수명: 배열명){
		 * 
		 * 변수가 배열을 순환하면서 반복할 명령;
		 * 
		 * }
		 */
		Member[] members = { m1, m2 };
		for (Member m : members) {
			System.out.println("아이디 : " + m.memberId);
			System.out.println("이름 : " + m.name);
			System.out.println("연락처 : " + m.phone);
		}

		m1.name = "김미림";
		members[0].phone = "010-5555-6666";
		for (Member m : members) {
			m.showInfo();
		}

	}
}

class Member {

	// 필드(정보저장)

	int memberId;
	String name;
	String phone;

	// 메소드(기능)
	void showInfo() {
		System.out.println("아이디 : " + memberId + ", 이름 : " + name + ", 연락처 : " + phone);

	}
}