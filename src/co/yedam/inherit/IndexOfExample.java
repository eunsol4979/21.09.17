package co.yedam.inherit;

public class IndexOfExample {

	public static void main(String[] args) {
		String name = "홍길동";
		
		System.out.println(name.indexOf("길동") != -1);
		//-> 찾으려는 이름이 name이라는 변수에 있으면 true 반환 
		System.out.println(name.equals("홍길동"));
	}

}
