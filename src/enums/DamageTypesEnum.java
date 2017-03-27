package enums;

public enum DamageTypesEnum {

    fire("Fire"),
    ice("Ice"),
    dark("Dark"),
    light("Light"),
    lightning("Lighting"),
    earth("Earth"),
    energy("Energy"),
    physical("Physical");

    private final String value;

    DamageTypesEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static DamageTypesEnum getValue(String value) {
        for(DamageTypesEnum e: DamageTypesEnum.values()) {
            if(e.value.equals(value)) {
                return e;
            }
        }
        return null;// not found
    }
}
