package excercice;

public class Pair<T, V> {

	private T firstParamiter;
	private V secondParamiter;

	public T getFirstParamiter() {
		return firstParamiter;
	}

	public void setFirstParamiter(T firstParamiter) {
		this.firstParamiter = firstParamiter;
	}

	public V getSecondParamiter() {
		return secondParamiter;
	}

	public void setSecondParamiter(V secondParamiter) {
		this.secondParamiter = secondParamiter;
	}
	
	Pair(T firstParamiter, V secondParamiter){
		setFirstParamiter(firstParamiter);
		setSecondParamiter(secondParamiter);
	}
	
	@Override
	public String toString() {
		return firstParamiter.toString() + " " + secondParamiter.toString();
	}

}
