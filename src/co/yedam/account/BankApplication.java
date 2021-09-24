package co.yedam.account;

import java.util.Scanner;

public class BankApplication { 

	   private static Account[] accountArray = new Account[100];
	   private static Scanner scanner = new Scanner(System.in);
	   static int num = 0;

	   public static void main(String[] args) {
	      boolean run = true;
	      while (run) {
	         System.out.println("----------------------------------------------");
	         System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
	         System.out.println("----------------------------------------------");
	         System.out.print("����>>");

	         int selectNo = scanner.nextInt();

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
	            System.out.println("----�̿����ּż� �����մϴ�. �ȳ��� ���ʽÿ�.----");
	         } else {
	            System.out.println("�߸��� ���� �Է��Ͽ����ϴ�");
	         }

	      }

	   } // end of main

	   private static void createAccount() { // ������ - �޼ҵ� ���� 1,2,3
	      System.out.println("------");
	      System.out.println("���»���");
	      System.out.println("------");
	      String ano = readStr("���¹�ȣ:");
	      String owner = readStr("������:");
	      int balance = readInt("�ʱ�ݾ�");
	      Account ac = new Account(ano, owner, balance);
	      for (int i = 0; i < accountArray.length; i++) {
	         if (accountArray[i] == null) {
	            accountArray[i] = ac;
	            break;
	         }
	      }
	      System.out.println("���: ���°� �����Ǿ����ϴ�.");

	   }

	   private static void accountList() {
	      for (Account ac : accountArray) {
	         if (ac != null) {
	            System.out.printf("%s \t %s \t %d\n", ac.getAno(), ac.getOwner(), ac.getBalance());
	         }
	      }
	   }

	   private static void deposit() {
	      System.out.println("------");
	      System.out.println("�����ϱ�");
	      System.out.println("------");
	      String searchAno = readStr("���¹�ȣ: ");

	      if (findAccount(searchAno) != null) {
	         int money = readInt("���ݾ�: ");
	         int newMoney = findAccount(searchAno).getBalance() + money;
	         findAccount(searchAno).setBalance(newMoney);
	         System.out.println("���: ������ �����Ǿ����ϴ�.");
	      }
	   }


	   private static void withdraw() { //������
	      String searchAno = readStr("���¹�ȣ: ");
	      if (findAccount(searchAno) != null) {
	         int money = readInt("��ݾ�: ");
	         int minusMoney = findAccount(searchAno).getBalance() - money;
	         if (minusMoney < 0) {
	            System.out.println("��ݰ��ɾ��� �ʰ��߽��ϴ�");
	         } else {
	            findAccount(searchAno).setBalance(minusMoney);
	            System.out.println("���: ����� �����Ǿ����ϴ�");
	         }

	      }

	   }

	   private static Account findAccount(String ano) {
	      for (int i = 0; i < accountArray.length; i++) {
	         if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
	            return accountArray[i];
	         }
	      }
	      System.out.println("���¸� �߸� �Է��ϼ̽��ϴ�");
	      return null;
	   }

	   public static String readStr(String msg) {
	      System.out.print(msg);
	      return scanner.next();
	   }

	   public static int readInt(String msg) {
	      System.out.print(msg);
	      int num = scanner.nextInt();
	      return num;
	   }

	}

