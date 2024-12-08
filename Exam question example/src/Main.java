public class Main {
    public static void main(String[] args) {

        Student student1 = new BachelourStudent(70, 80, 20);
        Student student2 = new MasterStudent(85, 90, 3);
        Student student3 = new PhdStudent(90, 95, 5);


        System.out.println("Bachelour Student Total Score: " + student1.computeTotalScore());
        System.out.println("Master Student Total Score: " + student2.computeTotalScore());
        System.out.println("PhD Student Total Score: " + student3.computeTotalScore());

        System.out.println("Project Score (Bachelour): " + ((ProjectScoreBehaviour) student1).projectScore());
        System.out.println("Conference Score (Master): " + ((ConferenceScoreBehaviour) student2).conferenceScore());
        System.out.println("Article Score (PhD): " + ((ArticleScoreBehaviour) student3).articleScore());
    }
}
