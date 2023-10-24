import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main23 {
    public static void main(String[] args) {
        double buy_rate = 4.5940d;
        double sell_rate = 4.6250d;
        double spread = sell_rate - buy_rate;
        // spread = Math.round(spread * 100.0000) / 100.0000;
        BigDecimal bd = new BigDecimal(spread).setScale(4, RoundingMode.HALF_UP);
        double spread1 = bd.doubleValue();

        System.out.println("Spread " + bd);
        System.out.println(((Object) spread1).getClass().getSimpleName());
    }
}

// Bank buys EUR: 4.5940
// Bank sells EUR: 4.6250
// Spread: 0.0310
