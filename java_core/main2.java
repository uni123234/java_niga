package java_core;

public class main2 {
    public static void main(String[] args) {

    }

    public class MatrixDiagonal {

        /**
         * Метод для отримання головної діагоналі матриці.
         * 
         * @param matrix Вхідна матриця.
         * @return Масив, що містить елементи головної діагоналі.
         */
        public int[] getDiagonal(int[][] matrix) {
            int n = matrix.length;
            int[] diagonal = new int[n];
            for (int i = 0; i < n; i++) {
                diagonal[i] = matrix[i][i];
            }
            return diagonal;
        }

        /**
         * Метод для отримання побічної діагоналі матриці.
         * 
         * @param matrix Вхідна матриця.
         * @return Масив, що містить елементи побічної діагоналі.
         */
        public int[] getCounterDiagonal(int[][] matrix) {
            int n = matrix.length;
            int[] diagonal = new int[n];
            for (int i = 0; i < n; i++) {
                diagonal[i] = matrix[i][n - i - 1];
            }
            return diagonal;
        }
    }

}

/*
 * ООП
 * ООП (об'єктно-орієнтоване програмування) є парадигмою програмування, у якій
 * програма структурується навколо об'єктів, які взаємодіють між собою. Кожен
 * об'єкт являє собою екземпляр класу, який визначає його характеристики (поля)
 * та поведінку (методи).
 * 
 * Головною відмінністю ООП від процедурного програмування є підхід до
 * структурування коду. Процедурне програмування зосереджується на написанні
 * процедур або функцій, тоді як ООП організовує код у класи та об'єкти, які
 * визначають характеристики та поведінку.
 * 
 * Основними принципами ООП є: наслідування, поліморфізм, абстракція та
 * інкапсуляція. Розглянемо кожен із них.
 */

/*
 * class Parent {
 * 
 * // fields
 * // methods
 * 
 * }
 * 
 * class Child extends Parent {
 * 
 * // already supports the methods and fields of the `Parent` class
 * // additional features
 * 
 * }
 */

/*
 * З успадкуванням часто плутають два поняття:
 * 
 * Композиція є відношенням «belongs-to». Це означає, що один об'єкт (member) є
 * складовою іншого об'єкта (owner). Часто ми називаємо його відношенням «HAS-A»
 * (на відмінну від відношення «IS-A», яке і є успадкуванням). Життєві цикли
 * об'єктів композиції пов'язані, тобто якщо ми знищимо owner-об'єкт, то
 * member-об'єкт також буде знищено. Наприклад, кімната знищиться разом із
 * будівлею.
 * 
 * Агрегація схожа на композицію, проте життєві цикли об'єктів не пов'язані:
 * кожен із них може існувати незалежно. Наприклад, візьмемо автомобіль та його
 * колеса — ми можемо зняти колеса, але вони все ще будуть існувати.
 */

/*
 * Перевизначення методу
 * Перевизначення методу дозволяє підкласу реалізувати метод суперкласу по
 * іншому. тобто змінити поведінку успадкованого методу. Щоб перевизначити
 * метод, підклас повинен оголосити метод із тією ж самою назвою, типом
 * повертаючого результату та списком параметрів, що й метод у суперкласі.
 * Перевизначений метод також має бути позначений анотацією @Override:
 * 
 * class Vehicle {
 * public void drive() {
 * System.out.println("Driving a vehicle...");
 * }
 * }
 * 
 * class Car extends Vehicle {
 * 
 * @Override
 * public void drive() {
 * System.out.println("Driving a car...");
 * }
 * }
 * 
 * class Bike extends Vehicle {
 * 
 * @Override
 * public void drive() {
 * System.out.println("Riding a bike...");
 * }
 * }
 * 
 * Якщо ми створимо об’єкти класів Vehicle, Car та Bike, а потім викличемо метод
 * drive() для кожного з них, JVM визначить який об’єкт використовується саме
 * зараз та виконає відповідний перевизначений метод:
 * 
 * Driving a vehicle...
 * Driving a car...
 * Riding a bike...
 * 
 * Зверни увагу: методи з модифікаторами final, static та private перевизначати
 * не можна.
 */

