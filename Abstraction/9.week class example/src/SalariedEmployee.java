public class SalariedEmployee extends Employee{

    double weeklySalary;

    public SalariedEmployee(String n ,int ssn,double wSalary){
        super(n,ssn);
        this.weeklySalary=wSalary;
    }
    @Override
    double earning(){
        return weeklySalary;
    }
}
