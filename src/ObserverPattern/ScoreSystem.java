public class ScoreSystem implements Observer {
    public void update(String event) {
        System.out.println("Score updated due to: " + event);
    }
}