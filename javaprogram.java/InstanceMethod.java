public class InstanceMethod {
    public static void main(String[] args) {
        InstanceMethod sc=new InstanceMethod();


   int num= sc.add(34,64);
     System.out.println(num);

    }
    public static int add(int a,int b){
        int sum=a+b;
        return sum;
    } 
    
}
