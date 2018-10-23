package enums;

public enum VendorJobsEnum {

    //general weapons merchant
    weaponsmith("weaponsmith"),
    //general armor merchant
    armorsmith("armorsmith"),
    //general ammo merchant
    fletcher("fletcher"),
    //bows, crossbows, slings merchant
    bowyer("bowyer"),
    //tools, low tier weapons
    blacksmith("blacksmith"),
    //herbs and mushrooms merchant, general ingredients
    herbalist("herbalist"),
    //general goods merchant (food, raw materials, random low tier stuff)
    peddler("peddler"),
    //general goods merchant (raw materials, gems, import goods, random high tier stuff, rich)
    merchant("merchant"),
    //horse and local mount merchant (military)
    warbreeder("warbreeder"),
    //cattle, sheep and animal commodities (raw meat, milk, cheese, wool etc)
    herder("herder"),
    //food, drink and accomodation (random)
    bartender("bartender"),
    //musica instruments, instrument maintenance stuff
    instrumentmaker("instrumentmaker"),
    //jewelry, trinkets (rich)
    jeweler("jeweler"),
    //clothes and garment clothing
    tailor("tailor"),
    //fabric, blankets, cloaks
    weaver("weaver"),
    //parchment, trascribing documents
    scribe("scribe"),
    //books, maps
    bookbinder("bookbinder"),
    //enchantments, enchanted trinkets, wands, staves
    enchanter("enchanter"),
    //staves, wooden goods, shields
    woodworker("woodworker"),
    //shoes, boots, bags
    shoemaker("shoemaker"),
    //spirits, ale, liquor, potions (natural)
    brewer("brewer"),
    //horses, import goods, carts, ships and transports
    caravanmaster("caravanmaster"),
    //tanned leather, parchment, furs
    tanner("tanner"),
    //meat, bone, tanned leather, horns and fur, hunting gear (arrows/bolts bows/crossbows) (low tier)
    hunter("hunter");

    private final String value;

    VendorJobsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static VendorJobsEnum getValue(String value) {
        for(VendorJobsEnum e: VendorJobsEnum.values()) {
            if(e.value.equals(value)) {
                return e;
            }
        }
        return null;// not found
    }

    public static String[] getValuesArray() {

        String[] valuesArray = {
                VendorJobsEnum.armorsmith.getValue(),
                VendorJobsEnum.bartender.getValue(),
                VendorJobsEnum.bookbinder.getValue(),
                VendorJobsEnum.bowyer.getValue(),
                VendorJobsEnum.brewer.getValue(),
                VendorJobsEnum.caravanmaster.getValue(),
                VendorJobsEnum.enchanter.getValue(),
                VendorJobsEnum.fletcher.getValue(),
                VendorJobsEnum.herbalist.getValue(),
                VendorJobsEnum.herder.getValue(),
                VendorJobsEnum.instrumentmaker.getValue(),
                VendorJobsEnum.jeweler.getValue(),
                VendorJobsEnum.merchant.getValue(),
                VendorJobsEnum.peddler.getValue(),
                VendorJobsEnum.scribe.getValue(),
                VendorJobsEnum.shoemaker.getValue(),
                VendorJobsEnum.tailor.getValue(),
                VendorJobsEnum.warbreeder.getValue(),
                VendorJobsEnum.weaponsmith.getValue(),
                VendorJobsEnum.weaver.getValue(),
                VendorJobsEnum.woodworker.getValue(),
                VendorJobsEnum.blacksmith.getValue(),
                VendorJobsEnum.hunter.getValue(),
                VendorJobsEnum.tanner.getValue()};
        return valuesArray;
    }
}
