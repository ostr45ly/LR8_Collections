import java.util.*;

public class MyCompany {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    HashMap<String, Employee> treeMap = new HashMap<String,Employee>();


    public ArrayList<Employee> getAllEmployees() {
        return employeeList;
    }

    public void addEmployee(String employeeName, int age, String projectName) {
        employeeList.add(new Employee(employeeName, age, projectName));
    }

    public HashMap<String, Employee> getAllEmployeesTr() {
        return treeMap;
    }

    public void addTrEmployee( String key,Employee tt) {
        treeMap.put(key,tt);
            }

    public void deleteTrEmployee( String key) {
        treeMap.remove( key);
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
                       // employeeList.clear();
                        break;
                     default:
                        break;
                }

            }
        }
    }
    public void print(Iterator<Employee> it) {
        System.out.println(it.next().getName()+" "+it.next().getProjectName());
    }

}
