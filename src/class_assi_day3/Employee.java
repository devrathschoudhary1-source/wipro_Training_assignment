package class_assi_day3;

 class Employee {
	  private double salary;

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        }
	    }
	

	 
	    public static void main(String[] args) {
	        Employee emp = new Employee();
	        emp.setSalary(50000);
	        System.out.println(emp.getSalary());
	    }
 }
	
