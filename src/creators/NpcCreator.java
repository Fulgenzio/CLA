package creators;

import contracts.NPC;
import enums.NpcJobsEnum;
import exceptions.IllegalParameterException;
import helpers.CreatorHelper;

public class NpcCreator {

    CreatorHelper helper = new CreatorHelper();

    public NPC getNpc(String race, String job) throws IllegalParameterException {

        NPC npc = new NPC();

        if (helper.checkRace(race)){

            npc.setRace(race);

            switch (race) {

                case "Human": {

                }
                case "Elf": {

                }
                case "Half-Elf": {

                }
                case "Orc": {

                }
                case "Dwarf": {

                }
                case "Gnome": {

                }
                case "Halfling": {

                }
            }
        }

        npc.setRace(race);


        switch (job) {

            case "Blacksmith": {

            }
            case "Carpenter": {

            }
            case "Guard": {

            }
            case "Cook": {

            }
            case "Monk": {

            }
            case "Alchemist": {

            }
            case "Farmer": {

            }
            case "Nobleman": {

            }
            case "Soldier": {

            }
            case "Stable hand": {

            }
            case "Doctor": {

            }
            case "Tanner": {

            }
        }

        return npc;

    }
}
