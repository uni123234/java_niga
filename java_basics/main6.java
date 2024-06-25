public class main6 {
    public static void main(String[] args) {
        int age = 17;
        boolean hasAccess = age >= 18;
        System.out.println(hasAccess);

        if (hasAccess) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        } // && = and
    }
}

// and
// public class Main {
// public static void main(String[] args) {
// // Перевірка різних значень змінної x
// int x = 7; // Спробуйте змінити це значення для тестування

// // Записуємо результат перевірки в змінну result
// boolean result = x > 5 && x < 10;

// // Виводимо результат
// System.out.println("Результат перевірки: " + result);
// }
// }

// or
// public class Main {
// public static void main(String[] args) {
// // Перевірка різних значень змінної x
// int x = -5; // Спробуйте змінити це значення для тестування

// // Записуємо результат перевірки в змінну result
// boolean result = x < 0 || x > 3;

// // Виводимо результат
// System.out.println("Результат перевірки: " + result);
// }
// }
