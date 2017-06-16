import contracts.NPC;
import creators.NpcCreator;
import exceptions.IllegalParameterException;
import gui.MainFrame;
import helpers.StatsHelper;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        StatsHelper helper = new StatsHelper();
        NpcCreator creator = new NpcCreator();

        MainFrame mainFrame = new MainFrame();
        JFrame frame = mainFrame.getFrame("test frame", 800, 600, "close");
        mainFrame.addGrid(frame, 1, 3);

        NPC npc = new NPC();
        try {
            npc = creator.getNpc("Elf", "Guard");
        } catch (IllegalParameterException e) {
            e.printStackTrace();
        }

        System.out.println(npc.toString());
    }

}
