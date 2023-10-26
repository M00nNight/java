package objects;
public class Rectangle {
    private double length;
    private double width;
    private int slides = 4;

    //constructor
     public Rectangle(){
         setLength(0);
         setWidth(0);
     }

     public Rectangle(double length , double width){
         setLength(length);
         setWidth(width);

     }

    public double calcParameter(){
        return  (2*length) + (2*width);
    }
   public double calcArea(){
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSlides() {
        return slides;
    }

    public void setSlides(int slides) {
        this.slides = slides;
    }
}
