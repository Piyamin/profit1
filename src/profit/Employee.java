package profit;


public class Employee {
	
	private String name;
    private String emp_id;
    public Employee() {
    }
    public Employee(String emp_id,String name) {
    	super();
        this.name = name;
        this.emp_id = emp_id;
    }
    public String getName() {
        return name;
    }

    public String getEmp_id() {
        return emp_id;
    }
	 
    public void printEmployee() {
        System.out.println(""+ emp_id+"  "+ name  );
    }
}
