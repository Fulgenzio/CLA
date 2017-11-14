package contracts;

import contracts.effects.WeaponEffect;

import java.util.List;

class Armor extends Item {

    private int defence;

    private List<WeaponEffect> weaponEffects;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public List<WeaponEffect> getWeaponEffects() {
        return weaponEffects;
    }

    public void setWeaponEffects(List<WeaponEffect> weaponEffects) {
        this.weaponEffects = weaponEffects;
    }
}