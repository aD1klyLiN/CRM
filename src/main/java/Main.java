import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main extends JFrame {

    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JList<String> list1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final String WINDOW_TITLE = "CRM Main Window";

    private ArrayList<String> list;
    private DefaultListModel<String> dlm;

    public Main() throws HeadlessException {
        super(WINDOW_TITLE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Rectangle screenBounds = getGraphicsConfiguration().getBounds();
        int x = screenBounds.width/2 - WIDTH/2;
        int y = screenBounds.height/2 - HEIGHT/2;
        setBounds(x, y, WIDTH, HEIGHT);

        checkBox1.addItemListener(new ActionL());
        checkBox2.addItemListener(new ActionL());
        checkBox3.addItemListener(new ActionL());
        checkBox4.addItemListener(new ActionL());
        checkBox5.addItemListener(new ActionL());
        checkBox6.addItemListener(new ActionL());
        checkBox7.addItemListener(new ActionL());
        checkBox8.addItemListener(new ActionL());

        dlm = new DefaultListModel<>();
        list = new ArrayList<>();
        dlm.addAll(list);
        list1.setModel(dlm);

        setContentPane(rootPanel);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    private class ActionL implements ActionListener, ItemListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            System.out.println(actionEvent.getActionCommand());

        }

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            System.out.println(itemEvent.getStateChange() == ItemEvent.SELECTED);
            String element = ((JCheckBox) itemEvent.getItem()).getText();
            if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                dlm.addElement(element);
                System.out.println(element);
            } else {
                if (dlm.contains(element)) {
                    dlm.removeElementAt(dlm.indexOf(element));
                };

            }


        }
    }
}
