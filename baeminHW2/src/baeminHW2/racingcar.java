package baeminHW2;
import java.util.Scanner;

public class racingcar {
	public static void main(String[] args) {
		String[] carName = getCarName();
		int recingTime = getRacingTime();
		Car[] cars = setCars(carName);
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
	
	public static Car[] setCars(String[] name) {
		Car[] cars = new Car[name.length];
		for(int i=0; i<name.length; i++) {
			Car temp = new Car(name[i]);
			cars[i] = temp;
		}
		return cars;
	}
}