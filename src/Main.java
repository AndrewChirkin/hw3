public class Main {
    public static void main(String[] args) {
        int iOS = 0;
        int productionYear = 2001;
        int Android = 1;
        int clientOS = 1;
        if(productionYear >= 2015) {
            if (clientOS == Android) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }else
            if (clientOS == Android) {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
}
        }





