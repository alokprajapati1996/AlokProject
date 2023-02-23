public class BankProgram {
    int acc_no;String name;float amount;
 void insert(int acc,String n,float amu){
     acc_no=acc;
     name=n;
     amount=amu;
 }
 void diposit(float amu){
     amount=amount+amu;
 }
 void withdrow(float amu){
    if(amount<amu)
    {
        System.out.println("insufficient ballence");

    }
    else{
        amount=amount-amu;
        System.out.println(amount);
    }
}
    void display(){
        System.out.println(acc_no+" "+name+" "+amount);


    }
    void checkbalence()
    {
        System.out.println("totle balence is="+amount);

    }
    class Account{
        public static void main(String[] args) {
            BankProgram bank=new BankProgram();
            bank.insert(123434,"Alok",1000);
            bank.display();
            bank.diposit(5000);
            bank.checkbalence();
            bank.withdrow(5000);
            
            
        }
    }
}

