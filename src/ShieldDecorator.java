public class ShieldDecorator extends GameObjectDecorator {

    public ShieldDecorator(GameObject decoratedObject) {
        super(decoratedObject);
    }

    @Override
    public void update() {
        decoratedObject.update();
        addShield();
    }

    private void addShield() {
        System.out.println("Shield ability added.");
    }
}