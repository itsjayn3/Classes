public class Triangle {

    private double base;
    private double height;
    private double s1;
    private double s2;
    private double s3;

    // default values for base and height //

    public Triangle(){
       this.setBase(5);
       this.setHeight(2.5);
    }
    // constructor that allows custom base and height//
    public Triangle(double base, double height){
    this.setBase(base);
    this.setHeight(height);
    }

    // setter functions//
    public void setBase(double base){ this.base = base;}
    public void setHeight(double height){this.height = height;}
    public void setS1(double s1){this.s1 = s1;}
    public void setS2(double s2){this.s2 = s2;}
    public void setS3(double s3){this.s3 = s3;}

    // getter functions//
    public double getBase(){ return base;}
    public double getHeight(){return height;}
    public double getS1(){return s1;}
    public double getS2(){return s2;}
    public double getS3(){return s3;}


    public double perimeterTri(){
        return s1 + s2 + s3;
    }

    public double areaTri(){
        return (base*height)/2 ;
    }

    // Method to return a string with details of the rectangle's length, width, perimeter, and area

    public String info(){
        String s = "Perimeter of Triangle: " + perimeterTri() + "\nArea of Triangle: " + areaTri() + "\nSides: " + s1 + "," + s2 + "," + s3;
        return s;
    }
}
