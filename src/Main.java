public class Main {

    public static void main(String[] args) {

        String type1 = "player";
        String type2 = "enemy";
        String type3 = "item";

        // Game loop simülasyonu
        updateObject(type1);
        updateObject(type2);
        updateObject(type3);
    }

    public static void updateObject(String type) {

        if (type.equals("player")) {
            System.out.println("Player moves, jumps and attacks.");
        }
        else if (type.equals("enemy")) {
            System.out.println("Enemy follows player and attacks.");
        }
        else if (type.equals("item")) {
            System.out.println("Item is waiting to be picked up.");
        }
        else {
            System.out.println("Unknown object type!");
        }
    }
}