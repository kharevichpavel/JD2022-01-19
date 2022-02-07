package by.it.skorobogatyi.jd01_09;

class Matrix extends Var implements Operation {

    private final double[][] value;


    public Matrix(double[][] value) {
        this.value = value.clone();
    }


    public Matrix(Matrix otherMatrix) {
        this.value = otherMatrix.value.clone();
    }


    public Matrix(String stringWithMatrix) {

        String[] matrixElements = stringWithMatrix.split("[^0-9],\s?[^0-9]");

        value = new double[matrixElements.length][0];

        for (int i = 0; i < matrixElements.length; i++) {

            matrixElements[i] = matrixElements[i].replaceAll("[{},\\s]+", " ").trim();
            String[] lineElements = matrixElements[i].split(" ");

            double[] lineElementsInDouble = new double[lineElements.length];

            for (int j = 0; j < lineElements.length; j++) {
                lineElementsInDouble[j] = Double.parseDouble(lineElements[j]);
            }

            value[i] = lineElementsInDouble;
        }
    }


    public double[][] getValue() {
        return this.value;
    }

    @Override
    public String toString() {

        StringBuilder returnString = new StringBuilder();

        returnString.append("{");
        for (int i = 0; i < value.length; i++) {
            returnString.append("{");

            for (int j = 0; j < value[i].length - 1; j++) {
                double element = value[i][j];
                returnString.append(element).append(", ");
            }

            returnString.append(value[i][value[i].length - 1]).append("}");

            if (i < value.length - 1) {
                returnString.append(", ");
            }
        }
        returnString.append("}");

        return String.valueOf(returnString);
    }


    @Override
    public Var add(Var other) {
        return other.add(this);
    }

    @Override
    public Var add(Scalar other) {

        double[][] returnMatrix = this.value.clone();
        for (int i = 0; i < this.value.length; i++) {
            for (int j = 0; j < this.value[i].length; j++) {
                returnMatrix[i][j] = other.getValue() + returnMatrix[i][j];
            }
        }

        return new Matrix(returnMatrix);
    }

    @Override
    public Var add(Vector other) {
        System.out.printf("Operation addition %s + %s impossible%n", this, other);
        return null;
    }

    @Override
    public Var add(Matrix other) {

        if (other.value.length != this.value.length) {
            System.out.printf("Operation addition %s + %s impossible%n", this, other);
            return null;
        }

        for (int i = 0; i < this.value.length; i++) {
            if (other.value[i].length != this.value[i].length) {
                System.out.printf("Operation addition %s + %s impossible%n", this, other);
                return null;
            }
        }

        double[][] returnMatrix = new double[this.value.length][];

        for (int i = 0; i < this.value.length; i++) {
            returnMatrix[i] = new double[this.value[i].length];

            for (int j = 0; j < this.value[i].length; j++) {
                returnMatrix[i][j] = other.value[i][j] + this.value[i][j];
            }
        }

        return new Matrix(returnMatrix);
    }


    @Override
    public Var sub(Var other) {
       return other.sub(this);
    }

    @Override
    public Var sub(Scalar other) {

        double[][] returnMatrix = this.value.clone();
        for (int i = 0; i < this.value.length; i++) {
            for (int j = 0; j < this.value[i].length; j++) {
                returnMatrix[i][j] = returnMatrix[i][j] - other.getValue();
            }
        }

        return new Matrix(returnMatrix);
    }

    @Override
    public Var sub(Vector other) {
        System.out.printf("Operation subtraction %s - %s impossible%n", this, other);
        return null;
    }

    @Override
    public Var sub(Matrix other) {

        if (other.value.length != this.value.length) {
            System.out.printf("Operation subtraction %s - %s impossible%n", this, other);
            return null;
        }

        for (int i = 0; i < this.value.length; i++) {
            if (other.value[i].length != this.value[i].length) {
                System.out.printf("Operation subtraction %s - %s impossible%n", this, other);
                return null;
            }
        }

        double[][] returnMatrix = new double[this.value.length][];

        for (int i = 0; i < this.value.length; i++) {
            returnMatrix[i] = new double[this.value[i].length];

            for (int j = 0; j < this.value[i].length; j++) {
                returnMatrix[i][j] = other.value[i][j] - this.value[i][j];
            }
        }

        return new Matrix(returnMatrix);
    }


    @Override
    public Var mul(Var other) {
        return other.mul(this);
    }

    @Override
    public Var mul(Scalar other) {
        double[][] returnMatrix = this.value.clone();
        for (int i = 0; i < this.value.length; i++) {
            for (int j = 0; j < this.value[i].length; j++) {
                returnMatrix[i][j] = other.getValue() * returnMatrix[i][j];
            }
        }
        return new Matrix(returnMatrix);
    }

    @Override
    public Var mul(Vector other) {

        if (other.getValue().length != this.value[0].length) {
            System.out.printf("Operation multiplication %s * %s impossible%n", this, other);
            return null;
        }

        double[] returnVector = new double[this.value.length];

        for (int i = 0; i < this.value.length; i++) {
            for (int j = 0; j < other.getValue().length; j++) {
                returnVector[i] = this.value[i][j] * other.getValue()[j] + returnVector[i];
            }
        }

        return new Vector(returnVector);
    }

    @Override
    public Var mul(Matrix other) {

        if (this.value[0].length != other.value.length) {
            System.out.printf("Operation multiplication %s * %s impossible%n", this, other);
            return null;
        }

        double[][] returnMatrix = new double[this.value.length][other.value[0].length];

        for (int i = 0; i < returnMatrix.length; i++) {
            for (int j = 0; j < returnMatrix[0].length; j++) {
                for (int k = 0; k < this.value[0].length; k++) {
                    returnMatrix[i][j] = returnMatrix[i][j] + other.value[i][k] * this.value[k][j];
                }
            }
        }

        return new Matrix(returnMatrix);
    }


    @Override
    public Var div(Var other) {
        return other.div(this);
    }

    @Override
    public Var div(Scalar other) {

        if (other.getValue() != 0) {

            double[][] returnMatrix = this.value.clone();
            for (int i = 0; i < this.value.length; i++) {
                for (int j = 0; j < this.value[i].length; j++) {
                    returnMatrix[i][j] = other.getValue() / returnMatrix[i][j];
                }
            }

            return new Matrix(returnMatrix);
        }

        System.out.printf("Operation division %s / %s impossible%n", this, other);
        return null;
    }

    @Override
    public Var div(Vector other) {
        System.out.printf("Operation division %s / %s impossible%n", this, other);
        return null;
    }

    @Override
    public Var div(Matrix other) {
        System.out.printf("Operation division %s / %s impossible%n", this, other);
        return null;
    }
}
