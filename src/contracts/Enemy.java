package contracts;

public class Enemy extends NPC{

    private boolean humanoid;

    private long maxWeight;

    private Inventory inventory;

    private String description;

    public boolean isHumanoid() {
        return humanoid;
    }

    public void setHumanoid(boolean humanoid) {
        this.humanoid = humanoid;
    }

    public long getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(long maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
