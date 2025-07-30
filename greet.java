class greeting {
    String sayhello(){
        return "Hello";
    }
    String sayhello(String name){
        return "Hello, " + name;
    }
    String sayhello(String name, int age){
        return "Hello, " + name + " you are " + age + " years old";
    }
}
public class greet{
    public static void main(String[] args) {
        greeting g = new greeting();
        System.out.println(g.sayhello());
        System.out.println(g.sayhello("Ishwar"));
        System.out.println(g.sayhello("ishwar", 23));
}
}

