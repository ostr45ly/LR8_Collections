import java.util.ArrayList;

public class MyCompany {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public ArrayList<Employee> getAllEmployees() {
        return employeeList;
    }

    public void addEmployee(String employeeName, int age, String projectName) {
        employeeList.add(new Employee(employeeName, age, projectName));
    }

    public void deleteEmployeeByName(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.remove(i);
            }
        }
    }


    public void deleteEmployeeOlder(int desiredAge) {
        // TODO
    }

    public Employee getEmployeeByName(String employeeName) {
        Employee employeeToReturn = null;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeToReturn = employeeList.get(i);
            } else {
                employeeToReturn = new Employee("Not found", 0, "Not found");
            }
        }
        return employeeToReturn;
    }

    public void editEmployeeProjectName(String employeeName, String projectName,int subMenu) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                switch (subMenu ) {
                     case 1:
                         employeeList.get(i).setName(projectName);
                         break;
                     case 2:
                        employeeList.get(i).setProjectName(projectName);
                         break;
                     case 3:
                        employeeList.get(i).setProjectName(projectName);
                        break;
                     default:
                        break;
                }

            }
        }
    }

}
