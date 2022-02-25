package by.it.skorobogatyi.jd02_02.entity;

public class Manager {

    public final int planCount;
    public int customerIn;
    public int customerOut;


    public Manager(int planCount) {
        this.planCount = planCount;
    }

    public void customerIn() {
        customerIn++;
    }

    public void customerOut() {
        customerOut++;
    }

    boolean shopOpened() {
        return customerIn != planCount;
    }

    boolean shopClosed() {
        return customerOut == planCount
    }
}
