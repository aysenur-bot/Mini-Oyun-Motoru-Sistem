public class Player extends GameObject {

    private AttackStrategy attackStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    @Override
    public void update() {
        attackStrategy.attack();
    }
}