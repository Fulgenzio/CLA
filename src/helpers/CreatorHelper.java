package helpers;

import exceptions.IllegalParameterException;

public class CreatorHelper {

    public boolean checkRace(String race) throws IllegalParameterException {
        if (race.equals("Human") ||
                race.equals("Elf") ||
                race.equals("Dwarf") ||
                race.equals("Orc") ||
                race.equals("Gnome") ||
                race.equals("Half-Elf")) {

            return true;
        } else {
            throw new IllegalParameterException(race);
        }

        }
}
