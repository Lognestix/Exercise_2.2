public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;     //Текущий баланс счета в рублях
        int transferAmount = 1_100;   //Сумма пополнения счета в рублях

        boolean bonusActivation = transferAmount >= 1000;                           //Условие активации бонуса
        int bonus = bonusActivation ? (currentBalance + transferAmount) / 100 : 0;  //Расчет бонуса в рублях
        int totalBalance = currentBalance + transferAmount + bonus;                 //Расчет итогового баланса счета в рублях
        System.out.println("Итоговый баланс равен " + totalBalance + "руб, бонус составляет " + bonus + "руб");
    }
}
