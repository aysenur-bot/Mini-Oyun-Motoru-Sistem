public class Main {
    public static void main(String[] args) {

        GameObject player = GameObjectFactory.createObject("player");
        GameObject poweredPlayer = new ShieldDecorator(player);

        GameObject adaptedEnemy = new EnemyAdapter();

        poweredPlayer.update();
        adaptedEnemy.update();
    }
}