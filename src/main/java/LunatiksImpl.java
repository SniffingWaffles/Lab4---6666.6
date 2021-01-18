public abstract class LunatiksImpl{
    public static class Sick extends Human implements LunatiksSick{
        public Sick(String name) {
            super(name);
        }

        public void run(String doctor) {
            System.out.println("As a result, all " + getName() + " who still had enough strength to move independently ran to the " + doctor);
        }
        public void call(String doctor){
            System.out.println("And those who could not leave the house began to call " + doctor + " on the phone");
        }

        public void queue(String doctor, Location loc) {
            System.out.println(getName() + " made a line the length of the whole " + loc);
        }
    }
    public static class Customers extends Human implements LunatiksCust{
        public Customers(String name) {
            super(name);
        }

        public void buy(String kovrijki) {
            System.out.println(getName() + " started buying " + kovrijki + " in huge quantities");
        }

        public void dontWant(String kovrijki) {
            System.out.println(getName() + " wanted nothing but " + kovrijki);
        }

        public void behavior(String paper) {
            System.out.println(getName() + " will not buy anything that is not printed in the " + paper);
        }

    }
    public static class Viewers extends Human implements LunaticksView{
        public Viewers(String name) {
            super(name);
        }
        public void sitAndWatch(String astronaut) {
            System.out.println(getName() + " sat all the time in front of televisions fearing miss the program with " + astronaut);
        }

        public void surprise(String astronaut) {
            System.out.println(getName() + Condition.SURPRISE + "that there is no such program with " + astronaut);
        }

        public void angry(String owner) {
            System.out.println(getName() + " was angry and began to call " + owner + " with threats to stop paying TV dues");
        }
    }
    public static class People extends Human implements rPhys,rMental {
        public People(String name) {
            super(name);
        }
        public void firstMove(){
            System.out.println(getName() + " wake up ");
        }
        public void secondMove(){
            System.out.println(getName() + " grab a newspaper ");
        }
        public void thirdMove(){
            System.out.println(getName() + " hustle outside " + Location.HOTEL + "all days ");
        }
        public void firstCondition(){
            System.out.println(getName() + Condition.HOPE + " to see astronauts");
        }
    }

    public static class tourists extends Human implements rPhys{
        public tourists(String name) {
            super(name);
        }
        public void firstMove(){
            System.out.println(getName() + " don't want to live in " + Location.anotherHotel + "s except " + Location.HOTEL);
        }
        public void secondMove(){
            System.out.println(getName() + " could meet shortys ");
        }
        public void thirdMove(){
            System.out.println(getName() + " could look closer at shortys ");
        }

    }


}
