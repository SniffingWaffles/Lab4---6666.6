public class ConditerMagazImpl extends Conditer implements ConditerMagaz {
    public ConditerMagazImpl(String name) {
        super(name);
    }
    public void sell(String kovrijki){
        System.out.println("On this day, as many " + kovrijki + " were sold in " + getName() + " as had not been sold before in a whole month");
    }
}
