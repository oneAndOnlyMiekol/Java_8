package app;

public enum Pizza {
	MARGHERITA(true, true, false, false), CAPRICIOSA(true, true, true, false), PROSCIUTTO(true, true, false, true);

	private boolean sause;
	private boolean cheese;
	private boolean mushrooms;
	private boolean ham;

	public boolean isSause() {
		return sause;
	}

	public boolean isCheese() {
		return cheese;
	}

	public boolean isMushrooms() {
		return mushrooms;
	}

	public boolean isHam() {
		return ham;
	}

	Pizza(boolean sause, boolean cheese, boolean mushrooms, boolean ham) {
		this.sause = sause;
		this.cheese = cheese;
		this.mushrooms = mushrooms;
		this.ham = ham;
	}

	@Override
	public String toString() {
		String result="Pizza ";
		result=result+this.name()+ " has ingredients ";
		if(isSause())
			result=result+"tomato sause, ";
		if(isCheese()&&!isHam()&&!isMushrooms())
			result=result+"and cheese.";
		else
			result=result+"cheese, ";
		if(isMushrooms())
			result=result+"and mushrooms.";
		if(isHam())
			result=result+"and ham.";
		return result;
	}

}
