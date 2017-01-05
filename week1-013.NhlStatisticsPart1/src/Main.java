import java.util.*;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        //System.out.println("GOALS ==============================================");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

       //System.out.println("PENALTIES ==========================================");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        //System.out.println("SIDNEY ========================================");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        //NHLStatistics.top(0);

       //System.out.println("PHILLY ============================================================");
        //NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("PHI");

     // System.out.println("ANA ==================================================================");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");


    }
}
