#include "Character.cpp"
class Tank : public Character {
private:
    int armor;

public:
    Tank(int healthPoint, int movement, int armor) : Character(healthPoint, movement), armor(armor) {}

    int getArmor() {
        return armor;
    }

    void setArmor(int armor) {
        this->armor = armor;
    }

    // Ajoutez ici des méthodes spécifiques aux tanks, par exemple des taunts
};
