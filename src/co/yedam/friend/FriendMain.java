package co.yedam.friend;

import java.util.Scanner;

// ģ�� ��� ����.
// �̸�, ����ó , email, Ű, ������
// ģ�����, ��ȸ(�̸�), ���, ����, ����, ����.
public class FriendMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] list = new Friend[50];
		list[0] = new Friend("�����", "010-1111-2222", "hello@naver.com", 167, 52);

		while (true) {
			System.out.println("1.ģ�����, 2.��ȸ(�̸�), 3.���, 4.����, 5.����, 6.����.");
			double set = readDouble("�޴��� �����ϼ���");
			if (set == 1) {
				System.out.println("ģ����� �޴��Դϴ�");
				// ģ����� : �̸�, ����ó , email, Ű, ������
				String name = readStr("�̸��� �Է��ϼ���");
				String phone = readStr("����ó�� �Է��ϼ���");
				String email = readStr("email�� �Է��ϼ���");
				double height = readDouble("Ű�� �Է��ϼ���");
				double weight = readDouble("�����Ը� �Է��ϼ���");

				// ������ ȣ�� -> friend ���� ����
				Friend friend = new Friend(name, phone, email, height, weight);
				for (int i = 0; i < list.length; i++) {
					if (list[i] == null) {
						list[i] = friend;
						break;
					}
				}
				System.out.println("���� �Ϸ�!");
				
			} else if (set == 2) {
				System.out.println("ģ����ȸ �޴��Դϴ�");
				String search = readStr("��ȸ�� �̸��� �Է��ϼ���");
				for (Friend friend : list) {
					if (friend != null && friend.getName().indexOf(search) != -1) {
						friend.Info();

					}
				}
			} else if (set == 3) {
				System.out.println("ģ����� �޴��Դϴ�");
				for (Friend friend : list) {
					if (friend != null) {
						friend.Info();
					}
				}
			} else if (set == 4) {
				System.out.println("�����޴� �Դϴ�");
				String search = readStr("������ �̸��� �Է�.");
				String name = readStr("������ �̸��� �Է�[���� X -> ����.]");
				String phone = readStr("������ ��ȣ�� �Է�[���� X -> ����.]");
				String email = readStr("������ email�� �Է�[���� X -> ����.]");
				String height = readStr("������ Ű�� �Է�[���� X -> ����.]");
				String weight = readStr("������ ������ �Է�[���� X -> ����.]");

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
					System.out.println("���������� ����");
				} else {
					System.out.println("�������� �ʴ� �̸��Դϴ�");
				}
			} else if (set == 5) {
				System.out.println("�����޴� �Դϴ�");
				String search = readStr("������ �̸��� �Է��ϼ���.");
				for (int i=0; i<list.length;i++) {
					if (list[i] != null && list[i].getName().indexOf(search) != -1) {
						list[i] = null;
					}
				}
				System.out.println("�����Ϸ�!");
			} else if (set == 6) {
				System.out.println("���� �޴��Դϴ�");
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}

		}
		System.out.println("��!!!!!!!!!!");
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
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");

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
		System.out.printf("�̸� : %s, ����ó : %s, email : %s, Ű : %.1f, ������ : %.1f\n", name, phone, email, height, weight);
	}

}
