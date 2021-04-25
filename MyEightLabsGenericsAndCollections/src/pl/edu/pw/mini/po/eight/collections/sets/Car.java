package pl.edu.pw.mini.po.eight.collections.sets;

public class Car implements Comparable<Car>{
	
	private String make;
	private String model;
	
	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	@Override
	public int compareTo(Car o) {
		return make.compareTo(o.make);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + make + " " + model + "]";
	}
	
}
