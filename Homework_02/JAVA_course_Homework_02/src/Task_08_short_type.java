
public class Task_08_short_type {

	public static void main(String[] args) {
		
		short UserNumber = 32767;
		int Number;
		Number = UserNumber % 2;
		
		System.out.println();
		System.out.println("���������� ���� ����� �: " + UserNumber);
		System.out.println();
		System.out.println("�������� �� ������� - ��������:");
		System.out.println();
		
		boolean Even = (Number == 0);
		System.out.println(UserNumber + " e �����: " + Even);
		System.out.println();
		System.out.println("* ���������: ��� ��������� � \"false\" �� �� ��� �������, �� ���������� ���� ����� � �������");
		
		
	}

}
