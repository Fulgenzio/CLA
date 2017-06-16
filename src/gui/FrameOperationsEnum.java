package gui;

public enum FrameOperationsEnum {

    close("close"),
    hide("hide"),
    nothing("nothing");

    private final String value;

    FrameOperationsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static FrameOperationsEnum getValue(String value) {
        for(FrameOperationsEnum e: FrameOperationsEnum.values()) {
            if(e.value.equals(value)) {
                return e;
            }
        }
        return null;// not found
    }
}
