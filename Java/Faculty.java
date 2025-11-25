import java.util.*;

public class Faculty {

	Employee dean;
	private String name;
	Collection<Institute> institutes;
	University university;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param name
	 */
	public Faculty(String name, Collection<Institute> institutes, University university) {
		this.name = name;
		this.institutes = institutes;
		this.university = university;
	}

	/**
	 * 
	 * @param name
	 */
	public Faculty(String name) {
		// TODO - implement Faculty.Faculty
		throw new UnsupportedOperationException();
	}
}