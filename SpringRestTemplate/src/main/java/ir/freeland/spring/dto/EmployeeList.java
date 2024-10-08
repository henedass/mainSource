package ir.freeland.spring.dto;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList
{
    public List<Employee> employees;

    public EmployeeList()
    {
        employees = new ArrayList<>();
    }

    public EmployeeList(List<Employee> employees)
    {
        this.employees = employees;
    }

    public void setEmployees(List<Employee> employees)
    {
        this.employees = employees;
    }

    public List<Employee> getEmployees()
    {
        return employees;
    }

	@Override
	public String toString() {
		return "EmployeeList [employees=" + employees + "]";
	}
    
    
}
