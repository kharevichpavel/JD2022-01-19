//package by.it.yushkevich.jd01_06;
//
//public class TaskC1 {
//
//
//    public static void main(String[] args) {
//        String regex = "[\n]";
//        String[] array = Poem.text.split(regex);
//
////        for (int i = 0; i < array.length; i++) {
////            System.out.printf("INDEX - [%d]   TEXT - {%s}%n",i,array[i]);
////        }
//
//        findMaxLengthString(array);
//        checkSentence(array);
//
//
//    }
//
//    private static void checkSentence(String[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//
//            boolean isDone = false;
//            int spacePosition = array[i].indexOf(" ");
//
//            if (array[i].length() == findMaxLengthString(array)) {
//                continue;
//            }
//
//            while (!isDone) {
//
//
//
//                if (array[i].length()==findMaxLengthString(array)){
//                    isDone = true;
//                }
//
//
//
//
//
//            }
//
//
//
//
//
//
//
//        }
//
//    }
//
//    private static int findMaxLengthString(String[] array) {
//        int maxLength = array[0].length();
//        int indexMaxLength = 0;
//        for (int i = 1; i < array.length; i++) {
//
//            if (array[i].length() > maxLength) {
//
//                maxLength = array[i].length();
//                indexMaxLength = i;
//
//            }
//        }
//        System.out.printf("Максимальная длинна - [%d]  Index - [%d]", maxLength, indexMaxLength);
//        return maxLength;
//    }
//
//
//
//
//
//}
