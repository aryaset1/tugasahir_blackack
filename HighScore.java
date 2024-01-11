import java.util.HashMap;
import java.util.Map;

public class HighScore {
    private Map<String, Integer> highScores;

    public HighScore() {
        highScores = new HashMap<>();
    }

    public void addScore(String nama, int skor) {
        highScores.put(nama, skor);
    }

    public int getHighestScore() {
        int skorTertinggi = Integer.MIN_VALUE;
        for (int skor : highScores.values()) {
            if (skor > skorTertinggi) {
                skorTertinggi = skor;
            }
        }
        return skorTertinggi;
    }

    public String getNamaDenganSkorTertinggi() {
        int skorTertinggi = getHighestScore();
        for (Map.Entry<String, Integer> entry : highScores.entrySet()) {
            if (entry.getValue() == skorTertinggi) {
                return entry.getKey();
            }
        }
        return "";
    }
}