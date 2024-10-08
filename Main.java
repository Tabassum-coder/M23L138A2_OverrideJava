class Parent{
    public void sayHello(){
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    public void sayHello() {
        System.out.println("Hello from Child");
    }
}

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Parent p1=new Child();
        p1.sayHello();
        Parent p2=new Parent();
        p2.sayHello();
    }
}