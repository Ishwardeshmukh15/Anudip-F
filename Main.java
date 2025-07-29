class Employee {
    double salary =20000;
    String name ="Akash babu";
    void display(){
        System.out.println("Name"+ name);
        System.out.println("Salary"+ salary);
    }
}
class Devloper extends Employee{
    String lang ="Java";
    void showDevInfo(){
        System.out.println("Language"+lang);
    }
}
class manager extends Devloper{
    int teamsize =30;
    void showTeamsInfo(){
        System.out.println("Team Size"+teamsize);
    }
}
public class Main {
    public static void main(String[] args) {
        manager m = new manager();
        m.showDevInfo();
        m.showTeamsInfo();
        m.display();
    
    }
}
