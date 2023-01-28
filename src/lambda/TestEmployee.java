package lambda;
import java.util.ArrayList;
import java.util.function.*;
public class TestEmployee {
    void printEmployee(Employee e){
        System.out.println(e.name + "/" + e.department + "/" + e.salary);
    }
    void filtraciya(Predicate<Employee> pred, ArrayList<Employee> arr){
        for(Employee emp : arr){
            if(pred.test(emp)){
                printEmployee(emp);
            }
        }
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanko", "IT", 450);
        Employee employee2 = new Employee("Sever", "E", 200);
        Employee employee3 = new Employee("Mar", "Mar", 300);
        Employee employee4 = new Employee("Ivan", "E", 450);
        Employee employee5 = new Employee("Rick", "IT", 250);
        Employee employee6 = new Employee("Emily", "E", 400);
        ArrayList <Employee> arrayList = new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);
        arrayList.add(employee5);
        arrayList.add(employee6);
        TestEmployee t = new TestEmployee();
        t.filtraciya((employee) -> {return employee.department == "IT" && employee.salary > 200;}, arrayList);
        t.filtraciya((employee) -> {return employee.name.startsWith("E") && employee.salary != 450;}, arrayList);
        t.filtraciya((employee) -> {return employee.department == employee.name;}, arrayList);
    }
}

class Employee{
    String name;
    String department;
    int salary;
    Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
