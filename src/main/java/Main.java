import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JList list1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;

    public Main() throws HeadlessException {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Rectangle screenBounds = getGraphicsConfiguration().getBounds();
        int width = 640;
        int height = 480;
        int x = screenBounds.width/2 - width/2;
        int y = screenBounds.height/2 - height/2;
        setBounds(x, y, width, height);
        setContentPane(rootPanel);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
            }
        });
    }
}
