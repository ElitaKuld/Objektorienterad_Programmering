package Sprint_2.Övning_11;

import java.time.Duration;
import java.time.LocalTime;

public class TidMetoder {

    public static int räknaUtTillgängligTid(int totalLängd, int användTid) {
        return totalLängd - användTid;
    }

    public static int räknaUtDuration(String början, String slut) {
        LocalTime lt1 = LocalTime.parse(början);
        LocalTime lt2 = LocalTime.parse(slut);
        Duration d = Duration.between(lt1, lt2);
        return (int) d.abs().toMinutes();
    }

    public static boolean checkIfItFits(int tillgängligTid, int duration) {
        boolean answer;
        if (tillgängligTid >= duration)
            answer = true;
        else
            answer = false;
        return answer;
    }

    public static String geSammanfattning(boolean ifItFits) {
        String sammanfattning = "";
        if (ifItFits)
            sammanfattning = "Ja, detta tv-program får plats på ditt videoband.";
        else
            sammanfattning = "Tyvärr, det är för lite tid kvar på ditt video band.";
        return sammanfattning;
    }
}