package java_extended;

public class main4 {

}


// public class Animal {
// private String name;
// private int age;

// геттери та сеттери
// }

// public class Bird extends Animal {
// private boolean canFly;

// геттери та сеттери
// }


// write your code bellow this line
// public class Penguin extends Bird {
// boolean canSwim;

// public Penguin(String name, int age, boolean canSwim) {
// this.name = name;
// this.age = age;
// this.canSwim = canSwim;
// }
// }

// write your code above this line

// class Figure {
// boolean hasBorder;
// int perimeter;
// String color;
// int area;
// }

// class Circle extends Figure {
// int radius;
// }

// class RightTriangle extends Figure {
// int leg;
// int hypotenuse;
// }

// class Square extends Figure {
// int side;
// }


// public class User {
// private int age;

// public int getAge() {
// return age;
// }

// public void setAge(int age) {
// this.age = age;
// }
// }

// public class User {
// private int age;

// public int getAge() {
// return age;
// }

// public void setAge(int age) {
// if (age < 0) {
// System.out.println("Вік не може бути від'ємним числом");
// } else {
// this.age = age;
// }
// }
// }

// class Application {
// public static void main(String[] args) {
// User user = new User();
// user.setAge(-200); // буде виведено повідомлення про некоректне значення віку
// }
// }

// public class User {
// private boolean isActive;

// public boolean isActive() { // назва гетера `isActive()`, а не `getIsActive()`
// return isActive;
// }

// public void setActive(boolean isActive) { // назва сетера `setActive()`, а не `setIsActive()`
// this.isActive = isActive;
// }
// }

// public class Product {
// private String name;
// private int amount;
// private double price;

// public String getName() {
// return name;
// }

// public void setName(String name) {
// this.name = name;
// }

// public int getAmount() {
// return amount;
// }

// public void setAmount(int amount) {
// this.amount = amount;
// }

// public double getPrice() {
// return price;
// }

// public void setPrice(double price) {
// this.price = price;
// }
// }


// Конструктор та його перевантаження
// Конструктор — це спеціальний метод, який використовується для ініціалізації об'єктів. Він
// викликається кожен раз, коли створюється об'єкт класу. Конструктори також можуть приймати
// параметри, які використовуються для ініціалізації полів.

// Зверни увагу, що назва конструктора повинна збігатися з назвою класу. Також конструктор не має
// повертаючого типу:

// public class Cat {
// private String name;

// public Cat(String name) { // конструктор класу `Cat`
// this.name = name;
// }
// }

// Усі класи мають конструктор без параметрів за замовчуваннями — якщо ти не створив(-ла)
// конструктор власноруч, Java створить його за тебе:

// public class User {
// private String firstName;

// // цей клас має пустий конструктор за замовчуванням `public User() {}`
// }

// public class Application {
// public static void main(String[] args) {
// User user = new User(); // викликаємо дефолтний конструктор `new User()`
// User user = new User("Bob"); // ми не можемо передати ім'я користувача, адже в нас немає
// потрібного конструктора з параметрами
// }
// }

// Перевантаження конструкторів — це особливість, яка дозволяє класу мати декілька конструкторів із
// різними параметрами. Це означає, що можна створювати об’єкти одного класу, використовуючи різні
// набори параметрів, залежно від конкретних потреб.

// Якщо клас має декілька конструкторів із різними параметрами, компілятор використовуватиме
// відповідний конструктор на основі аргументів, які передаються під час створення об’єкта.

// Ось приклад перевантаження конструктора:

// public class User {
// private String firstName;
// private String lastName;

// public User(String firstName, String lastName) { // 1: конструктор із двома параметрами
// this.firstName = firstName;
// this.lastName = lastName;
// }

// public User(String firstName) { // 2: конструктор з одним параметром `firstName`
// this.firstName = firstName;
// }

// public User() { // 3: конструктор без параметрів
// }
// }

// А ось як можна створити об’єкти для цього класу:

// User firstUser = new User("Ivan", "Ivanov"); // викликається конструктор із двома параметрами
// User secondUser = new User("Ivan"); // викликається конструктор з одним параметром
// User thirdUser = new User(); // викликається конструктор без параметрів


// public class User {
// private String firstName;
// private String lastName;
// private String email;
// private int age;

// // write your code below this line

// // Constructor with three parameters: firstName, lastName, and age
// public User(String firstName, String lastName, int age) {
// this.firstName = firstName;
// this.lastName = lastName;
// this.age = age;
// }

// // Constructor with four parameters: firstName, lastName, age, and email
// public User(String firstName, String lastName, int age, String email) {
// this.firstName = firstName;
// this.lastName = lastName;
// this.age = age;
// this.email = email;
// }

// // write your code above this line

// public String getFirstName() {
// return firstName;
// }

// public void setFirstName(String firstName) {
// this.firstName = firstName;
// }

// public String getLastName() {
// return lastName;
// }

// public void setLastName(String lastName) {
// this.lastName = lastName;
// }

// public String getEmail() {
// return email;
// }

// public void setEmail(String email) {
// this.email = email;
// }

// public int getAge() {
// return age;
// }

// public void setAge(int age) {
// this.age = age;
// }
// }


// public class Car {
// private String model;
// private int year;
// private double price;

// // Гетери та сетери
// public String getModel() {
// return model;
// }

// public void setModel(String model) {
// this.model = model;
// }

// public int getYear() {
// return year;
// }

// public void setYear(int year) {
// this.year = year;
// }

// public double getPrice() {
// return price;
// }

// public void setPrice(double price) {
// this.price = price;
// }

// // Конструктор без параметрів
// public Car() {
// }

// // Конструктор з трьома параметрами
// public Car(String model, int year, double price) {
// this.model = model;
// this.year = year;
// this.price = price;
// }
// }
