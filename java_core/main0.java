package java_core;

public class main0 {
    public static void main(String[] args) {
        String str1 = "hello"; // String literal added to the string pool
        String str2 = "hello"; // Reuses the existing string from the pool
        String str3 = new String("hello"); // Creates a new String object

        System.out.println(str1 == str2); // true, both reference the same string in the pool
        System.out.println(str1 == str3); // false, different objects, not from the pool

        Integer num1 = 10; // Integer literal added to the integer pool
        Integer num2 = 10; // Reuses the same object from the pool

        System.out.println(num1 == num2); // true, both reference the same object in the pool

        Integer num3 = 200; // Creates a new Integer object (outside the pool)
        Integer num4 = 200; // Creates another new Integer object (outside the pool)

        System.out.println(num3 == num4); // false, different objects, not from the pool

        Integer num5 = Integer.valueOf(10); // Creates a new Integer object
        Integer num6 = Integer.valueOf(10); // Creates another new Integer object

        System.out.println(num5 == num6); // false, different objects, not from the pool

        String str11 = new String("Hello");
        String str22 = "Hello";
        str1 = str11.intern(); // Тепер str1 посилається на той же об'єкт рядка, що і str22
        System.out.println(str1 == str22); // true, обидва посилаються на той самий рядок у пулі
    }

    public static void main2(String args[]) {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }
    /*
     * StringBuilder strBuilder = new StringBuilder();
     * for (int i = 0; i < 500; i++) {
     * strBuilder.append(i);
     */

