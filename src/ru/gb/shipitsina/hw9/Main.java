package ru.gb.shipitsina.hw9;

public class Main {

    public static void main(String[] args) {
        String[][] myArr = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println(doTask(myArr));
        } catch (MyArraySizeException ex) {
            System.err.print(ex);
        }

    }


    static int doTask(String[][] myArr) throws MyArraySizeException {

        checkArraySize(myArr.length);
        for (int i = 0; i < myArr.length; i++){
            checkArraySize(myArr[i].length);
        }
        int sum = 0;
        for (int i = 0; i < myArr.length; i++){
            for (int j = 0; j < myArr.length; j++){
                try {
                    sum += Integer.parseInt(myArr[i][j]);
                } catch (NumberFormatException ex){
                    String message = String.format("There is no parsable integer. Value[%s] in [%s][%s]", myArr[i][j], i, j);
                    throw new MyArraySizeException(message, ex);
                }


            }
        }
        return sum;
    }

    static void checkArraySize(int length) throws MyArraySizeException {
        if (length != 4) {
            throw new MyArraySizeException(
                    "Array must be 4x4");
        }
    }
}



