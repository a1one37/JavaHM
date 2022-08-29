package HomeW_6;

public class sample_of_HW_6 {
    public static void main(String[] args) {
        int warriors_eachType_Li = 860;
        double warriors_eachType_Min = 860 * 1.5;

        double soldier_Li = warriors_eachType_Li * 13;
        double archer_Li = warriors_eachType_Li * 24;
        double rider_Li = warriors_eachType_Li * 46;

        double soldier_Min = warriors_eachType_Min * 9;
        double archer_Min = warriors_eachType_Min * 35;
        double rider_Min = warriors_eachType_Min * 12;

        double overall_attack_rate_Li = soldier_Li + archer_Li + rider_Li;
        double overall_attack_rate_Min = soldier_Min + archer_Min + rider_Min;

        System.out.println("overall attack rate Li = " + overall_attack_rate_Li + " and overall attack rate Min = " + overall_attack_rate_Min);
    }
}
