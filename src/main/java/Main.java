import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        //deleteEmployeeByName
        //getEmployeeByName
       // addEmployee
        //editEmployeeProjectName

        MyCompany myCompany = new MyCompany();
        myCompany.addEmployee("Serj", 25, "Hillel");
        myCompany.addEmployee("Alex", 30, "Hillel");
        myCompany.addEmployee("Serj", 33, "VIZA");

        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName());
        }

      //  myCompany.deleteEmployeeByName("Serj");

      //  System.out.println();
      //  System.out.println("After deleted Serj");

//        for (Employee currentEmployee : myCompany.getAllEmployees()) {
//            System.out.println(currentEmployee.getName());
//        }
        System.out.println("============= update employee name ============");
        myCompany.editEmployeeProjectName("Alex","NEW Employee",1);
      //  printEmployee(myCompany.getAllEmployees());
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName()+" "+currentEmployee.getProjectName());
        }
        System.out.println("============= set project name ============");
        myCompany.editEmployeeProjectName("NEW Employee","NEW Hillel",2);
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName()+" "+currentEmployee.getProjectName());
        }
        System.out.println("=========== clear project name ==============");
        myCompany.editEmployeeProjectName("NEW Employee","",3);
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName()+" "+currentEmployee.getProjectName());
        }
        System.out.println("=========================");
        System.out.println(myCompany.getEmployeeByName("Test Name").getName());


//        public static void printEmployee(ArrayList<Employee> employeeList){
//        for (Employee currentEmployee : employeeList) {
//            System.out.println(currentEmployee.getName()+" "+currentEmployee.getProjectName());
//          }
//        }
    }



    //        new Employee();
//        new Employee("", 20, "");

//        ArrayList<Object> listOfObjects = new ArrayList<Object>();
//        listOfObjects.add("Test");
//        listOfObjects.add(new Employee());

//        ArrayList<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(new Employee("Serj", 25, "Hillel"));
//        employeeList.add(new Employee("Alex", 30, "Electric Cloud"));
//        employeeList.add(new Employee("Serj", 45, "Sigma"));

}
