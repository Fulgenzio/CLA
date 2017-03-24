package enums;

public enum SpellTypesEnum {

    arcane(1),
    holy(2),
    natural(3);

    private final int value;

    SpellTypesEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static SpellTypesEnum getValue(int value) {
        for(SpellTypesEnum e: SpellTypesEnum.values()) {
            if (e.value == value) {
                return e;
            }
        }
        return null;
    }
}
