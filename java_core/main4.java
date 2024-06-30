package java_core;

public class main4 {
    public static void main(String[] args) {

        System.out.println("hi");
    }

}

/*
 * Помилки у Java Помилки або винятки (errors, exceptions— це непередбачені ситуації, які виникають
 * під час виконання програми та перешкоджають нормальному продовженню її роботи. Вони свідчать про
 * серйозні проблеми в коді та вимагають належної обробки.
 * 
 * Помилки можуть виникнути в результаті дій користувачів, програмістів, або навіть фізичних
 * ресурсів, які вийшли з ладу. Нижче ми навели декілька випадків виникнення помилок:
 * 
 * користувач увів неправильні дані; файл, який потрібно відкрити, не знайдено; з’єднання з мережею
 * було втрачено або у JVM закінчилась пам’ять. Як обробляти перевіряємі винятки Існує два варіанти
 * обробки перевіряємих винятків:
 * 
 * перехопити виняток за допомогою блоку try catch ; за допомогою ключового слова throws оголосити,
 * що повертається виняток. try catch У блоці try потрібно написати код, який потенційно може
 * викликати виняток. Якщо виняток виникає в межах блоку try, він перехоплюється та виконується блок
 * catch, який відповідає за обробку цього конкретного типу винятку: try { Code that may throw a
 * checked exception } catch (IOException e{sssss Handle IOException }
 * 
 * Щоб обробити різні типи винятків, можна вказати декілька блоків catch. Однак варто врахувати два
 * моменти:
 *
 * за раз виникає лише один виняток, і за раз виконується лише один блок catch; усі блоки catch
 * повинні бути впорядковані від найбільш конкретного до найбільш загального типу виключення, інакше
 * виникне помилка компіляції. Подивимося як це виглядає на практиці. Ми створили користувацьку
 * помилку CheckedTestException та успадкували її від Exception. Вона буде повернена методом
 * processInteraction():
 * 
 * try { processInteraction(); } catch (CheckedTestException e{
 * System.out.println("This is our custom exception");s } catch (Exception e) {s
 * System.out.println("Parent Exception occurs"); }
 * 
 * throws Ключове слово throws використовується для позначення винятків, які можуть бути повернуті
 * методом. Коли метод оголошує throws для певного типу винятку, це означає, що метод може повернути
 * цей виняток, але сам обробляти його не буде:
 * 
 * public void someMethod() throws IOException, SQLException { Code that may throw IOException or
 * SQLException }
 * 
 * 
 * 
 * Користувацькі помилки За допомогою користувацьких помилок можна створювати власні типи помилок,
 * які відповідають специфічним потребам програми.
 * 
 * Щоб створити користувацьку помилку, потрібно реалізувати новий клас, який успадковує Exception
 * або RuntimeException. У цьому класі можна визначити додаткові поля, конструктори та методи, які
 * дозволяють передавати та отримувати додаткову інформацію або виконувати додаткові функції,
 * повязані з помилкою.
 * 
 * Зверни увагу: якщо ти хочеш створити користувацьку помилку, то її потрібно одразу ж обробити в
 * коді.
 * 
 * Ось коротенький приклад створення класу для користувацької помилки:
 * 
 * public class CustomException extends Exception { public CustomException({ super(); // Call the
 * superclass constructor }
 * 
 * public CustomException(String message{ super(message); // Call the superclass constructor with a
 * custom message } }
 * 
 * try catch finally Блок finally слідує за блоками try catch та не є обов'язковим. Він містить код,
 * який завжди виконується, незалежно від того, сталася помилка, чи ні. Цей блок зазвичай
 * використовується для очищення ресурсів, наприклад, файлів, підключень до бази даних тощо:
 * 
 * try { Code that might throw an exception } catch (ExceptionType1 exception1) { Handle exception1
 * } catch (ExceptionType2 exception2) { Handle exception2 } finally { Code that is always executed
 * }
 * 
 * Однак існують рідкісні випадки, коли блок finally може бути не виконано, наприклад, якщо JVM
 * завершує роботу через виклик System.exit(0або якщо потік, що виконує блок try-catch-finally,
 * перервано або вбито до того, як блок finally може бути виконано. Стектрейс Стектрейс (stacktrace)
 * — це список методів, у яких знаходилась програма в момент виникнення помилки. У верхньому рядку
 * відображатиметься метод, який повернув помилку, а під ним відображатимуться методи, які були
 * виконані раніше. Цей порядок дуже важливий, оскільки щоб зрозуміти, чим саме була спричинена
 * помилка, краще переглядати «новіші» методи.
 * 
 * Отже, якщо ми маємо такий код:
 * 
 * public static void main(String[] args) { // Some business logic here methodB(); }
 * 
 * public static void methodB() { methodA(); }
 * 
 * public static void methodA() { throw new RuntimeException("A test exception"); }
 * 
 * То стектрейс може виглядати так:
 * 
 * Exception in thread "main" java.lang.RuntimeException: A test exception at
 * mate.academy.stacktrace.StackTraceExample.methodA(StackTraceExample.java:13) at
 * mate.academy.stacktrace.StackTraceExample.methodB(StackTraceExample.java:9) at
 * mate.academy.stacktrace.StackTraceExample.main(StackTraceExample.java:5)
 */
