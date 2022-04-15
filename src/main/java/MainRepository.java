import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class MainRepository {

    private List<Employee> employeesList = Collections.emptyList();

    public MainRepository(List<Employee> list) {

        this.employeesList.addAll(list);

    }

    public Vector<Employee> getEmployeesVector(Collection<Employee> c) {
        return new Vector<>(c);
    }


    private class DBOpenHelper {

    }

    private class Mock {

        private String[] employees = {"Иванов", "Петров", "Смирнов", "Кузнецов"};
        private String[] workTypes = {"Электрика", "Шинка", "Сход-развал"};

        public Mock() {

        }

    }

}
