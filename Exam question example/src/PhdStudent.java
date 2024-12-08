public class PhdStudent extends Student implements ArticleScoreBehaviour{

    private int numberOfArticles;
    public PhdStudent(int mid,int fin,int numberOfArticles){
        super(mid,fin);
        this.numberOfArticles= numberOfArticles;
    }
    @Override
    public double computeTotalScore(){
        return computeBaseScore() + numberOfArticles*8;

    }
    @Override
    public int articleScore(){
        return numberOfArticles*8;
    }

}
