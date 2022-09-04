public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        double daysDelivery;
        int distancePenality = 40;
        daysDelivery = (deliveryDistance - 61) / distancePenality + 3;
        double result = Math.ceil(daysDelivery);
        if(deliveryDistance <= 20) {
            System.out.println("Потребуется один день доставки!");
        } else if(deliveryDistance < 61 && deliveryDistance > 20){
            System.out.println("Потребуется 2 дня доставки!");
        } else {
            System.out.println("Потребуется " + daysDelivery + " дней на доставку.");
        }
    }
        }





