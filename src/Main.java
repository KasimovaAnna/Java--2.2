public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int depositAmount = 1000 ;

        int bonus = 0;
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        }
        int total = bonus+initialAccount+depositAmount;

        System.out.println("Ваш бонусный счет:" + bonus);
        System.out.println("Ваш итоговый счет:" + total);
    }
}

