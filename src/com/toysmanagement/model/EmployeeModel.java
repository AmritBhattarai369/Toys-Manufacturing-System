package com.toysmanagement.model;

/**
 *
 * @author amritbhattarai
 */
public class EmployeeModel {
    
    private int empId;
    private String empName;
    private String empAddress;
    private String empContact;
    private String empPosition;
    private String empDepartment;
    
    public EmployeeModel(int empId, String empName, String empAddress, String empContact, String empPosition, String empDepartment)
    {
        this.empId=empId;
        this.empName=empName;
        this.empAddress=empAddress;
        this.empContact=empContact;
        this.empPosition=empPosition;
        this.empDepartment=empDepartment;
    }
    public int getEmpId()
    {
        return empId;
    }
    public void setEmpId(int empId)
    {
        this.empId=empId;
    }
    public String getEmpName()
    {
        return empName;
    }
    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
    public String getEmpAddress()
    {
        return empAddress;
    }
    public void setEmpAddress(String empAddress)
    {
        this.empAddress=empAddress;
    }
    public String getEmpContact()
    {
        return empContact;
    }
    public void setEmpContact(String empContact)
    {
        this.empContact=empContact;
    }
    public String getEmpPosition()
    {
        return empPosition;
    }
    public void setEmpPosition(String empPosition)
    {
        this.empPosition=empPosition;
    }
    public String getEmpDepartment()
    {
        return empDepartment;
    }
    public void setEmpDepartment(String empDepartment)
    {
        this.empDepartment=empDepartment;
    }
    
    
}
