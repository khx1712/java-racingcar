package baeminHW2;
import java.io.InputStream;
import java.util.Scanner;

public class racingcar {
	public static void main(String[] args) {
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) ������� ����)");

	}
	
	
	public static String[] getCarName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) ������� ����)");
		String carName = scan.nextLine();
		return carName.split(",");
	}
}




