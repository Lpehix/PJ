public class Character {
    private int HealthPoint;
    private int movement;

    public Character(int HealthPoint, int movement) {
        this.HealthPoint = HealthPoint;
        this.movement = movement;
    }

    public int getHealthPoint() {
        return HealthPoint;
    }

    public void setHealthPoint(int HealthPoint) {
        this.HealthPoint = HealthPoint;
    }

    public int getmovement() {
        return movement;
    }

    public void setmovement(int movement) {
        this.movement = movement;
    }
}
