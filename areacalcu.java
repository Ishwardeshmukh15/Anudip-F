class cal {
    int area(int side){
        return side*side;
    }
    int area(int length, int breadth){
        return length*breadth;
    }
    double area(double radius){
        return 3.14*radius*radius;
    }
}
public class areacalcu {
    public static void main(String[] args) {
        cal obj = new cal();
        System.out.println(obj.area(5));
        System.out.println(obj.area(5,5));
        System.out.println(obj.area(5.0));
    }
}

