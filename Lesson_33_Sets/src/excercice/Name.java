package excercice;

import java.io.Serializable;

public class Name implements Serializable, Comparable<Name>{

	
	private static final long serialVersionUID = -8982343930931200416L;
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public Name(String name) {
		setName(name);
	}

	@Override
	public String toString() {
		return getName();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Name other = (Name) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public int compareTo(Name nameToCheck) {
		
		return getName().compareTo(nameToCheck.getName());
	}

}
