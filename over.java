class Overloading{
    String msg(String msg){
        return msg;
    }
    int num(int a, int b){
        return a+b;
    }
    double num(double a, double b){
        return a+b;
    }
}
public class over{
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println(obj.msg("Hello"));
        System.out.println(obj.num(10, 20));
        System.out.println(obj.num(10.5, 20.5));
}
}
