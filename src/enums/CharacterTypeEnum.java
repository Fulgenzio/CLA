package enums;

public enum CharacterTypeEnum {

    npc("npc"),
    enemy("enemy"),
    player("player");

    private final String value;

    CharacterTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static CharacterTypeEnum getValue(String value) {
        for(CharacterTypeEnum e: CharacterTypeEnum.values()) {
            if(e.value.equals(value)) {
                return e;
            }
        }
        return null;// not found
    }
}
