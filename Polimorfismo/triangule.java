package Polimorfismo;

public class triangule extends Figure implements Dimensions{
	
	private float high=0f, base=0f, a=0f, b=0f, c=0f;
	private int angle_a=0, angle_b=0, angle_c=0;
	
	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public int getAngle_a() {
		return angle_a;
	}

	public void setAngle_a(int angle_a) {
		this.angle_a = angle_a;
	}

	public int getAngle_b() {
		return angle_b;
	}

	public void setAngle_b(int angle_b) {
		this.angle_b = angle_b;
	}

	public int getAngle_c() {
		return angle_c;
	}

	public void setAngle_c(int angle_c) {
		this.angle_c = angle_c;
	}

	triangule(String color, float high, float base) {
		super(color);
		setName("Triangule");
		setHigh(high);
		setBase(base);		
	}
	
	triangule(String color){
		super(color);
		setName("Triangule");
	}
	
	public void area_triangule_1(int angle_a, float b, float c) {
		setAngle_c(angle_a);
		setB(b);
		setC(c);
		Irregular_Area(this.angle_a, this.b, this.c);
	}
	
	public void area_triangule_2(int angle_b, float a, float c) {
		setAngle_b(angle_b);
		setA(a);
		setC(c);
		Irregular_Area(this.angle_b, this.a, this.c);
	}
	
	
	public void area_triangule_3(int angle_c, float a, float b) {
		setAngle_c(angle_c);
		setA(a);
		setB(b);
		Irregular_Area(this.angle_c, this.a, this.b);
	}
	
	@Override
	public void Area() {
		System.out.println(String.format("The Area of your triangule is %,.2f",(high*base)/2)); 
	}
	
	public void Irregular_Area(int angle,float pam1, float pam2) {
		System.out.println(String.format("The Area of your triangule is ",((pam1*pam2)*Math.sin(angle))/2));
	}

	@Override
	public void Perimeter() {
		if (high>0 && base>0) {
			System.out.println(String.format("The perimeter of your Triangule is %,.2f",(Math.sqrt((high*high) + (base*base)))));
		}
		else {
			if (angle_a>0 && b>0 && c>0) {
				System.out.println(String.format("The perimeter of your Triangule is %,.2f",(Math.sin(angle_a) + b + c)));
			}
			else if (angle_b>0 && a>0 && c>0) {
				System.out.println(String.format("The perimeter of your Triangule is %,.2f",(Math.sin(angle_b) + a + c)));
			}
			else {
				System.out.println(String.format("The perimeter of your Triangule is %,.2f",(Math.sin(angle_c) + b + a)));
			}
		}
	}

}
