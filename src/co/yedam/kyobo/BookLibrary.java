package co.yedam.kyobo;

import java.util.Scanner;

// 1.������� 2.�������� 3.������� 4.������ȸ 9.��������
// �������� : ��������/����/���ǻ�/����
// 
public class BookLibrary {
	static Scanner sc = new Scanner(System.in); // ������ ������� ��� �����ϵ���

	public static void main(String[] args) {
		Book[] kyoboLib = new Book[100];
		kyoboLib[0] = new Book("ȥ�� �����ϴ� �ڹ�", "�ſ��", "�Ѻ����ǻ�", 25000);
		kyoboLib[1] = new Book("�̰��� �ڹٴ�", "ȫ�浿", "�Ѻ����ǻ�", 20000);
		kyoboLib[2] = new Book("������ ���", "������", "�糪���ǻ�", 35000);

		while (true) {

			System.out.println("1.������� 2.�������� 3.������� 4.������ȸ 5.�������� 9.����");
			int menu = readInt("�޴��� �����ϼ��� >>");
			if (menu == 1) {
				System.out.println("������� �޴��Դϴ�");
				// ������� : ����,����,���ǻ�,����
				String title = readStr("å ������ �Է��ϼ���.");
				String auth = readStr("���ڸ� �Է��ϼ���.");
				String press = readStr("���ǻ縦 �Է��ϼ���.");
				int price = readInt("������ �Է��ϼ���.");

				// �����ڸ� ȣ�� -> book ���� ����
				Book book = new Book(title, auth, press, price);
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] == null) { // ����ִ� ��ġ�� �迭 ����
						kyoboLib[i] = book;
						break;
					}
				}
				System.out.println("����Ϸ�.");

			} else if (menu == 2) {
				System.out.println("�������� �޴��Դϴ�");

				// ���������� ã�ƿͼ� -> ������(Ű)
				// ����, ���ǻ�, ���� => �׸񺯰�
				//
				String search = readStr("������ �������� �Է�.");
				String author = readStr("������ ���ڸ� �Է�[���� X -> ����.]");
				String press = readStr("������ ���ǻ縦 �Է�[���� X -> ����.]");
				String price = readStr("������ �ݾ��� �Է�[���� X -> ����.]");
				boolean isExit = false;

				for (int i = 0; i < kyoboLib.length; i++) {
					// �Ѱ� ã�ƿ� ���.
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
					System.out.println("���������� ����.");
				} else {
					System.out.println("�������� �ʴ� å�Դϴ�");
				}
			} else if (menu == 3) {
				System.out.println("������� �޴��Դϴ�");
				for (Book book : kyoboLib) {
					if (book != null) {
						book.showInfo();
					}
				}

			} else if (menu == 4) {
				System.out.println("������ȸ �޴��Դϴ�");
				String search = readStr("��ȸ�� �������� �Է��ϼ���.");
				for (Book book : kyoboLib) {
					if (book != null && book.getTitle().indexOf(search) != -1) {
						book.showInfo();
					}
				}

			} else if (menu == 5) {
				System.out.println("�������� �޴��Դϴ�");
				String search = readStr("������ �������� �Է��ϼ���.");
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1) {
						kyoboLib[i] = null;
					}
				}
				System.out.println("�����Ϸ�!");

			} else if (menu == 9) {
				System.out.println("���� �޴��Դϴ�");
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}

		} // end of while
		System.out.println("��.");
	} // end of main

	// ����� �Է°��� ��ȯ
	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	// ����� �Է°��� ��ȯ(int)
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = sc.nextLine();
			try {
				result = Integer.parseInt(val); // StringŸ���� ���ڸ� ���� intŸ������ �ٲ��� ex) "1000" -> 1000
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
		}
		return result;
	}

}

class Book {
	// �ʵ�
	private String title;
	private String author;
	private String press;
	private int price;

	// ������
	public Book() {

	}

	public Book(String title, String author, String press, int price) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
	}

	// �޼ҵ�
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
		System.out.printf("[å���� : %s, ���� : %s, ���ǻ� : %s, ���� : %d]\n", title, author, press, price);
	}

}