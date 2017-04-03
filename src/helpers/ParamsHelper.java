package helpers;

import enums.CharacterTypeEnum;
import enums.JobsEnum;
import enums.NpcJobsEnum;
import enums.RacesEnum;
import exceptions.IllegalParameterException;

public class ParamsHelper {

    public boolean checkRace(String race) throws IllegalParameterException {
        if (race.equals(RacesEnum.dwarf.getValue()) ||
            race.equals(RacesEnum.elf.getValue()) ||
            race.equals(RacesEnum.gnome.getValue()) ||
            race.equals(RacesEnum.halfElf.getValue()) ||
            race.equals(RacesEnum.halfling.getValue()) ||
            race.equals(RacesEnum.human.getValue()) ||
            race.equals(RacesEnum.orc.getValue())) {
            return true;
        } else {
            throw new IllegalParameterException(race);
        }

        }

    public boolean checkJobNpc(String job) throws IllegalParameterException {
        if (job.equals(NpcJobsEnum.alchemist.getValue()) ||
            job.equals(NpcJobsEnum.blackSmith.getValue()) ||
            job.equals(NpcJobsEnum.carpenter.getValue()) ||
            job.equals(NpcJobsEnum.cook.getValue()) ||
            job.equals(NpcJobsEnum.farmer.getValue()) ||
            job.equals(NpcJobsEnum.guard.getValue()) ||
            job.equals(NpcJobsEnum.monk.getValue()) ||
            job.equals(NpcJobsEnum.nobleman.getValue()) ||
            job.equals(NpcJobsEnum.soldier.getValue()) ||
            job.equals(NpcJobsEnum.stableHand.getValue()) ||
            job.equals(NpcJobsEnum.tanner.getValue())) {
            return true;
        } else {
            throw new IllegalParameterException(job);
        }

    }

    public boolean checkJobEnemy(String job) throws IllegalParameterException {
        if (job.equals(JobsEnum.barbarian.getValue()) ||
        job.equals(JobsEnum.druid.getValue()) ||
        job.equals(JobsEnum.magician.getValue()) ||
        job.equals(JobsEnum.monk.getValue()) ||
        job.equals(JobsEnum.paladin.getValue()) ||
        job.equals(JobsEnum.priest.getValue()) ||
        job.equals(JobsEnum.ranger.getValue()) ||
        job.equals(JobsEnum.sorcerer.getValue()) ||
        job.equals(JobsEnum.thief.getValue()) ||
        job.equals(JobsEnum.warrior.getValue())) {
            return true;
        } else {
            throw new IllegalParameterException(job);
        }
    }

    public boolean checkCharType(String baseChar) throws IllegalParameterException {
        if (baseChar.equals(CharacterTypeEnum.enemy.getValue()) ||
            baseChar.equals(CharacterTypeEnum.npc.getValue()) ||
            baseChar.equals(CharacterTypeEnum.player.getValue())) {
            return true;
        } else {
            throw new IllegalParameterException(baseChar);
        }
    }
}
