package by.it.zaretskaya.jd01_03;

public class Helper {
     public static void main(String[] args) {
         double[] array = {11, 22, 33, 66, 99, 0, 123, -9};
         sort(array);

     }

     static void sort(double[] array) {
         int lastIndex = array.length - 1;
         boolean sortNotComplete;
         do {
             sortNotComplete=false;

             for (int i = 0; i < lastIndex; i++) {
                 if (array[i] > array[i + 1]) {
                     double temp = array[i];
                     array[i] = array[i + 1];
                     array[i + 1] = temp;
                     sortNotComplete=true;

                 }

             }
             lastIndex--;
         } while (sortNotComplete);


     }
     static double findMin (double[] array){
         double min=0;
         for (int i = 0; i < array.length; i++) {
           if (array[i]<min); {
               min=array[i];
             }
         }
         return (min);
     }
     static double findMax(double[]array) {
         double max = 0;
         for (int i = 0; i < array.length; i++) {
             if (array[i] > max) ;
             max = array[i];
         }
         return (max);
     }
 }