/*
 * Перевантаження методу
 * Перевантаження методу дозволяє одночасно існувати декільком методам з
 * однаковою назвою, але з різним набором параметрів. З його допомогою можна
 * створити декілька методів, які виконують одне й те ж саме завдання, але з
 * різними параметрами, наприклад:
 * 
 * class Calculator {
 * public int add(int a, int b) {
 * return a + b;
 * }
 * 
 * public double add(double a, double b) {
 * return a + b;
 * }
 * 
 * public int add(int a, int b, int c) {
 * return a + b + c;
 * }
 * }
 * 
 * Далі можна створити об’єкт класу Calculator та викликати метод add() з
 * різними аргументами:
 * 
 * Calculator calculator = new Calculator();
 * 
 * int sum1 = calculator.add(2, 3); // 5
 * double sum2 = calculator.add(2.5, 3.7); 6.2
 * int sum3 = calculator.add(2, 3, 4); // 9
 */

/*
 * import java.util.Arrays;
 * 
 * class Printer {
 * public String print(String message) {
 * return message;
 * }
 * 
 * public String print(int message) {
 * return Integer.toString(message);
 * }
 * 
 * public String print(double message) {
 * return Double.toString(message);
 * }
 * 
 * public String print(String message, int message2) {
 * return message + " and " + message2;
 * }
 * 
 * public String print(String[] message) {
 * return Arrays.toString(message);
 * }
 * }
 * 
 */

/*
 * Поліморфізм
 * Поліморфізм — це здатність об'єктів різних класів розглядатися як об'єкти
 * спільного суперкласу або імплементувати спільний інтерфейс. Це означає, що
 * об'єкти можуть бути трактовані як екземпляри спільного класу або інтерфейсу,
 * що дозволяє їм реагувати по-різному на один і той же виклик методу.
 * 
 * Поліморфізм забезпечує гнучкість та розширюваність коду, оскільки програмісти
 * можуть працювати з об'єктами, використовуючи загальні типи, без необхідності
 * знати конкретний клас об'єкта. Це спрощує розробку загальних алгоритмів і
 * сприяє повторному використанню коду.
 * 
 * Поліморфізм ділиться 2 типи: статичний (на час компіляції) та динамічний (на
 * час виконання). Перевантаження методу є прикладом статичного поліморфізму,
 * тоді як перевизначення методу є прикладом динамічного поліморфізму.
 * 
 * Будь-який об’єкт, який задовольняє більш ніж одному відношенню «IS-A», є
 * поліморфним. Наприклад, розглянемо клас Vehicle і нехай MotorBike буде його
 * підкласом. Отже, будь-який motorBike є vehicle. Тут MotorBike задовольняє
 * відношення «IS-A» для свого власного типу, а також свого суперкласу Vehicle.
 */

/*
 * Абстракція
 * Абстракція — це процес приховування деталей реалізації та надання лише
 * необхідної інформації для користувача. Вона дозволяє створювати та
 * використовувати складні системи, не занурюючись у всі деталі їх реалізації.
 * 
 * Абстракція може бути досягнута за допомогою абстрактних класів і методів:
 * 
 * абстрактний клас не можна використовувати для створення об’єктів (щоб
 * отримати до нього доступ, він має бути успадкований від іншого класу);
 * абстрактний метод не має тіла і може бути використаний лише в абстрактному
 * класі. Тіло для абстрактного класу надається його підкласом.
 * Для створення абстрактних класів і методів використовується ключове слово
 * abstract:
 * 
 * // Abstract class
 * abstract class Animal {
 * // Abstract method
 * abstract void makeSound();
 * }
 * 
 * class Dog extends Animal {
 * // Implementation of the `makeSound` method
 * void makeSound() {
 * System.out.println("Dog barks");
 * }
 * }
 * 
 * class Cat extends Animal {
 * // Implementation of the `makeSound` method
 * void makeSound() {
 * System.out.println("Cat meows");
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Animal dog = new Dog();
 * Animal cat = new Cat();
 * 
 * dog.makeSound();
 * cat.makeSound();
 * }
 * }
 * 
 * У цьому прикладі ми створили абстрактний клас Animal. Він має абстрактний
 * метод makeSound(). Класи Dog та Cat наслідують абстрактний клас Animal та
 * реалізують метод makeSound().
 */

/*
 * Інкапсуляція
 * Інкапсуляція в Java — це механізм, який дозволяє об'єднати дані та методи в
 * одному об'єкті і приховати їх від зовнішнього доступу. Інкапсуляція
 * реалізовується за допомогою модифікаторів доступу: public, protected, default
 * та private.
 * 
 * Ось приклад інкапсуляції:
 * 
 * class Person {
 * private String name;
 * private int age;
 * 
 * public String getName() {
 * return name;
 * }
 * 
 * public void setName(String name) {
 * this.name = name;
 * }
 * 
 * public int getAge() {
 * return age;
 * }
 * 
 * public void setAge(int age) {
 * if (age >= 0) {
 * this.age = age;
 * } else {
 * System.out.println("Invalid age. Age cannot be negative.");
 * }
 * }
 * }
 * 
 * Тут ми створили клас Person з приватними полями name та age. Доступ до цих
 * полів контролюється за допомогою публічних методів — гетерів та сетерів.
 */

