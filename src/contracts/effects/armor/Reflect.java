package contracts.effects.armor;

import java.util.Random;

public class Reflect {

    private int reflectionPercent;

    public int getReflectionPercent() {
        return reflectionPercent;
    }

    public void setReflectionPercent(int reflectionPercent) {
        this.reflectionPercent = reflectionPercent;
    }

    public Reflect(int reflectionPercent) {
        this.reflectionPercent = reflectionPercent;
    }

    public Reflect reflectWeak() {
        Random rnd = new Random();
        return new Reflect(rnd.nextInt(15));
    }

    public Reflect reflectMedium() {
        Random rnd = new Random();
        int min = 16;
        int max = 25;
        return new Reflect((rnd.nextInt(max-min))+min);
    }

    public Reflect reflectStrong() {
        Random rnd = new Random();
        int min = 26;
        int max = 55;
        return new Reflect((rnd.nextInt(max-min))+min);
    }
}
