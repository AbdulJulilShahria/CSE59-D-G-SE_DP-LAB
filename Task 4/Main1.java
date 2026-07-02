

class TeamMember {
   protected String name;
   
   public TeamMember(String name){
       this.name =name;
   }
   public void work(){
       System.out.println(name+" is working .");
   }
}
class Employee extends TeamMember{
    public Employee(String name){
        super(name);
    }
    public void calculateBonus(){
        System.out.println("Calculating Standard employeee bonus...");
    }
}
class Contractor extends TeamMember{
    public Contractor (String name)
    {
        super(name);
    }
    public void submitInvoice(){
        System.out.println("Submitting invoice for payment .");
    }
}
public class Main1{
    public static void main(String[] args) {
        Employee employee=new Employee("Alice");
        employee.work();
        employee.calculateBonus();
        
        System.out.println();
        
        
     Contractor contractor =new Contractor("bob");
             
        contractor.work();
        contractor.submitInvoice();
    }
}
