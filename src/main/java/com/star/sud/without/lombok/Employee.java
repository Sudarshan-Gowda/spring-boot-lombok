package com.star.sud.without.lombok;

public class Employee {

	// Properties
	/////////////////
	private int id;
	private String name;
	private String place;

	// NoArg Constructor
	//////////////////////
	public Employee() {
		super();
	}

	// ArgumentConstructor
	////////////////////////
	/**
	 * @param id
	 * @param name
	 * @param place
	 */
	public Employee(int id, String name, String place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}

	// Setter/Getter
	////////////////////
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	// ToString
	/////////////
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}

}
