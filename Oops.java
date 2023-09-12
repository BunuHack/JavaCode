import java.util.Scanner;

class Student{
    String name;
    int age;
    
    public void getinfo(){
        System.out.println("The Name of The Student Is "+this.name);
        System.out.println("The Age of The Student Is "+this.age);
    }
}

//Non-Parameterized constructor 
// class Student {
//     String name;
//     int age;
   
//     Student() {
//         System.out.println("Constructor called");
//     }
//  }



//Parameterized Constructor
//  class Student {
//     String name;
//     int age;
   
//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//         System.out.println("Your Name Is "+name);
//         System.out.println("Your Age Is "+age);
//     }
//  }
 
 
 
public class Oops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(); 
        System.out.println("Entered The First Student Name :");
        s1.name = sc.nextLine();
        System.out.println("Entered The First Student Age :");
        s1.age = sc.nextInt();
        s1.getinfo();

        Student s2 = new Student();
        sc.nextLine();
        System.out.println("Entered The Second Student Name :");
        s2.name = sc.nextLine();
        System.out.println("Entered The Second Student Age :");
        s2.age = sc.nextInt();
        s2.getinfo();
        // Student s1 = new Student();  //Non-Parameterized constructor
        // Student s1 = new Student("Bunu",18); //Parameterized Constructor
       
    }
}
