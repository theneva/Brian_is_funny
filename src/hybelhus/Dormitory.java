package hybelhus;

public class Dormitory {
	private String identifier;
	private Student student;
	
	public Dormitory(String identifier) {
		this.identifier = identifier;
	}
	
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudents(Student student) {
		this.student = student;
	}

	public String toString() {
		return identifier;
	}
}
