package co.yedam.inherit;

public class IndexOfExample {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		
		System.out.println(name.indexOf("�浿") != -1);
		//-> ã������ �̸��� name�̶�� ������ ������ true ��ȯ 
		System.out.println(name.equals("ȫ�浿"));
	}

}
