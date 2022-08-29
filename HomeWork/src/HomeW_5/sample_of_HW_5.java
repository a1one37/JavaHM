package HomeW_5;

public class sample_of_HW_5 {
    public static void main(String[] args) {
        String teamName1 = "Green";
        int frags_firstPlayer_team1 = 7;
        int frags_secondPlayer_team1 = 13;
        int frags_thirdPlayer_team1 = 21;
        int frags_fourthPlayer_team1 = 11;
        double frags_fifthPlayer_team1 = 9;
        double averageScore_team1 = (frags_firstPlayer_team1 + frags_secondPlayer_team1 + frags_thirdPlayer_team1 + frags_fourthPlayer_team1 + frags_fifthPlayer_team1) / 5;


        String teamName2 = "Blue";
        int frags_firstPlayer_team2 = 10;
        int frags_secondPlayer_team2 = 8;
        int frags_thirdPlayer_team2 = 6;
        int frags_fourthPlayer_team2 = 17;
        double frags_fifthPlayer_team2 = 8;
        double averageScore_team2 = (frags_firstPlayer_team2 + frags_secondPlayer_team2 + frags_thirdPlayer_team2 + frags_fourthPlayer_team2 + frags_fifthPlayer_team2) / 5;


        if (averageScore_team1 > averageScore_team2) {
            System.out.println("Победила команда " + teamName1 + " набравшая " + averageScore_team1 + " очков");
        } else if (averageScore_team1 < averageScore_team2) {
            System.out.println("Победила команда " + teamName2 + " набравшая " + averageScore_team2 + " очков");
        }
    }

}
