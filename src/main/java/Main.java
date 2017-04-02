import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
            System.out.println(currentEmployee.getName()+" "+currentEmployee.getProjectName());
        }

        myCompany.addTrEmployee("1",new Employee("Serj",11 ,"Hillel"));
        myCompany.addTrEmployee("2",new Employee("Alex",11 ,"Hillel"));
        myCompany.addTrEmployee("3",new Employee("Serj",11 ,"Hillel"));


        Set set = myCompany.treeMap.entrySet();
        for (Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + ", Name: " + mapEntry.getValue());
        }
          System.out.println("======delete #2 =====");
          myCompany.deleteTrEmployee("2");
       //   System.out.println("Modifying Proselyte...");
      //  String name = myCompany.treeMap.get(2);
      //   name += " Changed";
     //    myCompany.treeMap.put(2, name);
      //  myCompany.treeMap.clear();

        set = myCompany.treeMap.entrySet();
        for (Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + ", Name: " + mapEntry.getValue());
        }
      //  myCompany.deleteEmployeeByName("Serj");

      //  System.out.println();
      //  System.out.println("After deleted Serj");

//        for (Employee currentEmployee : myCompany.getAllEmployees()) {
//            System.out.println(currentEmployee.getName());
//        }
        System.out.println("============= update employee name ============");
        myCompany.editEmployeeProjectName("Alex","NEW Employee",1);

        // возвращает первую строку
        Iterator employeeIterator = myCompany.getAllEmployees().iterator();
        myCompany.print(employeeIterator);


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
