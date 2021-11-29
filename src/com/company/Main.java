

package com.company;

public class Main {

    public static void main(String[] args) {
        Medic suna = new Medic();
        Magic rimuru = new Magic();
        Warrior badji = new Warrior();
        Hero[] heroes = { suna ,rimuru , badji};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility( " Ability");

        }

    }
}