class FindArea{

    private int l, b;

    public void setArea(int x , int y){

        this.l=x;
        this.b=y;
    }
    public int getArea(){
        return l*b;

    }
}
public class AreaOfTriangleEncapsulation {
    public static void main(String[] args) {

         FindArea obj = new FindArea();
         obj.setArea(2, 4);
         int sol = obj.getArea();
         System.out.println(sol);

    }
}
