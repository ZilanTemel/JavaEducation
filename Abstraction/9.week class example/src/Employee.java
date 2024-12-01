public abstract class Employee {
    String name_surname;
    int ssn;
    public Employee(String n,int ssn){
        setName_surname(n);
        setSsn(ssn);
    }
    public void setName_surname(String name_surname){
        this.name_surname=name_surname;
    }
    public void setSsn(int ssn){
        this.ssn=ssn;
    }
    abstract double earning();

    @Override
    public String toString(){
        return "name:"   + this.name_surname +  " ssn :  " + this.ssn;
    }
}
