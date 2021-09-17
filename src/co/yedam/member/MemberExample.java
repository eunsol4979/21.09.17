package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {

		Member m0 = new Member("user1"); // 생성자 호출
		Member m1 = new Member("Luna", "김새벽", "대구 중구 내일동");
		m1.showInfo();
		
//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "박지원";
		m1.setName("홍길동");
//		m1.address = "대구 중구 내일동";
		m1.setAddress("대구 중구 남일동");
//		System.out.println("아이디 : " + m1.memberId);
		System.out.println("아이디 : " + m1.getMemberId());
//		System.out.println("이름 : " + m1.name);
		System.out.println("이름 : " + m1.getName());
		System.out.println("주소 : " + m1.getAddress());
		
		Member m2 = new Member("user2");
		m2.showInfo();
		
		Member m3 = new Member("user3","안녕","대구 북구 안녕동");
		m3.showInfo();
//		m3.name = "박길동";
		m3.setName("박길동");
		m3.showInfo();
		
		
	}
}



class Member {
	// user1(아이디), 홍길동(이름), 대구 중구 남일동(주소)

	private String memberId;
	private String name;
	private String address;

	// 생성자 : 필드 값 초기화
	public Member() {
		memberId = "user1";
		name = "박지원";
		address = "대구 중구 내일동";
	}
	
	public Member(String mId) {
		memberId = mId;
	}
	
	public Member(String mId, String n, String a) {
		memberId = mId;
		name = n;
		address = a;
	}
	
	// private 대체 메소드 생성
	public void setMemberId(String mId) {
		memberId = mId;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAddress(String a) {
		address = a;
	}
	
	// 값을 반환해주는 메소드 생성
	public String getMemberId() {
		return memberId; // 반환 필드 : 아이디
	}
	
	public String getName( ) {
		return name; // 반환 필드 : 이름
	}
	
	public String getAddress() {
		return address; // 반환 필드 : 주소
	}
	
	// 메소드
	public void showInfo() {
		System.out.println("아이디 : " + memberId + ", 이름 : " + name + ", 주소 : " + address);
	}

	public void showMemberId() {

	}

	public void showName() {
		System.out.println("이름 : " + name);

	}

	public void showAddress() {
		System.out.println("주소 : " + address);
	}
}
