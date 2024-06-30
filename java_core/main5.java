package java_core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main5 {


    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("filename.txt");
        FileReader fileReader = null; // Initialize FileReader to null

        try {
            fileReader = new FileReader(myFile);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                // Use BufferedReader to read from file
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close(); // Close FileReader in finally block
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String toString() {
        return "main5 []";
    }

    public void writeBytesToFile(String fileName, byte[] data) {
        try {
            File fileOut = new File(fileName);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true));
            for (byte dataS : data) {
                writer.write(dataS);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }
}



/*
 * File За допомогою класу File з пакета java.io можна створювати та видаляти файли та директорії,
 * перейменовувати їх тощо. Він має такі методи: createNewFile(), delete(), exists(), getName(),
 * getAbsolutePath(), mkdir( ).
 * 
 * Щоб його використати, створи новий об'єкт та вкажи назву файлу або директорії:
 * 
 * File myFile = new File("filename.txt"); // specified the filename File myFile = new
 * File("directory"); // specified the directory
 * 
 * 
 * FileWriter Клас FileWriter з пакета java.io використовується для запису даних у файл у вигляді
 * символів. Це найпростіший спосіб запису даних до файлу. Цей клас надає методи для даних типу int,
 * масивів байтів та рядків:
 * 
 * File myFile = new File("filename.txt"); FileWriter fileWriter = new FileWriter(myFile); // passed
 * File to constructor FileWriter fileWriter = new FileWriter("filename.txt"); // passed filename to
 * constructor
 * 
 * FileWriter рекомендується використовувати лише для невеликих файлів, оскільки при кожному записі
 * даних весь вміст файлу перезаписується.
 * 
 * BufferedWriter Клас BufferedWriter з пакета java.io використовується з іншими класами для більш
 * ефективної роботи. За замовчуванням він має внутрішній буфер у 8192 символів.
 * 
 * BufferedWriter дуже схожий на FileWriter. Єдина відмінність: символи спочатку записуються в
 * буфер, а коли він заповнюється — дані переміщаються у файл. Таким чином, використання
 * BufferedWriter дозволяє зменшити кількість звертань до файлу та покращити продуктивність:
 * 
 * File myFile = new File("filename.txt"); FileWriter fileWriter = new FileWriter(myFile);
 * BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // passed FileWriter to
 * constructor
 * 
 * Files Клас Files з пакета java.nio.file надає зручний спосіб взаємодії з файловою системою. Він
 * містить методи для виконання різних операцій із файлами, наприклад, копіювання, переміщення,
 * видалення, перевірка наявності файлу та отримання властивостей файлу, таких як розмір, час
 * створення тощо. Files також надає можливість зчитування або записування вмісту файлу за допомогою
 * методів readAllBytes() та write().
 */
