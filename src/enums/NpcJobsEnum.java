package enums;

public enum NpcJobsEnum {

    blackSmith("Blacksmith"),
    carpenter("Carpenter"),
    guard("Guard"),
    cook("Cook"),
    monk("Monk"),
    alchemist("Alchemist"),
    farmer("Farmer"),
    nobleman("Nobleman"),
    soldier("Soldier"),
    stableHand("Stable hand"),
    doctor("Doctor"),
    tanner("Tanner");

    private final String value;

    NpcJobsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static NpcJobsEnum getValue(String value) {
        for(NpcJobsEnum e: NpcJobsEnum.values()) {
            if(e.value.equals(value)) {
                return e;
            }
        }
        return null;// not found
    }



}
