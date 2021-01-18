

public abstract class OwnerImpl {
    public static class hotelOwnerImpl extends Human implements rMental, Phys {
        public hotelOwnerImpl(String name) {
            super(name);
        }
        public void firstSkill() {
            System.out.println(getName() + " increase room fees and his " + Income.RICH);
        }

        public void secondSkill() {
            System.out.println(getName() + " allows to live for free ");
        }

        public void firstCondition() {
            System.out.println(getName() + Condition.SCARE);
        }
    }
    public static class factoryOwnerImpl extends Human implements factoryOwner{
        public factoryOwnerImpl(String name) {
            super(name);
        }

        public void up(String kovrijki) {
            System.out.println(getName() + Income.INCREASE + kovrijki + " and " + Income.MONEY);
        }
    }
    public static class tvOwnerImpl extends Human implements tvOwner{
        public tvOwnerImpl(String name) {
            super(name);
        }

        public void resistance(String Migo) {
            System.out.println(getName() + " did not refuse to pay, but offered such a ridiculously small amount and " + Migo +" was" + Condition.ANGRY);
        }
        public void compelled(String Migo){
            System.out.println("The threats worked, and " + getName() + " was forced to agree to the conditions that " + Migo + " offered");
        }
    }
}
