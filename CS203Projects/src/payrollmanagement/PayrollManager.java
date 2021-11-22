package payrollmanagement;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class PayrollManager {

    private ArrayList<Employee> employees;

    public PayrollManager() {
        this.employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {

        this.employees = employees;
    }

    public void registerEmployee(Employee employee){ //from main method or gui
        //employees.txt file format: type fn ln dob salary
        writeEmployeeDataToFile(employee);
    }

    public void updateEmployee(Employee employee1, Employee employee2){
        //read from employees.txt file first
        ArrayList<Employee> empList = readEmployeesFile();
        int index = -1; //assume e1 does not exist
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).equals(employee1)){
                index = i; //employee to be replaced by e2
                break;
            }
        }
        if(index != -1){
            empList.set(index, employee2); //replaces e1 by e2
        }
        //write back updated arrayList to the file
        writeEmployeeListToFile(empList);
    }

    public void deleteEmployee(Employee employee){
        //read from employees.txt file first
        ArrayList<Employee> empList = readEmployeesFile();
        int index = -1; //assume e1 does not exist
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).equals(employee)){
                index = i; //employee to be replaced by e2
                break;
            }
        }
        if(index != -1){
            empList.remove(index); //removes e
        }
        //write back updated arrayList to the file
        writeEmployeeListToFile(empList);
    }

    public Employee getMostPaidEmployee(){
        //read employees from the file
        ArrayList<Employee> empList = readEmployeesFile();
        double maxSalary = Double.MIN_VALUE;;
        int index = -1;
        for(int i = 0; i < empList.size(); i++){
            double salary = empList.get(i).getSalary();
            if(salary > maxSalary){
                maxSalary = salary;
                index = i;
            }
        }
        if(index != -1){
            return empList.get(index);
        }
        return null;
    }

    public double getAverageSalary(){

        //read employees from the file
        ArrayList<Employee> empList = readEmployeesFile();
        double sum = 0.0;
        for(Employee e: empList){
            double salary = e.getSalary();
            sum = sum + salary;
        }
        return sum/empList.size();
    }


    public void registerTimeOff(Employee employee, LocalDate startDate, LocalDate endDate){
        EmployeeTimeOff timeOff = new EmployeeTimeOff(startDate, endDate, employee);
        writeTimeOffToFile(timeOff);
    }

    public void displayNetSalaryAndDeduction(Employee employee){
        ArrayList<EmployeeTimeOff> timeOffList = readEmployeesTimeOff();
        int leaveDays = 0;
        for(EmployeeTimeOff timeOff: timeOffList){
            if(timeOff.getEmployee().equals(employee)){
                leaveDays = leaveDays + Period.between(timeOff.getStartDate(), timeOff.getEndDate()).getDays();
            }
        }
        double timeOffDeduction = employee.calculateTimeOffDeduction(leaveDays);
        double taxDeduction = employee.calculateTaxDeduction();
        double totalSalary = employee.getSalary();// poly
        double netSalary = totalSalary - taxDeduction - timeOffDeduction;
        System.out.println("Tax Deduction: "+taxDeduction);
        System.out.println("TimeOff Deduction: "+timeOffDeduction);
        System.out.println("Net Salary: "+netSalary);
    }

    private void writeEmployeeDataToFile(Employee emp){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./employees.txt", true));

        writer.write(emp.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Employee> readEmployeesFile(){
        ArrayList<Employee> employeeList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./employees.txt"));
            String str = reader.readLine();
            while(str != null){
                String[] data = str.split(" ");
                Employee emp = null;
                if(data[0].equals("AnnuallyPaidStaff")){
                    emp = new AnnuallyPaidStaff(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                }
                else if(data[0].equals("AssistantProfessor")){
                    emp = new AssistantProfessor(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                }
                else if(data[0].equals("AssociateProfessor")){
                    emp = new AssociateProfessor(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                }
                else if(data[0].equals("FullProfessor")){
                    emp = new FullProfessor(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                }
                else if(data[0].equals("HourlyPaidStaff")){
                    emp = new HourlyPaidStaff(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                }
                else if(data[0].equals("Instructor")){
                    emp = new Instructor(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                }
                employeeList.add(emp);
                str = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    private void writeEmployeeListToFile(ArrayList<Employee> empList){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./employees.txt"));
            for(Employee e: empList){
                writer.write(e.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeTimeOffToFile(EmployeeTimeOff timeOff){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./timeOff.txt", true));
            writer.write(timeOff.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<EmployeeTimeOff> readEmployeesTimeOff(){
        ArrayList<EmployeeTimeOff> employeeTimeOffList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./timeOff.txt"));
            String str = reader.readLine();
            while(str != null){
                String[] data = str.split(" ");
                Employee emp = null;
                EmployeeTimeOff employeeTimeOff = null;
                if(data[0].equals("AnnuallyPaidStaff")){
                    //Instructor John Clark 1996-05-09 80000.0 2021-05-09 2021-05-19
                    emp = new AnnuallyPaidStaff(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                    employeeTimeOff = new EmployeeTimeOff(LocalDate.parse(data[5]),LocalDate.parse(data[6]), emp);
                }
                else if(data[0].equals("AssistantProfessor")){
                    emp = new AssistantProfessor(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                    employeeTimeOff = new EmployeeTimeOff(LocalDate.parse(data[5]),LocalDate.parse(data[6]), emp);
                }
                else if(data[0].equals("AssociateProfessor")){
                    emp = new AssociateProfessor(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                    employeeTimeOff = new EmployeeTimeOff(LocalDate.parse(data[5]),LocalDate.parse(data[6]), emp);
                }
                else if(data[0].equals("FullProfessor")){
                    emp = new FullProfessor(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                    employeeTimeOff = new EmployeeTimeOff(LocalDate.parse(data[5]),LocalDate.parse(data[6]), emp);
                }
                else if(data[0].equals("HourlyPaidStaff")){
                    emp = new HourlyPaidStaff(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                    employeeTimeOff = new EmployeeTimeOff(LocalDate.parse(data[5]),LocalDate.parse(data[6]), emp);
                }
                else if(data[0].equals("Instructor")){
                    emp = new Instructor(data[1], data[2], LocalDate.parse(data[3]), Double.parseDouble(data[4]));
                    employeeTimeOff = new EmployeeTimeOff(LocalDate.parse(data[5]),LocalDate.parse(data[6]), emp);
                }
                employeeTimeOffList.add(employeeTimeOff);
                str = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeTimeOffList;
    }
}
