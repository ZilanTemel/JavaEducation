public class CommissionEmployee extends Employee {
    double grpssSale;
    double comissionRate;

    public CommissionEmployee(String n,int ssn, double gSale, double cRate){
        super(n,ssn);
        this.comissionRate=cRate;
        this.grpssSale=gSale;
    }
    @Override

    double earning(){
        return grpssSale*comissionRate;
    }
    @Override
    public String toString() {
        return super.toString() + " gSale  :"  + this.grpssSale + " cRate: " + this.comissionRate;

    }

}
