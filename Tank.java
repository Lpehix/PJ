public class Tank extends Character {
    private int armor;

    public Tank(int HealthPoint, int movement, int armor) {
        super(HealthPoint, movement);
        this.armor = armor;
    }

    public int getarmor() {
        return armor;
    }

    public void setarmor(int armor) {
        this.armor = armor;
    }

    // Ajoutez ici des méthodes spécifiques aux tanks, par exemple des taunts
}
