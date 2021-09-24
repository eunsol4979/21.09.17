package co.yedam.account;

	import java.util.Scanner;

	public class AppMain {
	   
	   //�̱��� : new ������ ȣ���ϸ� ���ο� �ν��Ͻ��� ���������
	   private static AppMain singleton = new AppMain();
	   
	   //������ private -> �ܺ����� ����
	   private AppMain() {
	      
	   }
	   
	   // method getInstance()
	   public static AppMain getInstance() {
	      return singleton;
	   }

	   
	   Account[] accountArray = new Account[100];
	    Scanner scanner = new Scanner(System.in);
	   
	   public void createAccount() { // ������ - �޼ҵ� ���� 1,2,3
	      System.out.println("------");
	      System.out.println("���»���");
	      System.out.println("------");

	      System.out.println("���: ���°� �����Ǿ����ϴ�.");

	   }

	   public void accountList() {
	      System.out.println("���¸��");

	   }

	   public void deposit() {
	      System.out.println("------");
	      System.out.println("�����ϱ�");
	      System.out.println("------");

	   }

	   public void withdraw() { 

	   }

	   public Account findAccount(String ano) {
	      for (int i = 0; i < accountArray.length; i++) {
	         if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
	            return accountArray[i];
	         }
	      }
	      System.out.println("���¸� �߸� �Է��ϼ̽��ϴ�");
	      return null;
	   }

	   public void execute() {
	      boolean run = true;
	      Scanner scanner = new Scanner(System.in);
	      
	      
	      System.out.println("-------------");
	      System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5����");
	      System.out.println("-------------");
	      System.out.println("����>>");
	      int selectNo = scanner.nextInt();

	      while (run) {
	         if (selectNo == 1) {
	            createAccount();
	         } else if (selectNo == 2) {
	            accountList();
	         } else if (selectNo == 3) {
	            deposit();
	         } else if (selectNo == 4) {
	            withdraw();
	         } else if (selectNo == 5) {
	            run = false;
	         } else {
	            System.out.println("�߸��� ���� �Է��Ͽ����ϴ�");
	         }

	      }
	   }
	}


