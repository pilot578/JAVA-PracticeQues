abstract class GameCharacter {
    abstract void attack(int value);
    abstract void defend(int value);
}

class Warrior extends GameCharacter {
    void attack(int value) {
        System.out.println("Attack: Powerful sword slash for " + (value * 3) + " damage!");
    }

    void defend(int value) {
        System.out.println("Defend: Raises shield, defence boosted by " + value + ".");
    }
}

class Wizard extends GameCharacter {
    void attack(int value) {
        System.out.println("Attack: Casts spell, deals " + (value * 2) + " magical damage!");
    }

    void defend(int value) {
        System.out.println("Defend: Creates magical barrier, defence boosted by " + value + ".");
    }
}
class game {
    public static void main(String[] args) {

        GameCharacter warrior = new Warrior();
        GameCharacter wizard = new Wizard();

        System.out.println("Warrior Actions:");
        warrior.attack(10);
        warrior.defend(5);

        System.out.println();

        System.out.println("Wizard Actions:");
        wizard.attack(10);
        wizard.defend(5);
    }
}