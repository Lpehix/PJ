#include "Character.cpp"
class Mage : public Character {
private:
    int mana;

public:
    Mage(int healthPoint, int movement, int mana) : Character(healthPoint, movement), mana(mana) {}

    int getMana() {
        return mana;
    }

    void setMana(int mana) {
        this->mana = mana;
    }

    // Ajoutez ici des méthodes spécifiques aux magiciens, par exemple des sorts
    void lancerSort() {
        // Implémentez la logique pour lancer un sort
    }
};
