public class Main {
    public static void main(String[] args) {
        int age = 100;
        if (age <= 6 && age >= 2) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему пора ходить на работу.");
        }






        System.out.println();
    }
}