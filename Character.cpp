class Character {
private:
    int HealthPoint;
    int movement;

public:
    Character(int healthPoint, int movement) : HealthPoint(healthPoint), movement(movement) {}

    int getHealthPoint() {
        return HealthPoint;
    }

    void setHealthPoint(int healthPoint) {
        HealthPoint = healthPoint;
    }

    int getMovement() {
        return movement;
    }

    void setMovement(int move) {
        movement = move;
    }
};
