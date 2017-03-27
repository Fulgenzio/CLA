package contracts;

public class NPC extends Character {

    private String job;

    private Magic magic;

    private Inventory inventory;

    private long carriedWeight;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Magic getMagic() {
        return magic;
    }

    public void setMagic(Magic magic) {
        this.magic = magic;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public long getCarriedWeight() {
        return carriedWeight;
    }

    public void setCarriedWeight(long carriedWeight) {
        this.carriedWeight = carriedWeight;
    }

}
