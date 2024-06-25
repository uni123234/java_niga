public class main9 {
    public static void main(String[] args) {
        // Створення та ініціалізація масиву
        int[] numbers = {1, 2, 3, 4, 5};

        // Виведення елементів масиву
        System.out.println("Елементи масиву:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Зміна значення елемента масиву
        numbers[2] = 10;
        System.out.println("\nПісля зміни третього елемента на 10:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Сума елементів масиву
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("\nСума елементів масиву: " + sum);

        // Знаходження максимального значення
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальне значення в масиві: " + max);

        // Сортування масиву
        java.util.Arrays.sort(numbers);
        System.out.println("\nВідсортований масив:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
