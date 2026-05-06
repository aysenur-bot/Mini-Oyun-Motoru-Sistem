public class GameObjectFactory {

    public static GameObject createObject(String type) {

        if (type.equals("player")) {
            return new Player();
        }
        else if (type.equals("enemy")) {
            return new Enemy();
        }
        else if (type.equals("item")) {
            return new Item();
        }

        return null;
    }
}