package helpers;

import contracts.Stats;
import enums.CharacterTypeEnum;
import exceptions.IllegalParameterException;

public class StatsHelper {

    public Stats getStats(String baseChar) throws IllegalParameterException {
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

