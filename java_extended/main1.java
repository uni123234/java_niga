package java_extended;

public class main1 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][4];
        System.out.println(matrix);
    }
}

// int[][] array = new int[][] {
//     {5, 10},
//     {15, 20}
// };

// те ж саме що й:

// int[][] array = new int[2][2];

// array[0][0] = 5;
// array[0][1] = 10;
// array[1][0] = 15;
// array[1][1] = 20;


// char[][] sosSignal = new char[3][3];
// sosSignal[0][0] = 'x';
// sosSignal[0][1] = 'x';
// sosSignal[0][2] = 'x';
// sosSignal[1][0] = 'S';
// sosSignal[1][1] = 'O';
// sosSignal[1][2] = 'S';
// sosSignal[2][0] = 'x';
// sosSignal[2][1] = 'x';
// sosSignal[2][2] = 'x';

//Write code below this line
// int neighboursCellsSum = array[rowIndex][columnIndex + 1] + array[rowIndex][columnIndex - 1] + array[rowIndex - 1][columnIndex] + array[rowIndex + 1][columnIndex];
//Write code above this line

// int[][][] array = new int[2][3][4];

// array[1][2][3] = 10;

// System.out.println(array[1][2][3]);

// int[][][][][] fiveDimensionsArray = new int[1][1][1][1][5]; // 5-вимірний масив
// fiveDimensionsArray[0][0][0][0][0] = 1;
// fiveDimensionsArray[0][0][0][0][1] = 0;
// fiveDimensionsArray[0][0][0][0][2] = -9;
// fiveDimensionsArray[0][0][0][0][3] = 5;
// fiveDimensionsArray[0][0][0][0][4] = 10;

// int[][] array = new int[][] {
//     {5, 10, 20, -3}, 
//     {15, 20} // кількість стовпців може відрізнятися в рядках
// };

// for (int i = 0; i < array.length; i++) { // ітерація кожного рядка
//     for (int j = 0; j < array[i].length; j++) { // ітерація кожного стовпця в `i`-му рядку
//         System.out.println(array[i][j]);
//     }
// }

// int[][][] array = new int[2][3][4];

// for (int i = 0; i < array.length; i++) {
//     for (int j = 0; j < array[i].length; j++) {
//         for (int k = 0; k < array[i][j].length; k++) {
//             int value = array[i][j][k];
             // інші команди
//         }
//     }
// }

// public class PrintMatrix {
//     public static void main(String[] args) {
         // матриця має два рядки та чотири стовпці
//         int[][] matrix = new int[][] {
//             {-4, 5, -1, 10},
//             {10, 1, 11, 70}
//         };

        // друкувати кожен елемент на новому рядку
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.println(i + " " + j + " = " + matrix[i][j]);
//             }
//         }
//     }
// }
