package enums;

public enum JobsEnum {
    warrior("Warrior"),
    ranger("Ranger"),
    magician("Magician"),
    priest("Priest"),
    monk("Monk"),
    thief("Thief"),
    paladin("Paladin"),
    druid("Druid"),
    barbarian("Barbarian"),
    sorcerer("Sorcerer");

    private final String value;

    JobsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static JobsEnum getValue(String value) {
        for(JobsEnum e: JobsEnum.values()) {
            if(e.value.equals(value)) {
                return e;
            }
        }
        return null;// not found
    }

}
