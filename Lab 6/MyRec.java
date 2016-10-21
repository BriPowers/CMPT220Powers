public class MyRec{
  private double width;
  private double height;
  
  public MyRec(){
    this.width = 1.0;
	this.height = 1.0;
  }
  public MyRec(double width, double height) {
    this.width = width;
	this.height = height;
  }
  public double getArea() {
    return this.width * this.height;
  }
  public double getPerimeter() {
    return (this.width * 2) + (this.height * 2); 
  }
}