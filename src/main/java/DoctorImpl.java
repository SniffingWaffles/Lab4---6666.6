public class DoctorImpl extends Human implements Doctor{
    public DoctorImpl(String name) {
        super(name);
    }

    public void dontRefuse(String sick) {
        System.out.println(getName() + " did not deny medical attention to " + sick);
    }


    public void increase() {
        System.out.println(getName() + " raised the fee and " + Income.MONEY);
    }
}
