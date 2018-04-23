import java.util.Scanner;

abstract class ObjectVolume
{
    abstract double getVolume();
}

class Sphere extends  ObjectVolume{
    private double rad;
    public Sphere(){
    }
    public Sphere(double rad) {
        this.rad=rad;
    }
    public double getRad() {
        return rad;
    }
    public void  setRad(double r) {
        this.rad = r;
    }
    public double getVolume()
    {
        return 4 * Math.PI*rad*rad*rad/3;
    }
}
class Cude extends ObjectVolume{
    private double length;
    public Cude(){}
    public Cude(double length) {
        this.length=length;
    }
    public double getLength() {
        return  this.length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }


    public double getVolume() {
        return length*length*length;
    }
}

class Cylinder extends ObjectVolume {
    private double rad;
    private double high;

    public Cylinder() {
    }

    public Cylinder(double rad, double high) {
        this.rad = rad;
        this.high = high;
    }

    public  double getRad() {
        return this.rad;
    }

    public    void setRad(double rad) {
        this.rad = rad;
    }

    public   double getHigh() {
        return this.high;
    }

    public  void setHigh(double high) {
        this.high = high;
    }

    public double getVolume() {
        return Math.PI * rad * rad * high;
    }
}
public class Object {
        static double get(ObjectVolume obj)
        {
            return obj.getVolume();
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入1，2 or 3： 1表示球体，2表示立方体，3表示圆柱体");
        int choice = in.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("请输入球的半径");
                double r=in.nextDouble();
                System.out.printf("体积为: %.2f\n",get(new Sphere(r)));
                break;
            case 2:
                System.out.println("请输入立方体的边长");
                double l = in.nextDouble();
                System.out.printf("体积为: %.2f\n",get(new Cude(l)));
                break;
            case 3:
                System.out.println("请输入圆柱体的底面半径和高");
                double dr = in.nextDouble();
                double h = in.nextDouble();
                System.out.printf("面积为: %.2f\n",get(new Cylinder(dr,h)));
                break;
        }

    }

}


