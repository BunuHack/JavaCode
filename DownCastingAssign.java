class Parent{
    void call(){
        System.out.println("====Parent Class===="); 
    }
}
class Child extends Parent{
    void call(){
        System.out.println("=====Child Class=====");
    }
}
public class DownCastingAssign {
    public static void main(String[] args) {
        Parent p = new Child(); //UpCasting
        Child c = (Child) p; //DownCasting
        c.call();
    }
   
}
