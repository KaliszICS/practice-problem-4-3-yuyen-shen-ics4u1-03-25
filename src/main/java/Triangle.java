//multiple constructors
//overloading constructors

class Triangle {

	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(String a, int b, int c) {
		//unique becuase the types of the parameters are not the same
	}

	public Triangle(int a, String b, int c) {
		//still unique becuase the order of the paramteres is different
	}

	
	public Triangle(String a, String b, String c) {
		//do nothing
	}

	//overloaded constructor
	public Triangle() {
		//unique because it has no parameters
		this.side1 = 3;
		this.side2 = 3;
		this.side3 = 3;
	}

	public Triangle(double side1) {
		this.side1 = side1;
		this.side2 = 3;
		this.side3 = 3;		
	}
}