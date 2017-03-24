package contracts;

import java.util.List;

public class Spell {

    private String name;

    private int spellLevel;

    private long range;

    private boolean isAoE;

    private long areaOfEffect;

    private List<SpellEffect> effects;

    private int pointCost;
}
