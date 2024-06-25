package java_extended;

public class main5 {
    public static char[] removeLetter(String input) {
        if (input == null) {
          return new char[0];
        }
        char[] inputArray = input.toLowerCase().toCharArray();
        for (int i = 0; i < input.length(); i++) {
          if (inputArray[i] == 'r') {
            inputArray[i] = '!';
          }
        }
        return inputArray;
      }
}

// Методи (advanced)
// Перевантаження методу
// Перевантаження методу відбувається, коли клас має декілька методів з однаковими назвами, але з різним набором параметрів. Якщо нам потрібно виконувати лише одну операцію, але з різними параметрами, то перевантаження методів покращить читабельність коду.

// Перевантаження методу можна досягти трьома способами:

// зміною кількості параметрів:
// public class Application {
//     public void apply(String input) {
         // логіка методу
//     }

//     public void apply(String firstInput, String secondInput) {
         // логіка методу
//     }

//     public void apply(String firstInput, String secondInput, String thirdInput) {
         // логіка методу
//     }
// }

// зміною типу даних:
// public class Application {
//     public void apply(String input) {
         // логіка методу
//     }

//     public void apply(int input) {
//         // логіка методу
//     }

//     public void apply(boolean input) {
         // логіка методу
//     }
// }

// зміною порядку параметрів:
// public class Application {
//     public void apply(String firstInput, double secondInput) {
         // логіка методу
//     }

//     public void apply(double firstInput, String secondInput) {
         // логіка методу
//     }
// }

// Зверни увагу: під час перевантаження, важливі типи даних параметрів, а не їх назви.

//Write code below this line
// class Printer {
//     public void printArguments(String a) {
//       System.out.println(a);
//     }
  
//     public void printArguments(int b) {
//       System.out.println(b);
  
//     }
  
//     public void printArguments(boolean c) {
//       System.out.println(c);
//     }
  
//     public void printArguments(String d, String f) {
//       System.out.println(d);
//       System.out.println(f);
//     }
  
//   }
  //Write code above this line

//   class Shoes {
//     private String color;
//     private int size;
     //Write code below this line
//   public static int shoesNumber;
  
//   public Shoes (String color, int size) {
//   shoesNumber = shoesNumber + 1;
//   }
    //Write code above this line
  
//     public String getColor() {
//       return color;
//     }
  
//     public void setColor(String color) {
//       this.color = color;
//     }
  
//     public int getSize() {
//       return size;
//     }
  
//     public void setSize(int size) {
//       this.size = size;
//     }
//   }


/* 
Ключове слово static
Ключове слово static вказує, що конкретний член належить конкретно до класу, а не до екземпляра цього класу. Це означає, що створюється лише один екземпляр цього статичного члена, який є спільним для всіх екземплярів класу.

Статичні поля
Якщо поле оголошено статичним, тоді буде створена лише одна копія цього поля і вона буде поширена між усіма екземплярами класу. Не має значення, скільки разів ми створюємо новий об’єкт цього класу — завжди буде лише одна копія статичного поля.

Наприклад, для кожного нового об'єкта Car, збільшується та ж сама змінна numberOfCars:

public class Car {
    private String name;
    private String engine;
    
    public static int numberOfCars;
    
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
 
    // геттери та сеттери
}

Оскільки статичні змінні належать класу, до них можна отримати доступ напряму без створення нового об’єкта:

System.out.println(Car.numberOfCars);

Використання статичних полів є зручним коли:

його значення не залежить від об'єктів;
його значення є спільним для усіх об’єктів.
Статичні методи
Подібно до статичних полів, статичні методи також належать до класу, а не до об'єктів. Їх можна використовувати без створення об’єктів, а доступ можна отримати за допомогою назви класу.

Статичні методи широко використовуються в утилітах або допоміжних класах, щоб їх можна було легко викликати без створення нового об’єкта:

double power = Math.pow(5, 2); // використовуємо статичний метод `pow ()` класу `Math`

Статичні методи не мають доступу безпосередньо до змінних та методів екземпляра класу:

public class Car {
    private String name;
    private String engine;
    
    public static int numberOfCars;

    // геттери та сеттери
    
    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
        System.out.println(name); // помилка компіляції! 
        // `name` не є статичним, тому до нього неможливо отримати доступ зі статичного методу!
    }
}
*/

class Cat {
    private String name;
  
    public Cat(String name) {
      this.name = name;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    // Write code below this line
    public static void printInfoAboutAllCats() {
      System.out.println("All cats are cute and funny!");
    }
  
    public void feedTheCat(String food) {
      System.out.println(name + " is eating " + food + "!");
    }
    // Write code above this line
  }
  
