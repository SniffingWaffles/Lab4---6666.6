public final class City extends Human implements Phys{

    public City(String name) {
        super(name);
    }
    public void firstSkill(){
        System.out.println(getName() + " hum like a disturbed hive ");
    }

    public void secondSkill() {
        System.out.println(getName() + " accepts tourists ");
    }
}

