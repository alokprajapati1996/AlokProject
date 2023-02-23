public class Liabrary{
    
    String name;
    int code;
    public Liabrary(int code,String name){
        this.code=code;
        this.name=name;

    }

}
public class StudyBlocks{
    int fees;
    int age;
    String gender;
    Liabrary liabrary;
    public StudyBlocks (int fees,int age,String gender,Liabrary liabrary){
        this.fees=fees;
        this.age=age;
        this.gender=gender;
        this.liabrary=liabrary;

    }
    void display(){
        System.out.println("id no"+code+ " name"+name);
    }
    public static void main(String[] args) {
        Liabrary liabrary=new Liabrary(1,"alok kumar prajapati");
        display();
    }
}

