import contracts.NPC;
import creators.NpcCreator;
import enums.AlignmentsEnum;
import exceptions.IllegalParameterException;
import gui.MainFrame;
import helpers.StatsHelper;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        StatsHelper helper = new StatsHelper();
        NpcCreator creator = new NpcCreator();

        MainFrame mainFrame = new MainFrame();
        JFrame frame = mainFrame.getFrame();

        NPC npc = new NPC();
        try {
            npc = creator.getNpc("Elf", "Guard");
            String[] ss = AlignmentsEnum.getValuesArray();
            System.out.println(ss);

        } catch (IllegalParameterException e) {
            e.printStackTrace();
        }

        System.out.println(npc.toString());
    }

}
