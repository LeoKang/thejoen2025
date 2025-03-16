package component;

public class Tire {
	private int size;

	public Tire() {
		System.out.println("Tire Constructor");
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
