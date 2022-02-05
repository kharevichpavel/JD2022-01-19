package by.it.skorobogatyi.jd01_08;

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

        if (other instanceof Matrix matrix) {

            if (matrix.value.length != this.value.length) {
                return super.add(other);
            }

            for (int i = 0; i < this.value.length; i++) {
                if (matrix.value[i].length != this.value[i].length) {
                    return super.add(other);
                }
            }

            double[][] returnMatrix = new double[this.value.length][];

            for (int i = 0; i < this.value.length; i++) {
                returnMatrix[i] = new double[this.value[i].length];

                for (int j = 0; j < this.value[i].length; j++) {
                    returnMatrix[i][j] = this.value[i][j] + matrix.value[i][j];
                }
            }
            return new Matrix(returnMatrix);
        }

        if (other instanceof Scalar scalar) {

            double[][] returnMatrix = this.value.clone();
            for (int i = 0; i < this.value.length; i++) {
                for (int j = 0; j < this.value[i].length; j++) {
                    returnMatrix[i][j] += scalar.getValue();
                }
            }
            return new Matrix(returnMatrix);
        }

        return super.add(other);
    }

    @Override
    public Var sub(Var other) {

        if (other instanceof Matrix matrix) {

            if (matrix.value.length != this.value.length) {
                return super.add(other);
            }

            for (int i = 0; i < this.value.length; i++) {
                if (matrix.value[i].length != this.value[i].length) {
                    return super.add(other);
                }
            }

            double[][] returnMatrix = new double[this.value.length][];

            for (int i = 0; i < this.value.length; i++) {
                returnMatrix[i] = new double[this.value[i].length];

                for (int j = 0; j < this.value[i].length; j++) {
                    returnMatrix[i][j] = this.value[i][j] - matrix.value[i][j];
                }
            }
            return new Matrix(returnMatrix);
        }

        if (other instanceof Scalar scalar) {

            double[][] returnMatrix = this.value.clone();
            for (int i = 0; i < this.value.length; i++) {
                for (int j = 0; j < this.value[i].length; j++) {
                    returnMatrix[i][j] -= scalar.getValue();
                }
            }
            return new Matrix(returnMatrix);
        }

        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {

        if (other instanceof Scalar scalar) {

            double[][] returnMatrix = this.value.clone();
            for (int i = 0; i < this.value.length; i++) {
                for (int j = 0; j < this.value[i].length; j++) {
                    returnMatrix[i][j] *= scalar.getValue();
                }
            }
            return new Matrix(returnMatrix);
        }

        if (other instanceof Vector vector) {
            if (this.value[0].length != vector.getValue().length) {
                return super.mul(other);
            }

            double[] returnVector = new double[this.value.length];

            for (int i = 0; i < this.value.length; i++) {
                for (int j = 0; j < vector.getValue().length; j++) {
                    returnVector[i] = returnVector[i] + this.value[i][j] * vector.getValue()[j];
                }
            }

            return new Vector(returnVector);
        }

        if (other instanceof Matrix matrix) {
            if (this.value[0].length != matrix.value.length) {
                return super.mul(other);
            }

            double[][] returnMatrix = new double[this.value.length][matrix.value[0].length];

            for (int i = 0; i < returnMatrix.length; i++) {
                for (int j = 0; j < returnMatrix[0].length; j++) {
                    for (int k = 0; k < this.value[0].length; k++) {
                        returnMatrix[i][j] = returnMatrix[i][j] + this.value[i][k] * matrix.value[k][j];
                    }
                }
            }
            return new Matrix(returnMatrix);
        }

        return super.mul(other);
    }

    @Override
    public Var div(Var other) {

        if (other instanceof Scalar scalar) {
            if (scalar.getValue() != 0) {

                double[][] returnMatrix = this.value.clone();
                for (int i = 0; i < this.value.length; i++) {
                    for (int j = 0; j < this.value[i].length; j++) {
                        returnMatrix[i][j] /= scalar.getValue();
                    }
                }
                return new Matrix(returnMatrix);
            }
        }

        return super.div(other);
    }
}
