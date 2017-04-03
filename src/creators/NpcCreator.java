package creators;

import contracts.Inventory;
import contracts.NPC;
import contracts.Stats;
import exceptions.IllegalParameterException;
import helpers.ParamsHelper;
import helpers.RaceHelper;
import helpers.StatsHelper;

public class NpcCreator {

    private ParamsHelper paramsHelper = new ParamsHelper();
    private StatsHelper statsHelper = new StatsHelper();
    private RaceHelper raceHelper = new RaceHelper();

    public NPC getNpc(String race, String job) throws IllegalParameterException {

        NPC npc = new NPC();
        Stats npcStats = statsHelper.getStats("npc");
        Inventory npcInventory = new Inventory();

        if (paramsHelper.checkRace(race) && paramsHelper.checkJobNpc(job)) {

            npc.setRace(race);

            switch (job) {

                case "Blacksmith": {
                    npcStats.setStrength(14);
                    npcStats.setDexterity(10);
                    npcStats.setConstitution(12);
                    npcStats.setIntelligence(10);
                    npcStats.setWisdom(12);
                    npcStats.setCharisma(10);

                }
                case "Carpenter": {
                    npcStats.setStrength(12);
                    npcStats.setDexterity(10);
                    npcStats.setConstitution(12);
                    npcStats.setIntelligence(14);
                    npcStats.setWisdom(12);
                    npcStats.setCharisma(10);
                }
                case "Guard": {
                    npcStats.setStrength(14);
                    npcStats.setDexterity(12);
                    npcStats.setConstitution(14);
                    npcStats.setIntelligence(12);
                    npcStats.setWisdom(10);
                    npcStats.setCharisma(14);
                }
                case "Cook": {
                    npcStats.setStrength(10);
                    npcStats.setDexterity(12);
                    npcStats.setConstitution(12);
                    npcStats.setIntelligence(12);
                    npcStats.setWisdom(10);
                    npcStats.setCharisma(12);
                }
                case "Monk": {
                    npcStats.setStrength(10);
                    npcStats.setDexterity(10);
                    npcStats.setConstitution(12);
                    npcStats.setIntelligence(12);
                    npcStats.setWisdom(14);
                    npcStats.setCharisma(14);
                }
                case "Alchemist": {
                    npcStats.setStrength(10);
                    npcStats.setDexterity(10);
                    npcStats.setConstitution(12);
                    npcStats.setIntelligence(14);
                    npcStats.setWisdom(14);
                    npcStats.setCharisma(10);
                }
                case "Farmer": {
                    npcStats.setStrength(14);
                    npcStats.setDexterity(12);
                    npcStats.setConstitution(12);
                    npcStats.setIntelligence(10);
                    npcStats.setWisdom(12);
                    npcStats.setCharisma(10);
                }
                case "Nobleman": {
                    npcStats.setStrength(12);
                    npcStats.setDexterity(12);
                    npcStats.setConstitution(10);
                    npcStats.setIntelligence(12);
                    npcStats.setWisdom(10);
                    npcStats.setCharisma(14);
                }
                case "Soldier": {
                    npcStats.setStrength(14);
                    npcStats.setDexterity(12);
                    npcStats.setConstitution(14);
                    npcStats.setIntelligence(10);
                    npcStats.setWisdom(10);
                    npcStats.setCharisma(14);
                }
                case "Stable hand": {
                    npcStats.setStrength(12);
                    npcStats.setDexterity(14);
                    npcStats.setConstitution(10);
                    npcStats.setIntelligence(10);
                    npcStats.setWisdom(10);
                    npcStats.setCharisma(10);
                }
                case "Doctor": {
                    npcStats.setStrength(10);
                    npcStats.setDexterity(14);
                    npcStats.setConstitution(12);
                    npcStats.setIntelligence(14);
                    npcStats.setWisdom(12);
                    npcStats.setCharisma(12);
                }
                case "Tanner": {
                    npcStats.setStrength(12);
                    npcStats.setDexterity(14);
                    npcStats.setConstitution(10);
                    npcStats.setIntelligence(10);
                    npcStats.setWisdom(12);
                    npcStats.setCharisma(10);
                }
            }

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

        return npc;

    }
}
