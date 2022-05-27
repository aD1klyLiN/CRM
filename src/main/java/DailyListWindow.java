import javax.swing.*;

public class DailyListWindow extends JFrame {

    private static DailyListWindow dailyListWindow;

    static DailyListWindow getInstance() {
        if (dailyListWindow == null) return new DailyListWindow();
        return dailyListWindow;
    }

}
