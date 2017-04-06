import contracts.NPC;
import creators.NpcCreator;
import exceptions.IllegalParameterException;
import helpers.StatsHelper;

public class Main {
    public static void main(String[] args) {

        StatsHelper helper = new StatsHelper();
        NpcCreator creator = new NpcCreator();

        int num = 10;

        num = helper.decreaseStat(num, 7);

        num = helper.increaseStat(num, 5);

        System.out.println("decreased stat: " + num);
        NPC npc = new NPC();
        try {
            npc = creator.getNpc("Elf", "Guard");
        } catch (IllegalParameterException e) {
            e.printStackTrace();
        }

        System.out.println(npc.toString());
    }

}
