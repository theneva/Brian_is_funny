package hybelhus;

public class Student {
	private String name;
	private int totalRentPaid;
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotalRentPaid() {
		return totalRentPaid;
	}
	
	public void setTotalRentPaid(int totalRentPaid) {
		this.totalRentPaid = totalRentPaid;
	}
	
	public String toString() {
		return this.name;
	}
}
