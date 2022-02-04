package by.it.burov.jd01_08;

abstract class Var implements Operation {

    @Override
    public Var add(Var other) {
        System.out.printf("Operation addition %s + %s is impossible%n",this,other);
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Operation subtract %s - %s is impossible%n",this, other);
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Operation multiply %s*%s is impossible%n", this, other);

        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Operation division %s/%s is impossible%n",this,other);

        return null;
    }

    @Override
    public String toString() {
        return "unknown variable (abstract stub)";
    }
}
