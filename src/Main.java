public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        player.setAttackStrategy(new RavexAttack());
        player.update();

        player.setAttackStrategy(new VortexAttack());
        player.update();

        GameEventSystem eventSystem = new GameEventSystem();
        eventSystem.addObserver(new ScoreSystem());

        eventSystem.notifyObservers("Enemy killed");
    }
}