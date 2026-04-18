package Example1.BetterCode;
// this class follows srp as it only contains corresponding employee class.
// this class now is only responsible for basic employee data creation and fetching.
public class Employee {

    private int id; // Employee Id.
    private String name; // Employee Name.
    private String adddress; // Employee Address.

    public Employee(int id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getEmployeeId()
    {
        return id;
    }

    public String getEmployeeName()
    {
        return name;
    }

    public String getEmployeeAddress()
    {
        return address;
    }

    public void setEmployeeAddress(String address)
    {
        this.adddress = address;
    }

    public void setEmployeeName(String name)
    {
        this.name = name;
    }
}
