abstract class Student {
    protected int mid;
    protected int fin;
    public Student(int mid,int fin){
        this.mid=mid;
        this.fin=fin;
    }
    public abstract double computeTotalScore();

    public double computeBaseScore(){
        return mid*0.4+fin*0.6;
    }
}
