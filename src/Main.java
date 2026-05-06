public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        player.setAttackStrategy(new MeleeAttack());
        player.update();

        player.setAttackStrategy(new RangedAttack());
        player.update();

        GameEventSystem eventSystem = new GameEventSystem();
        eventSystem.addObserver(new ScoreSystem());

        eventSystem.notifyObservers("Enemy killed");
    }
}