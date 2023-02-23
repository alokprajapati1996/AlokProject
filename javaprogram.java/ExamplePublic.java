public class ExamplePublic {
   private int id,roll_no;
   private String name;

ExamplePublic(int id,String name,int roll_no)
{
    this.id=id;
    this.name=name;
    
    this.roll_no=roll_no;
    System.out.println(id+" "+name+" "+roll_no);
    
} 
class Manisha{}

public static void Mainn()
{

}


class Myname{
public static void main(String[] args) {
    ExamplePublic si=new ExamplePublic(3, "Alok", 3252343);
}   
}
}