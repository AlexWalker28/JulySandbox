package kg.kloop.android.julysandbox;

public class Mouse {

    private boolean caught;

    Mouse() {
        caught = false;
    }

    public boolean isCaught() {
        return caught;
    }

    public void setCaught(boolean caught) {
        this.caught = caught;
    }
}
