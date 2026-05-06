public class Main {

    public static void main(String[] args) {

        GameObject player = GameObjectFactory.createObject("player");
        GameObject enemy = GameObjectFactory.createObject("enemy");
        GameObject item = GameObjectFactory.createObject("item");

        player.update();
        enemy.update();
        item.update();
    }
}