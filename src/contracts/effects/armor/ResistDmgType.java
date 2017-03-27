package contracts.effects.armor;

public class ResistDmgType {

    private String dmgType;

    private int resistPercent;

    public String getDmgType() {
        return dmgType;
    }

    public void setDmgType(String dmgType) {
        this.dmgType = dmgType;
    }

    public int getResistPercent() {
        return resistPercent;
    }

    public void setResistPercent(int resistPercent) {
        this.resistPercent = resistPercent;
    }

    public ResistDmgType(String type, int percent) {
        this.resistPercent = percent;
        this.dmgType = type;
    }
}
