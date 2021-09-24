package co.yedam;

import java.util.Scanner;

public class ScanUtil {
	static Scanner sc = new Scanner(System.in);
	public static int readInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine(); //엔터처리 
		return num;
		
		 
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
}
