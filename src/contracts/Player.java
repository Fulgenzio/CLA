package contracts;

import java.util.List;

public class Player extends NPC {

    private int freeStatPts;

    private int freeSkillPts;

    private int freeFeatPts;

    private int freeSpellPts;

    private Magic magic;

    private Inventory inventory;

    private long maxWeight;

    public int getFreeStatPts() {
        return freeStatPts;
    }

    public void setFreeStatPts(int freeStatPts) {
        this.freeStatPts = freeStatPts;
    }

    public int getFreeSkillPts() {
        return freeSkillPts;
    }

    public void setFreeSkillPts(int freeSkillPts) {
        this.freeSkillPts = freeSkillPts;
    }

    public int getFreeFeatPts() {
        return freeFeatPts;
    }

    public void setFreeFeatPts(int freeFeatPts) {
        this.freeFeatPts = freeFeatPts;
    }

    public int getFreeSpellPts() {
        return freeSpellPts;
    }

    public void setFreeSpellPts(int freeSpellPts) {
        this.freeSpellPts = freeSpellPts;
    }

    public long getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(long maxWeight) {
        this.maxWeight = maxWeight;
    }
}
