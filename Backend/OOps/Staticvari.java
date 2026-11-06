package OOps;

public class Staticvari {
    int a = 50;

    static String name = "Murugan R";
    static { // static block
       
        System.out.println("I am the normal member function and static block"+name);

    }

    static void dummy() {
        System.out.println("I am the normal member function");
    }

    public static void main(String[] args) {
        // Staticvari s1 = new Staticvari();
        // System.out.println(s1.a);
        // System.out.println(name);
        dummy();

    }
}
