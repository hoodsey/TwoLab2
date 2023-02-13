public class Main {
    public static void main(String[] args) {// объявление начальной суммы счёта
        double accountScore = 7890.99;// объявление суммы пополнения
        double replenishment = 4569;
        double bonus = 0;// проверка условия
        if (replenishment > 1000) {
            bonus = (int) replenishment / 100;
        }

        System.out.println(bonus + " - Количество бонусных рублей.");
        System.out.println(accountScore + bonus + " - итоговый счёт.");
    }
}