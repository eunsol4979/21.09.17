package co.yedam.account;

public class AppExe {

		   public static void main(String[] args) {
		      AppMain main = AppMain.getInstance();//new AppMain(); //�ν��Ͻ� ����, static Ÿ�� ���� ���� ���ؼ�
//		      main.execute();
		      
		      AppMain main2 = AppMain.getInstance(); //new AppMain(); //�ν��Ͻ� ����
		      
		      if(main == main2) { // �޸� �ּҰ� == �޸� �ּҰ�
		         System.out.println("���� ��");
		      }else {
		         System.out.println("�ٸ� ��");
		      }

		   }

		}

	