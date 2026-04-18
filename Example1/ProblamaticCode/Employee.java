import javax.print.DocFlavor.STRING;
// this class is doing too many things meaning too many reasons to change it.This violates single responsibility principle.
public class Employee
{
    private int id; // Employee Id.
    private String name; // Employee Name.
    private String adddress; // Employee Address.

    public Employee(int id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport() // word file to excel or pdf file . if the report format changes we might need to update this function.
    {
        // code to print performance report.
        System.out.println("Performance report of employees: " + name);
    }

    public double computeSalary()// what if indian government changes the tax rules.
    {
        // code to compute salary.
        return 100;
    }

    public void updateEmployeeData() // what if we change from excel to dedicated database. if datastorage requirements change.
    {
        //code to update employee DATA.
        System.out.println("Employee dsata updated sucessfully ");
    }

    public void fetchEmployeeData()
    {
        // code to fetch Employee Data.
        System.out.println("Employee data fetched successfully");
    }
// srp : there should be only one reason to change a piece of code.
}