public abstract class GameObjectDecorator extends GameObject {
    protected GameObject decoratedObject;

    public GameObjectDecorator(GameObject decoratedObject) {
        this.decoratedObject = decoratedObject;
    }
}