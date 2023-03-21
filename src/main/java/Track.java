public class Track extends Obstacle{
    public int getDistance() {
        return distance;
    }

    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }
}
