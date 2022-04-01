import java.util.Collections;
import java.util.List;

public class MainRepository {

    private List<Employee> employeesList = Collections.emptyList();

    public MainRepository(List<Employee> list) {

        this.employeesList.addAll(list);

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
