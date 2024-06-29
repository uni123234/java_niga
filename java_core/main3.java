package java_core;

public class main3 {

}

/*
 * Що таке інтерфейс?
 * Інтерфейс — це конструкція, яка визначає набір оголошених методів без їх
 * реалізації. Класи, які реалізують інтерфейс, повинні надати реалізацію всіх
 * методів, визначених в інтерфейсі. Основна ідея інтерфейсу — це надати
 * специфікацію (або схему) для класів, які його реалізують, зазначивши, які
 * методи повинні бути присутні.
 * 
 * Щоб оголосити інтерфейс, використай ключове слово interface:
 * 
 * public interface Drawable {
 * void draw();
 * }
 * 
 * Вище в прикладі інтерфейс Drawable містить оголошення метода draw(). Тепер
 * створимо клас Circle, який імплементує (розширює) інтерфейс Drawable та його
 * метод draw():
 * 
 * public class Circle implements Drawable {
 * public void draw() {
 * // Implementation of the `draw()` method for a circle
 * System.out.println("Drawing a circle");
 * }
 * }
 * 
 * Java дозволяє класу імплементувати декілька інтерфейсів, що не є можливим з
 * успадкуванням класів. Це забезпечує більшу гнучкість і повторне використання
 * коду:
 * 
 * interface Walkable {
 * void walk();
 * }
 * 
 * interface Swimmable {
 * void swim();
 * }
 * 
 * class Human implements Walkable, Swimmable {
 * public void walk() {
 * System.out.println("Walking...");
 * }
 * 
 * public void swim() {
 * System.out.println("Swimming...");
 * }
 * }
 * 
 * Починаючи з Java 8, в інтерфейсі можна створювати константи, а також default
 * та static методи. Тіла методів існують лише для методів default та static.
 * Починаючи з Java 9, private методи також доступні, але private abstract
 * методи заборонені.
 */

/*
 * Відмінності між абстрактним класом та інтерфейсом
 * Розглянемо чим абстрактний клас відрізняється від інтерфейсу:
 * 
 * Абстрактний клас Інтерфейс
 * 1. Ключове слово abstract 1. Ключове слово interface
 * 2. Клас extends абстрактний клас 2. Клас implements інтерфейс
 * 3. Абстрактний клас може мати реалізовані методи та абстрактні методи 3.
 * Починаючи з Java 8, інтерфейси можуть мати default та static методи
 * 4. Можна розширити тільки один абстрактний клас 4. Можна розширити декілька
 * інтерфейсів
 * Простими словами, можна дотримуватися наступного правила: використовуй
 * абстрактний клас, якщо у твоїх класах мають бути однакові поля (наприклад,
 * age для всіх тварин), а інтерфейс, якщо мають бути однакові методи
 * (наприклад, Plane, Eagle та Beattle можуть літати).
 */

/*
 * озширення інтерфейсу
 * Коли інтерфейс розширює інший інтерфейс, він успадковує сигнатури методів від
 * батьківського інтерфейсу:
 * 
 * interface Shape {
 * void draw();
 * }
 * 
 * interface Circle extends Shape {
 * double calculateArea();
 * }
 * 
 * Інтерфейс може розширювати й декілька інтерфейсів. У такому випадку їх
 * потрібно розділити комами. У наступному прикладі C розширює A та B,
 * успадковуючи сигнатури їх методів:
 * 
 * interface A {
 * // ...
 * }
 * 
 * interface B {
 * // ...
 * }
 * 
 * interface C extends A, B {
 * // ...
 * }
 */

