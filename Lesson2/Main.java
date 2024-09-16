public class Main {
    public static void main(String[] args) {
        
         // (Задание 1-4)
        PrintThreeWords.printThreeWords();
        CheckSumSign.checkSumSign();
         PrintColor.printColor();
        CompareNumbers.compareNumbers();
    
         // (Задание 5)
        boolean rangeCheck = IsWithinRange.isWithinRange(5, 7);
        System.out.println("Сумма в пределах от 10 до 20 включительно: " + rangeCheck);
    
        // (Задание 6)
         PrintSign.printSign(-5);
    
          // (Задание 7)
         boolean positiveCheck = IsPositive.isPositive(10);
        System.out.println("Число положительное: " + positiveCheck);
    
        // Вызов метода repeatString (Задание 8)
        RepeatString.repeatString("Hello", 3);

        // Вызов метода isLeapYear (Задание 9)
        boolean leapYear = LeapYear.isLeapYear(2024);
        System.out.println("Високосный год: " + leapYear);

        // Вызов метода fillArray  (задание 10)
        int[] binaryArray = {1, 0, 1, 0, 1, 0};
        BinaryArray.fillArray(binaryArray);
        System.out.println("Заполненный массив: " + java.util.Arrays.toString(binaryArray));

        // Вызов метода fillArray (задание 11)
        int[] array100 = new int[100];
        FillArray.fillArray(array100);
        System.out.println("Массив от 1 до 100: " + java.util.Arrays.toString(array100));

        // Вызов метода multiplyElements  (задание 12)
        int[] arrayToMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        MultiplyLessThanSix.multiplyElements(arrayToMultiply);
        System.out.println("Массив после умножения: " + java.util.Arrays.toString(arrayToMultiply));

        // Вызов метода fillDiagonals  (задание 13)
        int[][] squareArray = new int[5][5];
        SquareArray.fillDiagonals(squareArray);
        for (int[] row : squareArray) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // Вызов метода createArray  (задание 14)
        int[] newArray = ArrayWithInitialValue.createArray(5, 7);
        System.out.println("Созданный массив: " + java.util.Arrays.toString(newArray));
    }
}
