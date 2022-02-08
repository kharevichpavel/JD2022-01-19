package by.it.kharevich.jd01_04;

class Helper {

    static void sort(double[] array) {
        boolean swap;
        double lastElement= array.length-1;
        do {
            swap = false;
            for (int i = 0; i < lastElement; i++) {
                if (array[i]>array[i+1]){
                    double bufferElement = array[i];
                    array[i]=array[i+1];
                    array[i+1]=bufferElement;
                    swap = true;
                }
            }
            lastElement--;
        }
        while (swap);
    }
}
