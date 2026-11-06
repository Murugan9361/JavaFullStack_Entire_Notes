package OOps;

public class ClasObj {
     String company="Abc Technologies";
     String name;
     int age;
     long salary;

    public ClasObj(String name, int age, long salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Name is "+name+" age is "+age+" Salary is "+salary+" Office Name "+company);
    }
    public static void main(String[] args) {
       ClasObj krishna=new ClasObj("Krishna Prakash", 25, 100000);
       ClasObj balaji=new ClasObj("balaji", 24, 80000);
       ClasObj akashh=new ClasObj("Akashh", 24, 120000);
       krishna.displayDetails();
       balaji.displayDetails();
       akashh.displayDetails();

       

        
    }
    
}
