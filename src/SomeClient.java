
public class SomeClient {
	public static void main(String[] args) {
		for (int floor = 0; floor < 3; floor++) {
			for (int dormitory = 0; dormitory < 6; dormitory++) {
				System.out.println("" + (floor + 1) + ";" + (char) ((int) 'A' + dormitory) + ";0;TOM HYBEL");
			}
		}
	}
}
