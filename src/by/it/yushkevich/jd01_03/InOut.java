package by.it.yushkevich.jd01_03;

class InOut {

    static double[] getArray(String line) {
        line = line.trim(); // удаляем пробелы в начале и конце нашей строчки
        String[] symbols = line.split(" "); //регулярным выражением выставляем разделитель --- в данном случае пробел
        double[] numbers = new double[symbols.length]; // создаем такой же массив по размеру, чтоб туда перепарсить буквенные символы в дабл

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Double.parseDouble(symbols[i]); //  заполняем новый массив
        }


        return numbers;
    }

    static void printArray(double[] array) {

        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    static void printArray(double[] array, String name, int columnCount) {
        // massive[ 0 ]=123.456  massive[ 1 ]=123.456
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[%-1d]=%-8.2f ", name, i, array[i]);
            if (((i+1) % columnCount == 0) || (array.length ==i+1)) {
                System.out.println();

            }

        }
    }
}
