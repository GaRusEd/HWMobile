public class Main {
    public static void main(String[] args) {
        int startBalance = 50;
        int payment = 2000;
        int bonus = payment / 100;
        int balance = startBalance + payment;


        if (payment > 1000) {
            balance = startBalance + payment + bonus;
        }else {
            balance = startBalance + payment;
        }
        System.out.println("На вашем балансе " + balance + " рубля/ей.Бонус составил " + bonus + " рубля/ей");


    }
}
