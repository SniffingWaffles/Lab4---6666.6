import java.util.Objects;

public final class AstronautsImpl extends Human implements Astronauts {
    private String name;
    public void checkName() throws NoName {
        if (name == "") {
            throw new NoName("The shorty's name is missing");
        }
    }
    public AstronautsImpl(String name) {
        super(name);
    }


    public void threat(String Julio, String owner) {
        System.out.println(getName() + " and "+ Julio + " threat " + owner + " that they relocation to " + Location.anotherHotel);
    }

    public void liveFree(String Julio, String Neznayka) {
        System.out.println(getName() + ", " + Julio + ", " + Neznayka + " live for free in " + Location.HOTEL);
    }

    public void dontWant(String Julio, String Neznayka) {
        System.out.println(getName() + " and " + Julio + " did not agree to show " + Neznayka + " for free ");
    }

    public void thoughts(String owner) {
        System.out.println(getName() + " said that the " + owner + " obviously takes them for the idiots");
    }

}
