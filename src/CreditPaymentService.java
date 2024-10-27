public class CreditPaymentService {
    public double calculate(int credit, double percent, int month){
        double monthPercent = (percent / 12) / 100;
        double a = Math.pow((1 + monthPercent), month);
        return credit * ((monthPercent * a) / (a - 1));
    }
}
