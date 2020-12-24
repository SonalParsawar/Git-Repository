package javatpoint;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	
	//Autowired annotation on variable/setters is equivalent to autowire="byType"
	@Autowired
	private Employee employee;

	// constructor is used for autowire by constructor
	public EmployeeService(Employee employee) {
		//super();
		System.out.println("Autowiring by constructor used");
		this.employee = employee;
	}

	// default constructor to avoid BeanInstantiationException for autowire byName or byType
	public EmployeeService() {
		System.out.println("Default constructor used");
	}

	// used for autowire byName and byType
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}	
}
