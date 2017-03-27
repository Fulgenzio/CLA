package contracts;

import java.util.List;

public class Inventory {

    private List<Armor> wornArmor;

    private List<Weapon> wieldedWeapon;

    private List<Accessory> wornAccessories;

    private List<Item> carriedItems;

    private int coins;

    public List<Armor> getWornArmor() {
        return wornArmor;
    }

    public void setWornArmor(List<Armor> wornArmor) {
        this.wornArmor = wornArmor;
    }

    public List<Weapon> getWieldedWeapon() {
        return wieldedWeapon;
    }

    public void setWieldedWeapon(List<Weapon> wieldedWeapon) {
        this.wieldedWeapon = wieldedWeapon;
    }

    public List<Accessory> getWornAccessories() {
        return wornAccessories;
    }

    public void setWornAccessories(List<Accessory> wornAccessories) {
        this.wornAccessories = wornAccessories;
    }

    public List<Item> getCarriedItems() {
        return carriedItems;
    }

    public void setCarriedItems(List<Item> carriedItems) {
        this.carriedItems = carriedItems;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
