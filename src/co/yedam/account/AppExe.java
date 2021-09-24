package co.yedam.account;

public class AppExe {

		   public static void main(String[] args) {
		      AppMain main = AppMain.getInstance();//new AppMain(); //인스턴스 생성, static 타입 없이 쓰기 위해서
//		      main.execute();
		      
		      AppMain main2 = AppMain.getInstance(); //new AppMain(); //인스턴스 생성
		      
		      if(main == main2) { // 메모리 주소값 == 메모리 주소값
		         System.out.println("같은 값");
		      }else {
		         System.out.println("다른 값");
		      }

		   }

		}

	
