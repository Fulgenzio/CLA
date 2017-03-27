package contracts;

import contracts.effects.SpellEffect;

import java.util.List;

public class Spell {

    private String name;

    private int spellLevel;

    private long range;

    private boolean isAoE;

    private long areaOfEffect;

    private List<SpellEffect> effects;

    private int pointCost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    public long getRange() {
        return range;
    }

    public void setRange(long range) {
        this.range = range;
    }

    public boolean isAoE() {
        return isAoE;
    }

    public void setAoE(boolean aoE) {
        isAoE = aoE;
    }

    public long getAreaOfEffect() {
        return areaOfEffect;
    }

    public void setAreaOfEffect(long areaOfEffect) {
        this.areaOfEffect = areaOfEffect;
    }

    public List<SpellEffect> getEffects() {
        return effects;
    }

    public void setEffects(List<SpellEffect> effects) {
        this.effects = effects;
    }

    public int getPointCost() {
        return pointCost;
    }

    public void setPointCost(int pointCost) {
        this.pointCost = pointCost;
    }
}
