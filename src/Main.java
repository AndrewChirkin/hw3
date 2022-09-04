public class Main {
    public static void main(String[] args) {
        int monthNumber = 1;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года - зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - осень.");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
        }





