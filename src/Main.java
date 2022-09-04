public class Main {
    public static void main(String[] args) {
        int age = 100;
        if (age < 5) {
            System.out.println("Возраст слишком мал, кататься нельзя.");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Данный ребёнок может кататься только в сопровождении взрослого.");
        }
        if (age > 14) {
            System.out.println("Можно кататься без ограничений.");
        }






        System.out.println();
    }
}