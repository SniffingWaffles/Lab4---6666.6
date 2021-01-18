public class Main {
    public static void main(String[] arguments) {
        Gazeta paper = new Gazeta("News-paper Pravda");
        Conditer factory = new Conditer("Zarya");
        DoctorImpl Spryz = new DoctorImpl("Doctor Syringe");
        AstronautsImpl Neznayka = new AstronautsImpl("Neznayka");
        try { Neznayka.checkName();} catch (NoName noName) { System.err.println("ERROR! "+noName.getMessage()); }
        AstronautsImpl Migo = new AstronautsImpl("Migo");
        try { Migo.checkName();} catch (NoName noName) { System.err.println("ERROR! "+noName.getMessage()); }
        AstronautsImpl Julio = new AstronautsImpl("Julio");
        try { Julio.checkName();} catch (NoName noName) { System.err.println("ERROR! "+noName.getMessage()); }
        Spryz.changeLocation(Location.CHOLERA);
        candies gingerbread = new candies("Gingerbread");
        LunatiksImpl.Customers customers = new LunatiksImpl.Customers("Customers");
        LunatiksImpl.Sick patients = new LunatiksImpl.Sick("Patients");
        LunatiksImpl.Viewers tvViewers = new LunatiksImpl.Viewers("TV viewers");
        paper.attract(gingerbread.getName());
        paper.appeal(customers.getName(), gingerbread.getName(), factory.getName());
        customers.buy(gingerbread.getName());
        ConditerMagazImpl shop = new ConditerMagazImpl("Confectionery");
        shop.sell(gingerbread.getName());
        customers.dontWant(gingerbread.getName());
        OwnerImpl.factoryOwnerImpl candyOwner = new OwnerImpl.factoryOwnerImpl("Candy factory owner");
        OwnerImpl.tvOwnerImpl tvOwner = new OwnerImpl.tvOwnerImpl("TV studio owner");
        candyOwner.up(gingerbread.getName());
        paper.operation(Neznayka.getName());
        paper.adress(Spryz.getLocation());
        patients.run(Spryz.getName());
        patients.call(Spryz.getName());
        patients.queue(Spryz.getName(), Spryz.getLocation());
        Spryz.dontRefuse(patients.getName());
        Spryz.increase();
        customers.behavior(paper.getName());


        City Davilon = new City("Davilon");
        Davilon.firstSkill();
        LunatiksImpl.People dwellers = new LunatiksImpl.People("Dwellers");
        dwellers.firstMove();
        dwellers.secondMove();
        dwellers.thirdMove();
        dwellers.changeLocation(Location.HOTEL);
        dwellers.firstCondition();
        Davilon.secondSkill();
        LunatiksImpl.tourists tourists = new LunatiksImpl.tourists("Tourists");
        tourists.firstMove();
        tourists.changeLocation(Location.HOTEL);
        tourists.secondMove();
        tourists.thirdMove();
        OwnerImpl.hotelOwnerImpl Haps = new OwnerImpl.hotelOwnerImpl("Haps");
        Haps.firstSkill();
        Migo.threat(Julio.getName(), Haps.getName());
        Haps.firstCondition();
        Haps.secondSkill();
        Migo.liveFree(Julio.getName(), Neznayka.getName());
        tvViewers.sitAndWatch(Neznayka.getName());
        tvViewers.surprise(Neznayka.getName());
        Migo.dontWant(Julio.getName(), Neznayka.getName());
        tvOwner.resistance(Migo.getName());
        Migo.thoughts(tvOwner.getName());
        tvViewers.angry(tvOwner.getName());
        tvOwner.compelled(Migo.getName());
    }
}
