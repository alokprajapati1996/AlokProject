public class ArgumentMethod {
     ArgumentMethod(ThisConstructor s2){

        System.out.println("hello everone my name alok");
    }}
    class ThisConstructor{
    void Thismethod(){
        ArgumentMethod s2= new ArgumentMethod(this);
        

        System.out.println("hello everone my name Amit");    
    }
    
    public static void main(String[] args) {
        ThisConstructor s1=new ThisConstructor(){
        s1.Thismethod();
    }
}

