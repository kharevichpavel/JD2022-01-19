package by.it.zaretskaya.jd02_02.entity;

public class Manager {
    public  final int planCount;
    public   int countCustomerIn;
    public   int countCustomerOut;


    public Manager(int planCount) {
        this.planCount=planCount;
    }

    public void customerIn(){
        countCustomerIn++;
    }
    public void customerOut(){
        countCustomerOut++;
    }
    public boolean shopOpened(){
        return countCustomerIn!=planCount;
    }
   public boolean shopClose(){
        return countCustomerOut==planCount;
    }
}
