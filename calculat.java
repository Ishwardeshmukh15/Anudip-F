class Cal {
      int add(int a, int b) {
        return a + b;
        }
        double add (double a, double b) {
            return a + b;
        }
        int add(int a, int b, int c) {
            return a + b + c;
        }
        int add(int a, int b, int c, int d) {
            return a + b + c + d;
            }
        }
public class calculat{
    public static void main (String [] args) {
        Cal c = new Cal();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1.0, 2.0));
        System.out.println(c.add(2,3,4));
        System.out.println(c.add(1, 2,5,5));
}
}
        