package hybelhus;

public class Block {
	
	private final String name;
	private Floor[] floors;
	private int expensesPerDorm, expensesPerCommonArea;
	
	public Block(String name, Floor[] floors, int expensesPerDorm, int expensesPerCommonArea) {
		this.name = name;
		this.floors = floors;
		this.expensesPerDorm = expensesPerDorm;
		this.expensesPerCommonArea = expensesPerCommonArea;
	}

	/*
	 * Methods
	 */
	
	// 1
	public void printOverview() {
		System.out.printf("%-9s %-23s %7s%n", "Dormitory", "Tenant", "Balance");
		for (int i = 0; i <= 9 + 23 + 7 + 2; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for (Floor floor : floors) {
			for (Dormitory dormitory : floor.getDormitories()) {
				System.out.printf("%-9s %-23s %7d%n", dormitory.getIdentifier(), dormitory.getStudent() != null ? dormitory.getStudent() : "(FREE)", dormitory.getStudent() != null ? dormitory.getStudent().getTotalRentPaid() : 0);
			}
			System.out.println();
		}
		
		System.out.println();
		// TODO
		System.out.printf("%-25s%n", "Måned/år, og driftstid:");
		// TODO
		System.out.printf("%-25s%n%n", "Totalfortjeneste:");
	}
	
//	// 8
//	public void writeDataToFile() {
//		
//	}
	
	/*
	 * Get/Set
	 */
	public Floor[] getFloors() {
		return floors;
	}

	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}

	public int getExpensesPerDorm() {
		return expensesPerDorm;
	}

	public void setExpensesPerDorm(int expensesPerDorm) {
		this.expensesPerDorm = expensesPerDorm;
	}

	public int getExpensesPerCommonArea() {
		return expensesPerCommonArea;
	}

	public void setExpensesPerCommonArea(int expensesPerCommonArea) {
		this.expensesPerCommonArea = expensesPerCommonArea;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		String s = "";
		s += "Expenses/dorm/month: " + expensesPerDorm + System.getProperty("line.separator");
		s += "Expenses/common area/month: " + expensesPerCommonArea + System.getProperty("line.separator");
		for (Floor floor : floors) {
			s += floor + System.getProperty("line.separator");
		}
		
		return s;
	}
}
