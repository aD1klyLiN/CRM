import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class DailyListWindow extends JFrame {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    private JPanel rootPanel;
    private JTable taskTable;

    public DailyListWindow() throws HeadlessException {
        super("Explore everyday tasks");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setDataVector(putData(), putColumns());
        taskTable.setModel(dtm);

        Rectangle screenBounds = getGraphicsConfiguration().getBounds();
        int x = screenBounds.width/2 - WIDTH/2;
        int y = screenBounds.height/2 - HEIGHT/2;
        setBounds(x, y, WIDTH, HEIGHT);

        setContentPane(rootPanel);
        setVisible(true);
    }

    private Vector<?> putColumns() {
        Vector<String> columns = new Vector<>(6);
        for (int i = 0; i < 6; i++) {
            columns.add(i, "Column " + (i + 1));
        }
        return columns;
    }

    private Vector<Vector<String>> putData() {
        Vector<Vector<String>> data = new Vector<>();
        for (int i = 0; i < 10; i++) {
            Vector<String> row = new Vector<>(6);
            for (int j = 0; j < 6; j++) {
                row.add(j, "Cell " + String.valueOf(i + 1) + (j + 1));
            }
            data.add(i, row);
        }
        return data;
    }
}