/*
 * super та this
 * Ці ключові слова вказують на різні елементи в класі:
 * 
 * super вказує на суперклас поточного класу. Зазвичай це ключове слово
 * використовується для доступу до полів або виклику методів суперкласу:
 * 
 * для виклику конструктора суперкласу: super(arguments);
 * для виклику методу суперкласу: super.methodName(arguments);
 * для доступу до поля суперкласу: super.fieldName;
 * this вказує на поточний екземпляр класу. Зазвичай це ключове слово
 * використовується для доступу до полів або виклику методів поточного класу:
 * 
 * для доступу до поточних полів екземпляра класу: this.fieldName;
 * для виклику конструктора з іншого конструктора в тому ж класі:
 * this(arguments);
 * для передачі поточного екземпляра як аргументу: methodName(this).
 */

/*
 * enum
 * enum — це спеціальний тип даних, який представляє фіксовану кількість
 * попередньо визначених значень — констант. Ось приклад використання enum:
 * 
 * public enum Day {
 * SUNDAY,
 * MONDAY,
 * TUESDAY,
 * WEDNESDAY,
 * THURSDAY,
 * FRIDAY,
 * SATURDAY
 * }
 * 
 * Далі Day можна використати наступним чином:
 * 
 * Day today = Day.MONDAY;
 * System.out.println("Today is " + today);
 * 
 * if (today == Day.SATURDAY || today == Day.SUNDAY) {
 * System.out.println("It's the weekend!");
 * } else {
 * System.out.println("It's a weekday.");
 * }
 * 
 * У консолі побачимо:
 * 
 * Today is MONDAY
 * It's a weekday.
 */

/*
 * Random
 * За допомогою класу Random можна генерувати випадкові числа:
 * 
 * Random random = new Random();
 * 
 * int randomInt = random.nextInt(); // Generates a random integer
 * double randomDouble = random.nextDouble(); // Generates a random double
 * between 0.0 and 1.0
 * boolean randomBoolean = random.nextBoolean(); // Generates a random boolean
 * value
 * 
 * Ще один приклад — отримаємо випадкове значення з enum:
 * 
 * enum Color {
 * RED,
 * GREEN,
 * BLUE,
 * YELLOW,
 * ORANGE
 * }
 * 
 * int index = new Random().nextInt(Color.values().length);
 * Color color = Color.values()[index];
 * System.out.println(color);
 * 
 * Як це працює?
 * 
 * Color.values() повертає масив, який містить усі константи з Color.
 * Color.values().length повертає кількість констант у enum, тобто його розмір.
 * new Random().nextInt(Color.values().length) генерує випадкове ціле число від
 * 0 (включно) до розміру enum (не включно). Це число представляє індекс
 * випадкової константи.
 * Color.values()[index] отримує константу enum за випадково згенерованим
 * індексом.
 */

/*
 * package core.basesyntax;
 * 
 * public class Bulldozer extends Machine {
 * 
 * @Override
 * public void doWork() {
 * System.out.println("Bulldozer start working");
 * }
 * 
 * @Override
 * public void stopWork() {
 * System.out.println("Bulldozer finished work");
 * }
 * }
 * package core.basesyntax;
 * 
 * public class Excavator extends Machine {
 * 
 * @Override
 * public void doWork() {
 * System.out.println("Excavator start working");
 * }
 * 
 * @Override
 * public void stopWork() {
 * System.out.println("Excavator finished work");
 * }
 * }
 * 
 * package core.basesyntax;
 * 
 * public abstract class Machine {
 * public abstract void doWork();
 * 
 * public abstract void stopWork();
 * }
 * 
 * package core.basesyntax;
 * 
 * public class MainApp {
 * public static void main(String[] args) {
 * Machine truck = new Truck();
 * Machine bulldozer = new Bulldozer();
 * Machine excavator = new Excavator();
 * truck.doWork();
 * bulldozer.doWork();
 * excavator.doWork();
 * truck.stopWork();
 * bulldozer.stopWork();
 * excavator.stopWork();
 * }
 * 
 * }
 * public class Truck extends Machine {
 * 
 * @Override
 * public void doWork() {
 * System.out.println("Truck start working");
 * }
 * 
 * @Override
 * public void stopWork() {
 * System.out.println("Truck finished work");
 * }
 * }
 */