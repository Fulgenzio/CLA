package helpers;

import contracts.NPC;
import contracts.Stats;
import enums.CharacterTypeEnum;
import exceptions.IllegalParameterException;

import java.util.Optional;

public class StatsHelper {

    public Stats getStats(String baseChar)throws IllegalParameterException {
        if (baseChar.equals(CharacterTypeEnum.npc.getValue()) ||
                baseChar.equals(CharacterTypeEnum.player.getValue()) ||
                baseChar.equals(CharacterTypeEnum.enemy.getValue())) {
            Stats stats = new Stats();

            if (baseChar.equals("player")) {
                stats.setStrength(10);
                stats.setDexterity(10);
                stats.setConstitution(10);
                stats.setIntelligence(10);
                stats.setWisdom(10);
                stats.setCharisma(10);
            }
            return stats;
        } else {
            throw new IllegalParameterException(baseChar);
        }
    }

    public void setJobStats(NPC npc) {
        Stats npcStats = new Stats();
        switch (npc.getJob()) {
            case "Blacksmith": {
                npcStats.setStrength(14);
                npcStats.setDexterity(10);
                npcStats.setConstitution(12);
                npcStats.setIntelligence(10);
                npcStats.setWisdom(12);
                npcStats.setCharisma(10);
                npc.setStats(npcStats);
                break;
            }
            case "Carpenter": {
                npcStats.setStrength(12);
                npcStats.setDexterity(10);
                npcStats.setConstitution(12);
                npcStats.setIntelligence(14);
                npcStats.setWisdom(12);
                npcStats.setCharisma(10);
                npc.setStats(npcStats);
                break;
            }
            case "Guard": {
                npcStats.setStrength(14);
                npcStats.setDexterity(12);
                npcStats.setConstitution(14);
                npcStats.setIntelligence(12);
                npcStats.setWisdom(10);
                npcStats.setCharisma(14);
                npc.setStats(npcStats);
                break;
            }
            case "Cook": {
                npcStats.setStrength(10);
                npcStats.setDexterity(12);
                npcStats.setConstitution(12);
                npcStats.setIntelligence(12);
                npcStats.setWisdom(10);
                npcStats.setCharisma(12);
                npc.setStats(npcStats);
                break;
            }
            case "Monk": {
                npcStats.setStrength(10);
                npcStats.setDexterity(10);
                npcStats.setConstitution(12);
                npcStats.setIntelligence(12);
                npcStats.setWisdom(14);
                npcStats.setCharisma(14);
                npc.setStats(npcStats);
                break;
            }
            case "Alchemist": {
                npcStats.setStrength(10);
                npcStats.setDexterity(10);
                npcStats.setConstitution(12);
                npcStats.setIntelligence(14);
                npcStats.setWisdom(14);
                npcStats.setCharisma(10);
                npc.setStats(npcStats);
                break;
            }
            case "Farmer": {
                npcStats.setStrength(14);
                npcStats.setDexterity(12);
                npcStats.setConstitution(12);
                npcStats.setIntelligence(10);
                npcStats.setWisdom(12);
                npcStats.setCharisma(10);
                npc.setStats(npcStats);
                break;
            }
            case "Nobleman": {
                npcStats.setStrength(12);
                npcStats.setDexterity(12);
                npcStats.setConstitution(10);
                npcStats.setIntelligence(12);
                npcStats.setWisdom(10);
                npcStats.setCharisma(14);
                npc.setStats(npcStats);
                break;
            }
            case "Soldier": {
                npcStats.setStrength(14);
                npcStats.setDexterity(12);
                npcStats.setConstitution(14);
                npcStats.setIntelligence(10);
                npcStats.setWisdom(10);
                npcStats.setCharisma(14);
                npc.setStats(npcStats);
                break;
            }
            case "Stable hand": {
                npcStats.setStrength(12);
                npcStats.setDexterity(14);
                npcStats.setConstitution(10);
                npcStats.setIntelligence(10);
                npcStats.setWisdom(10);
                npcStats.setCharisma(10);
                npc.setStats(npcStats);
                break;
            }
            case "Doctor": {
                npcStats.setStrength(10);
                npcStats.setDexterity(14);
                npcStats.setConstitution(12);
                npcStats.setIntelligence(14);
                npcStats.setWisdom(12);
                npcStats.setCharisma(12);
                npc.setStats(npcStats);
                break;
            }
            case "Tanner": {
                npcStats.setStrength(12);
                npcStats.setDexterity(14);
                npcStats.setConstitution(10);
                npcStats.setIntelligence(10);
                npcStats.setWisdom(12);
                npcStats.setCharisma(10);
                npc.setStats(npcStats);
                break;
            }
        }
    }

    public int increaseStat(int stat, int increment) {
        while (increment > 0) {
            stat +=1;
            increment--;
        }
        return stat;
    }

    public int decreaseStat(int stat, int decrement) {
        while (decrement > 0) {
            stat -=1;
            decrement--;
        }
        return stat;
    }


}

