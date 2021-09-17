package co.yedam.friend;

import java.util.Scanner;

// 친구 목록 관리.
// 이름, 연락처 , email, 키, 몸무게
// 친구등록, 조회(이름), 목록, 수정, 삭제, 종료.
public class FriendMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] list = new Friend[50];
		list[0] = new Friend("김민희", "010-1111-2222", "hello@naver.com", 167, 52);

		while (true) {
			System.out.println("1.친구등록, 2.조회(이름), 3.목록, 4.수정, 5.삭제, 6.종료.");
			double set = readDouble("메뉴를 선택하세요");
			if (set == 1) {
				System.out.println("친구등록 메뉴입니다");
				// 친구등록 : 이름, 연락처 , email, 키, 몸무게
				String name = readStr("이름을 입력하세요");
				String phone = readStr("연락처를 입력하세요");
				String email = readStr("email을 입력하세요");
				double height = readDouble("키를 입력하세요");
				double weight = readDouble("몸무게를 입력하세요");

				// 생성자 호출 -> friend 변수 저장
				Friend friend = new Friend(name, phone, email, height, weight);
				for (int i = 0; i < list.length; i++) {
					if (list[i] == null) {
						list[i] = friend;
						break;
					}
				}
				System.out.println("저장 완료!");
				
			} else if (set == 2) {
				System.out.println("친구조회 메뉴입니다");
				String search = readStr("조회할 이름을 입력하세요");
				for (Friend friend : list) {
					if (friend != null && friend.getName().indexOf(search) != -1) {
						friend.Info();

					}
				}
			} else if (set == 3) {
				System.out.println("친구목록 메뉴입니다");
				for (Friend friend : list) {
					if (friend != null) {
						friend.Info();
					}
				}
			} else if (set == 4) {
				System.out.println("수정메뉴 입니다");
				String search = readStr("수정할 이름을 입력.");
				String name = readStr("변경할 이름을 입력[변경 X -> 엔터.]");
				String phone = readStr("변경할 번호를 입력[변경 X -> 엔터.]");
				String email = readStr("변경할 email을 입력[변경 X -> 엔터.]");
				String height = readStr("변경할 키를 입력[변경 X -> 엔터.]");
				String weight = readStr("변경할 몸무게 입력[변경 X -> 엔터.]");

				boolean isExit = false;

				for (int i = 0; i < list.length; i++) {
					if (list[i] != null && list[i].getName().equals(search)) {
						if (name.equals("")) {
							list[i].setName(name);
						}
						if (!phone.equals("")) {
							list[i].setPhone(phone);
						}
						if (!email.equals("")) {
							list[i].setEmail(email);
						}
						if (!height.equals("")) {
							list[i].setHeight(Double.parseDouble(height));
						}
						if (!weight.equals("")) {
							list[i].setWeight(Double.parseDouble(weight));
						}
						isExit = true;
					}
				}
				if (isExit) {
					System.out.println("정상적으로 수정");
				} else {
					System.out.println("존재하지 않는 이름입니다");
				}
			} else if (set == 5) {
				System.out.println("삭제메뉴 입니다");
				String search = readStr("삭제할 이름을 입력하세요.");
				for (int i=0; i<list.length;i++) {
					if (list[i] != null && list[i].getName().indexOf(search) != -1) {
						list[i] = null;
					}
				}
				System.out.println("삭제완료!");
			} else if (set == 6) {
				System.out.println("종료 메뉴입니다");
				break;
			} else {
				System.out.println("다시 입력하세요");
			}

		}
		System.out.println("끝!!!!!!!!!!");
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	public static double readDouble(String msg) {
		System.out.println(msg);
		double result = 0.0;
		while (true) {
			String val = sc.nextLine();
			try {
				result = Double.parseDouble(val); 

			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");

			}
			return result;
		}
	}

}

class Friend {
	String name;
	String phone;
	String email;
	double height;
	double weight;

	public Friend() {

	}

	public Friend(String name, String phone, String email, double height, double weight) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void Info() {
		System.out.printf("이름 : %s, 연락처 : %s, email : %s, 키 : %.1f, 몸무게 : %.1f\n", name, phone, email, height, weight);
	}

}
