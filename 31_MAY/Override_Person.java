class Person 
{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }
}

class Employee extends Person 
{
    private String employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, String employeeId, String jobTitle) 
    {
        super(firstName, lastName); 
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public String getEmployeeId() 
    {
        return employeeId;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }
    
    public String getLastName() 
    {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class Override_Person 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee("Mohit", "Saini", "EMP123", "Software Engineer");

        System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getEmployeeId());
       

    }
}
