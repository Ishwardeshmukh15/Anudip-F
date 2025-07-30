class animal1 {
    void sound(){
        System.out.println("The animal makes a sound");
    }
}
    class Dog extends animal1{
        void sound(){
            System.out.println("The dog barks");
            }
        }

public class animal2{
    public static void main(String[] args) {
        animal1 d = new Dog();
        d.sound();
        }
}
