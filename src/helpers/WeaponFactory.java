package helpers;

/**
 * Created by zuana on 15/04/2017.
 */
public class WeaponFactory {
    private static WeaponFactory ourInstance = new WeaponFactory();

    public static WeaponFactory getInstance() {
        return ourInstance;
    }

    private WeaponFactory() {
    }
}
