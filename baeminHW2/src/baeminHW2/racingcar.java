package baeminHW2;
import java.util.Scanner;

public class racingcar {
	public static void main(String[] args) {
		String[] carName = getCarName();
		int recingTime = getRacingTime();
	}
	
	
	public static String[] getCarName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) ������� ����)");
		String carName = scan.nextLine();
		return carName.split(",");
	}
	
	public static int getRacingTime() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�õ��� ȸ���� ��ȸ�ΰ���?");
		int racingTime = scan.nextInt();
		return racingTime;
	}
}




