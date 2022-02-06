package by.it.skorobogatyi.jd01_08;

abstract class Var implements Operation {



    @Override
    public abstract Var add(Var other);

    public abstract Var add(Scalar other);

    public abstract Var add(Vector other);

    public abstract Var add(Matrix other);


    @Override
    public abstract Var sub(Var other);

    public abstract Var sub(Scalar other);

    public abstract Var sub(Vector other);

    public abstract Var sub(Matrix other);


    @Override
    public abstract Var mul(Var other);

    public abstract Var mul(Scalar other);

    public abstract Var mul(Vector other);

    public abstract Var mul(Matrix other);


    @Override
    public abstract Var div(Var other);

    public abstract Var div(Scalar other);

    public abstract Var div(Vector other);

    public abstract Var div(Matrix other);


    @Override
    public String toString() {
        return "unknown variable";
    }
}
