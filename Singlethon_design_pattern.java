
public class Singlethon_design_pattern {
    private static Singlethon_design_pattern instance = null;

    private Singlethon_design_pattern() {
        System.out.println("Singleton Constructor called");
    }

    public static Singlethon_design_pattern getInstance() {
        if (instance == null) {
            instance = new Singlethon_design_pattern();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singlethon_design_pattern s1 = Singlethon_design_pattern.getInstance();
        Singlethon_design_pattern s2 = Singlethon_design_pattern.getInstance();

        System.out.println(s1 == s2);
    }
}