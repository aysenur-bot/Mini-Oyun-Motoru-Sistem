public class EnemyAdapter extends GameObject {

    private ExternalEnemySystem externalEnemy;

    public EnemyAdapter() {
        externalEnemy = new ExternalEnemySystem();
    }

    @Override
    public void update() {
        externalEnemy.drawEnemy();
    }
}