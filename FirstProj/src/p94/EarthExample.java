package p94;

class Earth {
	final double EARTH_RADIUS = 6400;
	final double EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
}

public class EarthExample {
	public static void main(String[] args) {
		Earth earth = new Earth();
		
//		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS);
		System.out.println("지구의 반지름 : " + earth.EARTH_RADIUS);
		
//		Earth.EARTH_RADIUS = 6500;
	}
}