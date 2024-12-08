 class MasterStudent extends Student implements ConferenceScoreBehaviour{
    private int numberOfConferences;
    public MasterStudent(int mid, int fin, int numberOfConferences){
        super( mid, fin) ;
        this.numberOfConferences = numberOfConferences;
    }
    @Override
     public double computeTotalScore(){
        return computeBaseScore()+ numberOfConferences*5;

    }
    @Override
    public int conferenceScore(){
        return numberOfConferences*5;
    }

}
