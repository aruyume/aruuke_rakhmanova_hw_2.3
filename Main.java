public class Main {
    public static void main(String[] args) {
        BankAccount client = new BankAccount();
        client.deposit(15000);
        client.currentBalance();
        System.out.println();

        while (true) {
            try {
                client.withDraw(6000);
                System.out.println("С вашего счета снято 6000 сом");
                client.currentBalance();
                System.out.println();
            } catch (LimitException e) {
                try {
                    client.withDraw(e.getRemainingAmount());
                    System.out.println(e.getMessage() + e.getRemainingAmount() + " сом");
                    System.out.println("Снята оставшаяся сумма");
                    client.currentBalance();
                } catch (LimitException le) {
                    System.out.println("Возникла другая ошибка");
                }
                break;
            }
        }
    }
}