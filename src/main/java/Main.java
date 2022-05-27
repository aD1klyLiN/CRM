import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

public class Main extends JFrame {

    private JPanel rootPanel;
    private JButton btnOpenDBase;
    private JList<String> list1;
    private JButton button1;

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final String WINDOW_TITLE = "CRM Main Window";

    public Main() throws HeadlessException {
        super(WINDOW_TITLE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Rectangle screenBounds = getGraphicsConfiguration().getBounds();
        int x = screenBounds.width/2 - WIDTH/2;
        int y = screenBounds.height/2 - HEIGHT/2;
        setBounds(x, y, WIDTH, HEIGHT);

        MainRepository mainRepository = new MainRepository(Collections.emptyList());

        btnOpenDBase.addActionListener(actionEvent -> onOpenDBaseClick());
        button1.addActionListener(actionEvent -> onOpenDailyListWindow());

        setContentPane(rootPanel);
        setResizable(false);
        setVisible(true);
    }

    private void onOpenDailyListWindow() {
        this.setVisible(false);
        DailyListWindow.getInstance().setVisible(true);
    }

    private void onOpenDBaseClick() {
        JFileChooser jFileChooser = new JFileChooser();
        int res = jFileChooser.showOpenDialog(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }



}
