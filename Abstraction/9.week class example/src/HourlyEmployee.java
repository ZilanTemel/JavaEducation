public class HourlyEmployee extends Employee {
    double wage;
    int hours;

    public HourlyEmployee(String n, int ssn, double w, int h) {
        super(n, ssn);
        this.wage = w;
        this.hours = h;
    }

    @Override
    double earning() {
        if (hours <= 40)
            return wage * hours;
        else
            return wage * hours + (hours - 40) * wage * 1.5;
    }

    @Override
    public String toString(){
        return super.toString() + "wage : " + this.wage + "hours : " + this.hours;
    }
}
