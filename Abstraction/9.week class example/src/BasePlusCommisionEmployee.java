public class BasePlusCommisionEmployee extends  CommissionEmployee {

    double baseSalary;

    public BasePlusCommisionEmployee(String n, int ssn, double gSale, double cRate, double bSalary) {
        super(n, ssn, gSale, cRate);
        this.baseSalary = bSalary;
    }

    @Override
    double earning() {
        return super.earning() + this.baseSalary;
    }
}

