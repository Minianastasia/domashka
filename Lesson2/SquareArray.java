public class SquareArray {
    public static void fillDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1; // Заполнение главной диагонали
            array[i][array.length - i - 1] = 1; // Заполнение побочной диагонали
        }
    }
}
