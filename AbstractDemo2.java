abstract class Bank{

    void openAccount(){
        System.out.println("account is opened");
    }
    abstract void deposit(float amt);
}
class CityBank extends Bank{
    public void deposit(float amt){
        System.out.println("Deposited:"+amt);
    }
}
class AbstractDemo2{
    public static void main(String[] args){
        Bank b=new CityBank();//upcasting
        b.openAccount();;
        b.deposit(10000.00f);
    }
}