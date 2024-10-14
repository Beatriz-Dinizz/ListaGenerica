package model;

public class No<T> {
	
	int dado;
	No<T> proximo;
	
	@Override
	public String toString() {
		return "Dado [" + dado + "]";
	}
}
