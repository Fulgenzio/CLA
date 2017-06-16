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
        Inventory npcInventory = new Inventory();

        if (paramsHelper.checkRace(race) && paramsHelper.checkJobNpc(job)) {

            npc.setRace(race);
            npc.setJob(job);
            statsHelper.setJobStats(npc);
            raceHelper.setRaceModifiers(npc);

        }

        return npc;

    }
}
