public class ThreeInARow {
    private int kemenangan;
    private int streak;

    public ThreeInARow() {
        kemenangan = 0;
        streak = 0;
    }

    public void tambahKemenangan() {
        kemenangan++;
        if (kemenangan == 3) {
            streak++;
            kemenangan = 0;
        }
    }

    public int getStreak() {
        return streak;
    }

    public void addWin() {
    }
}