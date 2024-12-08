class BachelourStudent extends Student implements ProjectScoreBehaviour{

    private int projectPoints;

    public BachelourStudent(int mid,int fin ,int projectPoints){
        super(mid,fin);
        this.projectPoints = projectPoints;
    }
    @Override
    public double computeTotalScore(){
        return computeBaseScore() + projectPoints ;

    }
    @Override
    public int projectScore(){
        return projectPoints;

    }


    }

