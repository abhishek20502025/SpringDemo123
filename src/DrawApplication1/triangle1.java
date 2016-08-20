package DrawApplication1;

public class triangle1 {
	private point A ;
	private point B;
	private point C;
	public point getA() {
		return A;
	}
	public void setA(point a) {
		A = a;
	}
	public point getB() {
		return B;
	}
	public void setB(point b) {
		B = b;
	}
	public point getC() {
		return C;
	}
	public void setC(point c) {
		C = c;
	}
	void draw(){
		System.out.println("triangle Points :- " + getA() + " " +getB() + " " +getC() );
	}
	
	
}
