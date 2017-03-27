package contracts;

import java.util.List;

public class Magic {

    private int spellPoints;

    private int maxSpellPoints;

    private List<Spell> knownSpells;

    private int availableSpells;

    public int getSpellPoints() {
        return spellPoints;
    }

    public void setSpellPoints(int spellPoints) {
        this.spellPoints = spellPoints;
    }

    public int getMaxSpellPoints() {
        return maxSpellPoints;
    }

    public void setMaxSpellPoints(int maxSpellPoints) {
        this.maxSpellPoints = maxSpellPoints;
    }

    public List<Spell> getKnownSpells() {
        return knownSpells;
    }

    public void setKnownSpells(List<Spell> knownSpells) {
        this.knownSpells = knownSpells;
    }

    public int getAvailableSpells() {
        return availableSpells;
    }

    public void setAvailableSpells(int availableSpells) {
        this.availableSpells = availableSpells;
    }

    public void cast(Spell spell) {

    }
}
