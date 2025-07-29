public class animal{
    void eat(){
        System.out.println("this Animal can eat! ");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public static void main(String []args){
    Dog d = new Dog();
    

}