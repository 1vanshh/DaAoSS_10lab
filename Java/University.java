import java.util.*;

public class University {

	Collection<Faculty> faculties;
	private String name;
	private int numberOfEmployees;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	/**
	 * 
	 * @param name
	 * @param numberOfEmployees
	 */
	public University(String name, int numberOfEmployees) {
		this.name = name;
		this.numberOfEmployees = numberOfEmployees;
	}

}