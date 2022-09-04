public class Main {
    public static void main(String[] args) {
        int capacity = 10;
        if (capacity < 60) {
            System.out.println("Есть сидячие места!");
        }
        if (capacity >=60 && capacity < 102) {
            System.out.println("В вагоне ещё остались места, но только стоячие.");
        }
        if (capacity >= 102) {
            System.out.println("В вагоне мест нет!");
        }





        System.out.println();
    }
}