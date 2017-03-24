package contracts;

public class Player {

    private String name;

    private String race;

    private String job;

    private int level;

    private int experience;

    private int maxHealth;

    private int health;

    private int freeStats;

    private int freeSkill;

    private int freeFeats;

    private int freeSpell;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getFreeStats() {
        return freeStats;
    }

    public void setFreeStats(int freeStats) {
        this.freeStats = freeStats;
    }

    public int getFreeSkill() {
        return freeSkill;
    }

    public void setFreeSkill(int freeSkill) {
        this.freeSkill = freeSkill;
    }

    public int getFreeFeats() {
        return freeFeats;
    }

    public void setFreeFeats(int freeFeats) {
        this.freeFeats = freeFeats;
    }

    public int getFreeSpell() {
        return freeSpell;
    }

    public void setFreeSpell(int freeSpell) {
        this.freeSpell = freeSpell;
    }
}
