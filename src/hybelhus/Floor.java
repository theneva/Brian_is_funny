package hybelhus;

public class Floor {
	private Dormitory[] dormitories;

	private int rentPerDormitory;

	public Floor(Dormitory[] dormitories, int rentPerDormitory) {
		this.dormitories = dormitories;
		this.rentPerDormitory = rentPerDormitory;
	}

	public Dormitory[] getDormitories() {
		return dormitories;
	}

	public void setDormitories(Dormitory[] dormitories) {
		this.dormitories = dormitories;
	}

	public int getRentPerDormitory() {
		return rentPerDormitory;
	}

	public void setRentPerDormitory(int rentPerDormitory) {
		this.rentPerDormitory = rentPerDormitory;
	}

	public String toString() {
		String s = "Rent per dormitory: " + rentPerDormitory + System.getProperty("line.separator");

		for (Dormitory dormitory : dormitories) {
			s += dormitory + ": " + dormitory.getStudent() + System.getProperty("line.separator");
		}

		return s;
	}
}
