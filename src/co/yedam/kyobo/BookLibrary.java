package co.yedam.kyobo;

import java.util.Scanner;

// 1.도서등록 2.도서수정 3.도서목록 4.도서조회 9.도서삭제
// 도서정보 : 도서제목/저자/출판사/가격
// 
public class BookLibrary {
	static Scanner sc = new Scanner(System.in); // 메인을 벗어나서도 사용 가능하도록

	public static void main(String[] args) {
		Book[] kyoboLib = new Book[100];
		kyoboLib[0] = new Book("혼자 공부하는 자바", "신용권", "한빛출판사", 25000);
		kyoboLib[1] = new Book("이것이 자바다", "홍길동", "한빛출판사", 20000);
		kyoboLib[2] = new Book("오만과 편견", "조은솔", "루나출판사", 35000);

		while (true) {

			System.out.println("1.도서등록 2.도서수정 3.도서목록 4.도서조회 5.도서삭제 9.종료");
			int menu = readInt("메뉴를 선택하세요 >>");
			if (menu == 1) {
				System.out.println("도서등록 메뉴입니다");
				// 도서등록 : 제목,저자,출판사,가격
				String title = readStr("책 제목을 입력하세요.");
				String auth = readStr("저자를 입력하세요.");
				String press = readStr("출판사를 입력하세요.");
				int price = readInt("가격을 입력하세요.");

				// 생성자를 호출 -> book 변수 저장
				Book book = new Book(title, auth, press, price);
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] == null) { // 비어있는 위치에 배열 저장
						kyoboLib[i] = book;
						break;
					}
				}
				System.out.println("저장완료.");

			} else if (menu == 2) {
				System.out.println("도서수정 메뉴입니다");

				// 도서명으로 찾아와서 -> 도서명(키)
				// 저자, 출판사, 가격 => 항목변경
				//
				String search = readStr("수정할 도서명을 입력.");
				String author = readStr("변경할 저자를 입력[변경 X -> 엔터.]");
				String press = readStr("변경할 출판사를 입력[변경 X -> 엔터.]");
				String price = readStr("변경할 금액을 입력[변경 X -> 엔터.]");
				boolean isExit = false;

				for (int i = 0; i < kyoboLib.length; i++) {
					// 한건 찾아온 경우.
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().equals(search)) {
						if (author.equals("")) {
							kyoboLib[i].setAuthor(author);
						}
						if (!press.equals("")) {
							kyoboLib[i].setPress(press);
						}
						if (!press.equals("")) {
							kyoboLib[i].setPrice(Integer.parseInt(price));
						}
						isExit = true;
					}

				}
				if (isExit) {
					System.out.println("정상적으로 수정.");
				} else {
					System.out.println("존재하지 않는 책입니다");
				}
			} else if (menu == 3) {
				System.out.println("도서목록 메뉴입니다");
				for (Book book : kyoboLib) {
					if (book != null) {
						book.showInfo();
					}
				}

			} else if (menu == 4) {
				System.out.println("도서조회 메뉴입니다");
				String search = readStr("조회할 도서명을 입력하세요.");
				for (Book book : kyoboLib) {
					if (book != null && book.getTitle().indexOf(search) != -1) {
						book.showInfo();
					}
				}

			} else if (menu == 5) {
				System.out.println("도서삭제 메뉴입니다");
				String search = readStr("삭제할 도서명을 입력하세요.");
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1) {
						kyoboLib[i] = null;
					}
				}
				System.out.println("삭제완료!");

			} else if (menu == 9) {
				System.out.println("종료 메뉴입니다");
				break;
			} else {
				System.out.println("다시 입력하세요");
			}

		} // end of while
		System.out.println("끝.");
	} // end of main

	// 사용자 입력값을 반환
	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	// 사용자 입력값을 반환(int)
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = sc.nextLine();
			try {
				result = Integer.parseInt(val); // String타입의 숫자를 실제 int타입으로 바꿔줌 ex) "1000" -> 1000
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
				continue;
			}
		}
		return result;
	}

}

class Book {
	// 필드
	private String title;
	private String author;
	private String press;
	private int price;

	// 생성자
	public Book() {

	}

	public Book(String title, String author, String press, int price) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
	}

	// 메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.printf("[책제목 : %s, 저자 : %s, 출판사 : %s, 가격 : %d]\n", title, author, press, price);
	}

}