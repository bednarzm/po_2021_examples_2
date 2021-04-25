package pl.edu.pw.mini.po.eight.collections.sets;

public class ExperimentalObject {
	
	private static int idCounter;
	protected int id;
	
	public ExperimentalObject() {
		this.id = idCounter++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		ExperimentalObject other = (ExperimentalObject) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "[" + id + "]";
	}
	
}
