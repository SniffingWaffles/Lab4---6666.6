import java.util.Objects;
public abstract class Human {
    private Location location = Location.CITY;
    private String name;
    public Human(String name) {
        this.name = name;
    }

    public void changeLocation(Location loc) {
        this.location = loc;
    }
    public Location getLocation(){
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return this.name;
    }


    public boolean equals(Object ex) {
        if (this == ex) return true;
        if (this.getClass() != ex.getClass() || ex == null) return false;
        Human other = (Human) ex;
        if (name == other.name) return false;
        return true;
    }


    public int hashCode() {
        return Math.abs(Objects.hash(this.name));
    }
}
