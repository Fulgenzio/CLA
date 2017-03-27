package contracts;

import contracts.effects.WeaponEffect;

import java.util.List;

public class Weapon extends Item {

    private int mainDamage;

    private int secondaryDamage;

    private String mainDamageType;

    private String secondaryDamageType;

    private List<WeaponEffect> weaponEffects;

    private long range;

    public int getMainDamage() {
        return mainDamage;
    }

    public void setMainDamage(int mainDamage) {
        this.mainDamage = mainDamage;
    }

    public int getSecondaryDamage() {
        return secondaryDamage;
    }

    public void setSecondaryDamage(int secondaryDamage) {
        this.secondaryDamage = secondaryDamage;
    }

    public String getMainDamageType() {
        return mainDamageType;
    }

    public void setMainDamageType(String mainDamageType) {
        this.mainDamageType = mainDamageType;
    }

    public String getSecondaryDamageType() {
        return secondaryDamageType;
    }

    public void setSecondaryDamageType(String secondaryDamageType) {
        this.secondaryDamageType = secondaryDamageType;
    }

    public List<WeaponEffect> getWeaponEffects() {
        return weaponEffects;
    }

    public void setWeaponEffects(List<WeaponEffect> weaponEffects) {
        this.weaponEffects = weaponEffects;
    }


}
