import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Зчитування з файла менеджерів та працівників
        ArrayList<Manager> managersList = Connector.setManager();
        ArrayList<Employee> employeesList = Connector.setEmployee(managersList);

        //Серіалізація менеджерів та працівників
        Connector.serialization("Manager.txt", null, managersList);
        Connector.serialization("Employee.txt", employeesList, null);

        //Десеріалізація менеджерів та працівників
        Connector.deserialization("Manager.txt", null, managersList);
        Connector.deserialization("Employee.txt", employeesList, null);

    }

}