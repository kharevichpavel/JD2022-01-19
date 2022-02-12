package by.it.kharevich.jd01_09;

class Matrix extends Var {

    private final double[][] value;

    public Matrix(double[][] value) {
        double[][] secondMatrix = value.clone();
        for (int i = 0; i < secondMatrix.length; i++) {
            secondMatrix[i] = secondMatrix[i].clone();
        }
        this.value = secondMatrix;
    }

    public Matrix(Matrix otherMatrix) {
        double[][] secondMatrix = otherMatrix.value.clone();
        for (int i = 0; i < secondMatrix.length; i++) {
            secondMatrix[i] = secondMatrix[i].clone();
        }
        this.value = secondMatrix;
    }

 /*   public Matrix(String strMatrix) {
        strMatrix = strMatrix.replaceAll("[{ }]", "");
        String[] strMatrixarr = strMatrix.split(",");
        this.value = new double[strVectorArr.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble(strVectorArr[i]);
        }*/

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("{");
        for (int i = 0; i < value.length; i++) {
            out.append("{");
            String delimiter = ",";
            for (int i1 = 0; i1 < value[i].length; i1++) {
                out.append(value[i][i1]).append(delimiter);
                delimiter = "";
                if (i == value.length - 1) {
                    out.append(delimiter);
                }
            }
            delimiter = ",";
            if (i == value.length - 1) {
                delimiter = "";
                out.append(delimiter);
            }
            out.append("}").append(delimiter);
        }
        out.append("}");
        return out.toString();
    }
}
