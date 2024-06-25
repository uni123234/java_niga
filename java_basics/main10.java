public class main10{

    public static void main(String[] args) {
        // Створення рядка
        String str1 = "Привіт";
        String str2 = new String("Світ");
        
        // Конкатенація рядків
        String str3 = str1 + ", " + str2 + "!";
        System.out.println("Конкатенація: " + str3);
        
        // Довжина рядка
        System.out.println("Довжина str3: " + str3.length());
        
        // Отримання символа за індексом
        System.out.println("Символ на 1-й позиції: " + str3.charAt(1));
        
        // Порівняння рядків
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 дорівнює str2? " + isEqual);
        
        // Порівняння без урахування регістру
        String str4 = "ПРИВІТ";
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str4);
        System.out.println("str1 дорівнює str4 без урахування регістру? " + isEqualIgnoreCase);
        
        // Пошук підрядка
        int index = str3.indexOf("Світ");
        System.out.println("Індекс підрядка 'Світ': " + index);
        
        // Заміна символів
        String str5 = str3.replace('і', 'и');
        System.out.println("Заміна 'і' на 'и': " + str5);
        
        // Розділення рядка
        String[] words = str3.split(", ");
        System.out.println("Розділення рядка за ', ':");
        for (String word : words) {
            System.out.println(word);
        }
        
        // Перетворення у верхній регістр
        System.out.println("Верхній регістр: " + str3.toUpperCase());
        
        // Перетворення у нижній регістр
        System.out.println("Нижній регістр: " + str3.toLowerCase());
        
        // Видалення пробілів на початку та в кінці
        String str6 = "  Привіт Світ  ";
        System.out.println("З пробілами: '" + str6 + "'");
        System.out.println("Без пробілів: '" + str6.trim() + "'");
    }
}
