package helpers;

import contracts.NPC;
import contracts.Stats;

public class RaceHelper {

    public NPC setRaceModifiers(NPC npc) {
        Stats stats = npc.getStats();
        int stat;
        switch (npc.getRace()) {

            case "Human": {

            }

            case "Elf": {
                stats.setDexterity(stats.getDexterity() + 2);
                stats.setWisdom(stats.getWisdom() + 2);
                stats.setConstitution(stats.getConstitution() - 2);
                stats.setStrength(stats.getStrength() - 2);
                break;
            }

            case "Half-Elf": {
                stats.setDexterity(stats.getDexterity() + 2);
                stats.setConstitution(stats.getConstitution() - 2);
                break;
            }

            case "Dwarf": {
                stats.setStrength(stats.getStrength() + 2);
                stats.setConstitution(stats.getConstitution() + 2);
                stats.setCharisma(stats.getCharisma() - 2);
                stats.setDexterity(stats.getDexterity() - 2);
                break;
            }

            case "Orc": {
                stats.setStrength(stats.getStrength() + 2);
                stats.setConstitution(stats.getConstitution() + 2);
                stats.setCharisma(stats.getCharisma() - 2);
                stats.setIntelligence(stats.getIntelligence() - 2);
                break;
            }

            case "Halfling": {
                stats.setCharisma(stats.getCharisma() + 2);
                stats.setDexterity(stats.getDexterity() + 2);
                stats.setConstitution(stats.getConstitution() - 2);
                stats.setIntelligence(stats.getIntelligence() - 2);
                break;
            }

            case "Gnome": {
                stats.setDexterity(stats.getDexterity() + 2);
                stats.setIntelligence(stats.getIntelligence() + 2);
                stats.setStrength(stats.getStrength() - 2);
                stats.setWisdom(stats.getWisdom() - 2);
                break;
            }
        }
        return npc;

    }

}
