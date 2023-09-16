public class Mage extends Character {
    private int mana;

    public Mage(int HealthPoint, int movement, int mana) {
        super(HealthPoint, movement);
        this.mana = mana;
    }

    public int getmana() {
        return mana;
    }

    public void setmana(int mana) {
        this.mana = mana;
    }

    // Ajoutez ici des méthodes spécifiques aux magiciens, par exemple des sorts
    public void lancerSort() {
        // Implémentez la logique pour lancer un sort
    }
}
