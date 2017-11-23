package assg1;

public class Circle {
	double radius;
	double diameter;
	double area;
void areaRadius(double radius)
{
	area=3.14*radius*radius;
	System.out.println("area of circle using radius: " +area);
	
}
void areaDiameter(double diameter){
	
	area= (3.14/4)*diameter*diameter;
	System.out.println("area of circle using diameter: " +area);
}
void perimeter(double radius)
{
	double perimeter;
	perimeter = 2*3.14*radius;

	System.out.println("perimeter of circle: " +perimeter);
}
}