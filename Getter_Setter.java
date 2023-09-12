import java.util.jar.Attributes.Name;

class Employee{
    private int id;
    private String name;
    
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Getter_Setter {
    public static void main(String[] args) {
        Employee bunu = new Employee();
        bunu.setName("Bunu");
        bunu.setId(888);
        System.out.println(bunu.getName());
        System.out.println(bunu.getId());
    }
}
