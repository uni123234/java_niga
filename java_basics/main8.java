public class main8 {
    public static void main(String[] args) {
        // Приклад циклу for
        System.out.println("Цикл for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // Приклад циклу while
        System.out.println("\nЦикл while:");
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Приклад циклу do-while
        System.out.println("\nЦикл do-while:");
        i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        // Вкладені цикли
        System.out.println("\nВкладені цикли:");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.println("j = " + j + ", k = " + k);
            }
        }

        // Використання оператора break
        System.out.println("\nЦикл з оператором break:");
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break; // припиняє виконання циклу
            }
            System.out.println("j = " + j);
        }

        // Використання оператора continue
        System.out.println("\nЦикл з оператором continue:");
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                continue; // переходить до наступної ітерації
            }
            System.out.println("j = " + j);
        }
    }
}
