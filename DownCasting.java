import javax.xml.transform.Source;

class Teacher{
    String name = "Pabitra Sir";
    void common(){


    }
}
class Student extends Teacher{

    void Student1(){
        String name = "Bunu";
        String ph = "7608816541";
        String roll = "13";
        System.out.println("First Student Name Is "+name);
        System.out.println("First Student Roll no. Is "+roll);
        System.out.println("First Student phone number Is "+ph);

    }
    void Student2(){
        String name = "Subhra";
        String ph = "7735...";
        String roll = "28";
        System.out.println("Second Student Name Is "+name);
        System.out.println("Second Student Roll no. Is "+roll);
        System.out.println("Second Student phone number Is "+ph);

    }
    void Student3(){
        String name = "Sujal";
        String ph = "80188...";
        String roll = "29";
        System.out.println("Third Student Name Is "+name);
        System.out.println("Third Student Roll no. Is "+roll);
        System.out.println("Third Student phone number Is "+ph);

    }

    void common(){
        System.out.println("Student List :");
        System.out.println("____________________");
        System.out.println();
        Student1();
        System.out.println();
        Student2();
        System.out.println();
        Student3();
    }
}



public class DownCasting {
    public static void main(String[] args) {
        
        Teacher obj = new Student(); // UpCasting
        Student obj1 = (Student) obj;//DownCasting
        System.out.println();   
        System.out.println("The Teacher Name Is : "+obj1.name);
        obj1.common();

    }
}
