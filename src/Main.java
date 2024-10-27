public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int month = 12;
        double percent = 9.99; // Годовая ставка, %

        int payment = (int) service.calculate(credit, percent, month);
        System.out.println("Ежемесячная выплата (кредит на 1 год): " + payment);

        month = 24;
        payment = (int) service.calculate(credit, percent, month);
        System.out.println("Ежемесячная выплата (кредит на 2 года): " + payment);

        month = 36;
        payment = (int) service.calculate(credit, percent, month);
        System.out.println("Ежемесячная выплата (кредит на 3 года): " + payment);
    }
}