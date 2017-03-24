package enums;

public enum RacesEnum {
    human("Human"),
    elf("Elf"),
    dwarf("Dwarf"),
    orc("Orc"),
    halfElf("Half-Elf"),
    gnome("Gnome");

    private final String value;

    RacesEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static RacesEnum getValue(String value) {
        for(RacesEnum e: RacesEnum.values()) {
            if(e.value.equals(value)) {
                return e;
            }
        }
        return null;// not found
    }


}
