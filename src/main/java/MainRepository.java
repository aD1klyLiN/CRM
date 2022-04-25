import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class MainRepository {

    private List<Employee> employeesList = Collections.emptyList();

    public MainRepository(List<Employee> list) {

        this.employeesList.addAll(list);
        DBOpenHelper dbOpenHelper = new DBOpenHelper();
        dbOpenHelper.doConnect();

    }

    public Vector<Employee> getEmployeesVector(Collection<Employee> c) {
        return new Vector<>(c);
    }


    private class DBOpenHelper {
        Connection connection;

        void doConnect() {
            connection = null;
            try {
                Class.forName("org.sqlite.JDBC");
                System.out.println("Class found");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:src:main:resources:base.db3");
                System.out.println("Connection activated");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private class Mock {

        private String[] employees = {"Иванов", "Петров", "Смирнов", "Кузнецов"};
        private String[] workTypes = {"Электрика", "Шинка", "Сход-развал"};

        public Mock() {

        }

    }

}
