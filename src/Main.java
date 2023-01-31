public class Main {
    public static void main(String[] args) {

        // объявление начальной суммы счёта
        double AccountScore = 7890.99;
        // объявление суммы пополнения
        double Replenishment = 4569;
        double Bonus = 0;
        // проверка условия
        if(Replenishment>1000){
            Bonus = (int)Replenishment / 100;
        }

        System.out.println(Bonus  + " - Количество бонусных рублей.");
        System.out.println(AccountScore+Bonus  + " - итоговый счёт.");
    }
}