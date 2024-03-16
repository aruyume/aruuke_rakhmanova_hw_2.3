public class BankAccount {
    private double amount;

    public BankAccount() {
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно денег. Оставшийся остаток: ", amount);
        }
        amount -= sum;
    }
    public void currentBalance() {
        System.out.println("Ваш текущий баланс: " + getAmount() + " сом");
    }
}
