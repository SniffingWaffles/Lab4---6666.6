import javax.annotation.processing.SupportedSourceVersion;

public class Gazeta implements PhotoNezn, photoSyringe{
    private String name;
    public Gazeta(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    class photoNezn {
        public String name1;
        public photoNezn(){
            this.name1="Picture of Neznayka ";
        }
    }
    class photoSpriz{
        public String name2;
        public photoSpriz(){
            this.name2="picture of Spriz ";
        }
    }
    photoNezn nezn = new photoNezn();
    photoSpriz spriz = new photoSpriz();


    public void attract(String whatShown) {
        System.out.println("In " + getName() + " was placed " + nezn.name1 + " with advertising post of " + whatShown);
    }
    public void appeal(String who, String whatShown, String company){
        System.out.println(nezn.name1 + " appeals " + who + " to buy " + whatShown + " by candy factory " + company);
    }

    public void operation(String Nezn) {
        System.out.println("Also in " + getName() + " was placed " + spriz.name2 + " during inspection " + Nezn);
    }

    public void adress(Location loc) {
        System.out.println("His address was printed under the picture: " + loc);
    }
}
