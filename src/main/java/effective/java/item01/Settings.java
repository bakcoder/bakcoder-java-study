package effective.java.item01;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETIINGS = new Settings();

    public static Settings getInstance() { return SETIINGS;}
}
