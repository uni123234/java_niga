package java_extended;

public class main2 {
    public static void main(String[] args) {
        String maturity = "child";
        System.out.println(maturity);
    }
    public static String determineFruitColor(String fruit) {
            switch (fruit) {
                case "apple":
                    return "red";
                case "banana":
                    return "yellow";
                case "grape":
                    return "purple";
                case "orange":
                    return "orange";
                default:
                    return "unknown";
            }
        }
    
        public static void mains(String[] args) {
            System.out.println(determineFruitColor("apple"));    // red
            System.out.println(determineFruitColor("banana"));   // yellow
            System.out.println(determineFruitColor("grape"));    // purple
            System.out.println(determineFruitColor("orange"));   // orange
            System.out.println(determineFruitColor("watermelon")); // unknown
        }
    }
    

// public static void printDayByNumber(int day) {
//     switch (day) {
//       case 1:
//           System.out.println("Monday");
//           break;
//       case 2:
//           System.out.println("Tuesday");
//           break;
//       case 3:
//           System.out.println("Wednesday");
//           break;
//       case 4:
//           System.out.println("Thursday");
//           break;
//       case 5:
//           System.out.println("Friday");
//           break;
//       case 6:
//           System.out.println("Saturday");
//           break;
//       case 7:
//           System.out.println("Sunday");
//           break;
//       default:
//           System.out.println("Incorrect input data");
//     }
// }

//Write code below this line
// switch (number) {
//     case  (4):
//       System.out.println("VISA");
//       break;
//     case  (34):
//     case  (37):
//       System.out.println("American Express");
//       break;
//     case  (52):
//     case  (53):
//     case  (54):
//     case  (55):
//       System.out.println("MasterCard");
//       break;
//     case  (63):
//     case  (67):
//       System.out.println("Maestro");
//       break;
//     default:
//       System.out.println("unknown payment system");
//       break;
//   }
  //Write code above this line
  