    public static String createDailyPlan(String[] plans) {

        StringBuilder sb = new StringBuilder();
        if (plans.length == 0) {
            sb.append("My plans:");
        } else {
            sb.append("My plans:\n");
        }
        for (int i = 0; i < plans.length; i++) {

            sb.append(i + 1).append(".) ").append(plans[i]).append(";");
            if (i != plans.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();

    }

    public int matchResult(int result1, int result2, int bet1, int bet2) {

        return result1 == bet1 && result2 == bet2
                ? 2
                : result1 == result2 && bet1 == bet2
                        || result1 < result2 && bet1 < bet2
                        || result1 > result2 && bet1 > bet2
                                ? 1
                                : 0;
    }

}

/*
 * Байткод
 * Байткод — це бінарний формат скомпільованого вихідного коду Java. Коли ти
 * пишеш код на Java, він спочатку компілюється (javac) у байткод. Цей байткод є
 * низькорівневим представленням програми та не залежить від платформи. Байткод
 * виконується двигуном JVM (Java Virtual Machine).
 *
 * Завдяки байткоду, Java дотримується свого принципу «write once, run
 * anywhere». Після того, як вихідний код скомпільовано в байткод, його можна
 * виконати на будь-якому пристрої або операційній системі, на якій встановлений
 * сумісний JVM. JVM виступає як шар абстракції та забезпечує однорідне
 * середовище виконання для програм на різних платформах.
 *
 * Файли байткоду зазвичай мають розширення .class.
 */

/*
 * Обгортки
 * Обгортки (wrappers) — це класи, які надають об'єктно-орієнтоване
 * представлення примітивним типам даних. Іншими словами, обгортки надають
 * можливість використовувати примітивні типи даних як об'єкти. Наприклад:
 * - Boolean представляє примітивний тип boolean;
 * - Byte представляє примітивний тип byte;
 * - Short представляє примітивний тип short;
 * - Integer представляє примітивний тип int;
 * - Long представляє примітивний тип long;
 * - Float представляє примітивний тип float;
 * - Double представляє примітивний тип double;
 * - Character представляє примітивний тип char.
 * Приклад: Boolean isActive = new Boolean(true);
 *
 * Навіщо нам потрібні обгортки? Вони надають додаткові методи та функціонал,
 * які недоступні для примітивних типів даних. Наприклад, в обгортках є
 * вбудовані методи для конвертації типів, парсингу рядків, виконання
 * арифметичних операцій тощо.
 *
 * Крім того, іноді тобі доведеться використовувати обгортки, наприклад, при
 * роботі з колекціями (Collection), такими як ArrayList (бо списки можуть
 * зберігати лише об'єкти):
 * List<int> myNumbers = new ArrayList<>(); // Invalid
 * List<Integer> myNumbers = new ArrayList<>(); // Valid
 *
 * Обгортки також підтримують автобоксінг (autoboxing) та анбоксінг (unboxing),
 * які дозволяють автоматичне конвертування між примітивними типами та
 * відповідними обгортковими об'єктами. Наприклад, автобоксінг автоматично
 * перетворює int на Integer, а анбоксінг перетворює Integer на int. Приклад
 * автобоксінгу:
 * Integer integerNum = new Integer(3); // Явна декларація
 * Integer integerNum = 3; // Присвоєння int значення об'єкту Integer:
 * автопакування
 *
 * Приклад анбоксінгу:
 * Integer integerNum = new Integer(5);
 * int intNum = integerNum; // Присвоєння значення Integer типу int:
 * розпакування
 */

/*
 * Збирач сміття
 * За назвою може здатися, що збирач сміття (garbage collector) займається
 * пошуком та видаленням сміття з пам'яті. Однак насправді він відстежує кожен
 * об'єкт, доступний в області heap та видаляє ті, які не використовуються.
 * 
 * Простими словами, збирач сміття працює у два простих кроки:
 * 
 * mark – тут збирач сміття визначає, які об’єкти використовуються, а які ні;
 * sweep – тут видаляються об’єкти, ідентифіковані під час кроку «mark».
 * Плюси:
 * 
 * програмісту не потрібно звільняти пам'ять самостійно;
 * автоматичне управління витоками пам'яті (memory leak).
 * Мінуси:
 * 
 * вимагає більшої потужності процесора;
 * програмісти не можуть планувати час, коли саме буде видалено сміття;
 * є менш ефективним, ніж правильне самостійне звільнення пам'яті.
 * Збирач сміття з рядками: починаючи з Java 7, пул рядків зберігається в
 * пам'яті heap, яку очищає збирач сміття. Перевагою цього підходу є зменшення
 * ризику виникнення помилки OutOfMemory, оскільки рядки без посилання будуть
 * видалені з пулу.
 */

/*
 * public class Car {
 * private String maker;
 * private String model;
 * 
 * public Car(String maker, String model) {
 * this.maker = maker;
 * this.model = model;
 * }
 * 
 * public void setMaker(String maker) {
 * this.maker = maker;
 * }
 * 
 * public void setModel(String model) {
 * this.model = model;
 * }
 * 
 * @Override
 * public String toString() {
 * return "Car{"
 * + "maker='" + maker + '\''
 * + ", model='" + model + '\''
 * + '}';
 * }
 * }
 * 
 * class Main {
 * public static void main(String[] args) {
 * final Car car = new Car("Audi", "Q8");
 * car.setModel("Q5"); // this is possible
 * System.out.println(car); // will print `Car{maker='Audi', model='Q5'}`
 * car = new Car("Audi", "Q5"); // this is not possible, compilation error
 * }
 * }
 */

/*
 * main метод
 * Метод main у Java є точкою входу будь-якої програми. Це перший метод, який
 * виконується Java Runtime Environment (JRE) при запуску програми. Особливості
 * методу main полягають у його сигнатурі, яка є строго визначеною, та в тому,
 * що він має бути оголошений як public, static і void.
 * 
 * Сигнатура методу main
 * public static void main(String[] args)
 * 
 * public: Модифікатор доступу public означає, що метод main має бути доступним
 * для будь-якого класу.
 * static: Ключове слово static дозволяє викликати метод без необхідності
 * створення екземпляра класу. Це важливо, оскільки JRE викликає метод main без
 * створення об'єкта класу.
 * void: Ключове слово void вказує, що метод не повертає жодного значення.
 * String[] args: Параметр args представляє собою масив рядків (String[]), який
 * може приймати аргументи командного рядка, передані програмі під час її
 * запуску.
 * Приклад простої програми на Java
 * public class HelloWorld {
 * public static void main(String[] args) {
 * System.out.println("Привіт, світ!");
 * }
 * }
 * 
 * У цьому прикладі клас HelloWorld містить метод main, який виводить
 * повідомлення "Привіт, світ!" до консолі. Це базовий приклад програми на Java,
 * що демонструє використання методу main.
 * 
 * Важливість методу main
 * Метод main є обов'язковим для виконуваних програм, оскільки без нього JRE не
 * змогла б знайти точку входу для запуску програми. Водночас, у бібліотеках або
 * модулях, які призначені для використання як частина інших програм, метод main
 * може бути необов'язковим.
 */

/*
 * Тернарний оператор
 * Тернарний оператор позначається символами ? : та є компактним способом
 * написання умовних виразів. Він дозволяє вибрати між двома значеннями або
 * виразами на основі певної умови. Тернарний оператор часто використовується як
 * скорочення для простих блоків if else.
 * 
 * Синтаксис тернарного оператора такий:
 * 
 * condition ? expression1 : expression2
 * 
 * Ось як він працює: спочатку обчислюється умова condition. Якщо вона дорівнює
 * true, то результатом усього виразу буде expression1. Якщо condition має
 * значення false, то результатом усього виразу буде expression2. Наприклад:
 * 
 * int number = 7;
 * String message = (number % 2 == 0) ? "Even" : "Odd";
 * 
 * System.out.println(message); // "Odd"
 */