/*
 * static
 * Ключове слово static використовується для оголошення полів або методів, які
 * скоріше належать до самого класу, а ніж до його екземплярів:
 * 
 * статичні поля є спільними для всіх екземплярів класу, тобто всі екземпляри
 * отримують доступ та змінюють одне й те ж саме значення статичного поля.
 * Статичні поля часто використовуються для констант:
 * 
 * class Counter {
 * static int count; // static field
 * 
 * void increment() {
 * count++; // accessing and modifying the static field
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Counter firstCounter = new Counter();
 * Counter secondCounter = new Counter();
 * 
 * firstCounter.increment();
 * System.out.println("Count: " + secondCounter.count); // Count: 1
 * }
 * }
 * 
 * статичні методи схожі на статичні поля — вони належать класам, а не їх
 * екземплярам. Статичні методи можна викликати безпосередньо в класі без
 * створення об’єкта:
 * 
 * class Calculator {
 * static int multiply(int a, int b) { // static method
 * return a * b;
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * int result = Calculator.multiply(5, 3); // calling the static method directly
 * System.out.println("Result: " + result); // Result: 15
 * }
 * }
 * 
 * статичні блоки ініціалізації виконуються програмою лише один раз, а саме коли
 * клас завантажується в пам'ять:
 * 
 * public class Main {
 * static {
 * System.out.println("Static initialization block");
 * }
 * }
 * 
 * статичні класи призначені для утилітних функцій та збереження констант. Вони
 * групують пов’язані функціональні можливості та забезпечують зручний доступ до
 * них без створення об’єкта.
 */

/*
 * Порядок ініціалізації
 * Клас складається з різних елементів, зокрема полів, методів тощо. Щоб їх
 * ініціалізувати, потрібно виконати такі кроки:
 * 
 * Коли клас уперше завантажується у JVM, ініціалізуються статичні поля.
 * 
 * Далі виконується блок статичної ініціалізації. Він використовується для
 * ініціалізації статичних змінних або будь-якої іншої статичної ініціалізації.
 * 
 * Коли екземпляр класу створюється за допомогою ключового слова new,
 * ініціалізуються поля екземпляра класу.
 * 
 * Блок ініціалізації виконується після ініціалізації полів екземпляра класу.
 * Він використовується для ініціалізації змінних екземплярів або будь-якої
 * іншої ініціалізації.
 * 
 * Для ініціалізації решти полів екземпляра та виконання будь-яких інших
 * ініціалізацій, виконується конструктор.
 * 
 * // Step 1: Static fields
 * private static int staticVariable = 10;
 * 
 * // Step 2: Static initialization block
 * static {
 * System.out.println("Static initialization block");
 * staticVariable = 20;
 * }
 * 
 * // Step 3: Instance fields
 * private int instanceVariable = 30;
 * 
 * // Step 4: Initialization block
 * {
 * System.out.println("Initialization block");s
 * instanceVariable = 40;
 * }
 * 
 * // Step 5: Constructor
 * public InitializationOrder() {
 * System.out.println("Constructor");
 * instanceVariable = 50;
 * }
 */

/*
 * Константи
 * Константи — це змінні, значення яких не можуть бути зміненими після їх
 * створення. Зазвичай константи оголошуються за допомогою ключового слова
 * final:
 * 
 * private static final int MAX_VALUE = 100;
 * private static final String APPLICATION_NAME = "MyApp";
 * 
 * MAX_VALUE = 200; // cannot assign a value to final variable MAX_VALUE
 * APPLICATION_NAME = "New name"; // cannot assign a value to final variable
 * APPLICATION_NAME
 */

/*
 * Loose Coupling
 * Loose coupling (слабка зв'язність) — це принцип розробки програмного
 * забезпечення, який сприяє зменшенню залежностей між компонентами всередині
 * системи. Він спрямований на мінімізацію прямих взаємодій і знань, які один
 * компонент повинен мати про інший.
 * 
 * У таких системах компоненти можуть функціонувати й розвиватися незалежно один
 * від одного. Зміни, внесені до одного компонента, мають мінімальний вплив або
 * взагалі не впливають на інші компоненти, що полегшує обслуговування,
 * розширення та повторне використання коду.
 */