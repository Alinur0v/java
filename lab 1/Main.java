import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class Clock extends JFrame {

    private JLabel timeLabel;

    public Clock() {
        setTitle("Clock");
        setSize(250, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        add(timeLabel);

        Timer timer = new Timer(1000, e -> showTime());
        timer.start();
    }

    private void showTime() {
        Calendar c = Calendar.getInstance();
        int h = c.get(Calendar.HOUR_OF_DAY);
        int m = c.get(Calendar.MINUTE);
        int s = c.get(Calendar.SECOND);

        timeLabel.setText(
                String.format("%02d:%02d:%02d", h, m, s)
        );
    }

    public static void main(String[] args) {
        new Clock().setVisible(true);
    }
}
