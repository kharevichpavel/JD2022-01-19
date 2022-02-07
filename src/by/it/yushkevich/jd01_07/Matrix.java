package by.it.yushkevich.jd01_07;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix extends Var {

    private double[][] value;


    public Matrix(double[][] value) {
        this.value = value.clone();
    }


    public Matrix(Matrix otherMatrix) {

        this.value = otherMatrix.value.clone();// надо подумать как клонировать двумерный массив. возможно циклом?
    }

    //ПОДСМОТРЕЛ У ДРУГОГО СТУДЕНТА РЕШЕНИЕ, ПЕРЕДЕЛАЛ РАЗБИРАЯСЬ, САМ БЫ НЕ СДЕЛАЛ
    public Matrix(String textMatrix) {

        // Оставляем } и по ним посчитаем количество рядом, остальные скобки заменяем пустым местом
        String textForRows = textMatrix.replaceAll("[{]+|[}]{2,}", "");
        System.out.println(textForRows);

        textForRows = textForRows.trim();
        System.out.println(textForRows);
        // разбиваем в массив нашу строку и делим по той скобке, сколько ячеек - столько и рядов
        String[] rows = textForRows.split("},");

        for (int i = 0; i < rows.length; i++) {
            System.out.println(i + "MASSIVE ROWS" + rows[i]);
        }

        int rowsCount = rows.length; //6
        System.out.println(rowsCount);
        // видим что в одной ячейке два числа разделены запятой, разбиваем снова и на мелкий массив и смотрим размер (это количество колонок)
        String[] col = rows[0].trim().split(",");
        int colCount = col.length;

        for (int i = 0; i < col.length; i++) {
            col[i].trim();
            System.out.println(i+ " "+ col[i]);
            //System.out.println(colCount);
        }
        // создаем временный двумерный массив вуказывая нужный размеры рядов/столбцов и заполняем из rows.
        //   Массив [0] =rows[0].trim().split("[,]"); т.е. разбиваем например ячейку 0, в ровс, на два массива и вписыв в буфер
        String[][] buffArray = new String[rowsCount][colCount];
        for (int i = 0; i < buffArray.length; i++) {
            buffArray[i] = rows[i].trim().split("[,]");

        }
        // просто парсим в дабловый массив 
        double[][] value = new double[rowsCount][colCount];
        for (int i = 0; i < buffArray.length; i++) {
            for (int j = 0; j < buffArray[i].length; j++) {
                value[i][j] = Double.parseDouble(buffArray[i][j]);
            }
        }
        this.value = value;

    }


    @Override
    public String toString() {

        StringBuilder out = new StringBuilder();
        out.append("{");


        for (int i = 0; i < value.length; i++) {
            out.append("{");
            for (int j = 0; j < value[i].length; j++) {

                out.append(value[i][j]);

                if (j < value[i].length - 1) {
                    out.append(",");

                }
            }

            out.append("}");
            if (i < value.length - 1) {
                out.append(",");
            }
        }
        out.append("}");

        return out.toString();
    }
}
