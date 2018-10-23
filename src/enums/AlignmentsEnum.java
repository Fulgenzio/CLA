package enums;

public enum AlignmentsEnum {
    lg("Lawful Good"),
    ng("Neutral Good"),
    cg("Chaotic Good"),
    ln("Lawful Neutral"),
    nn("Pure Neutral"),
    cn("Chaotic Neutral"),
    le("Lawful Evil"),
    ne("Neutral Evil"),
    ce("Chaotic Evil");

    private final String value;

    AlignmentsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AlignmentsEnum getValue(String value) {
        for (AlignmentsEnum e : AlignmentsEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;// not found
    }

    public static String[] getValuesArray() {

        String[] valuesArray = {
        AlignmentsEnum.lg.getValue(),
                AlignmentsEnum.ng.getValue(),
                AlignmentsEnum.cg.getValue(),
                AlignmentsEnum.ln.getValue(),
                AlignmentsEnum.nn.getValue(),
                AlignmentsEnum.cn.getValue(),
                AlignmentsEnum.le.getValue(),
                AlignmentsEnum.ne.getValue(),
                AlignmentsEnum.ce.getValue()};
        return valuesArray;
    }
}
