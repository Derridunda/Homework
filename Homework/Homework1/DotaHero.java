package Homework.Homework1;

public class DotaHero {
    public static void main(String[] args) {
        DotaHeroConstructor hero1 = new DotaHeroConstructor("Pudge", "Strength", 14);
        DotaHeroConstructor hero2 = new DotaHeroConstructor("Invoker", "Intelligence");
        DotaHeroConstructor hero3 = new DotaHeroConstructor("Slark");
        DotaHeroConstructor hero4 = new DotaHeroConstructor();

        hero2.setLvl(20);
        hero3.setMainSpec("Agility");
        hero4.set("Marci", "Uni", 30);
        hero1.set("Sven", "Strength", 25);
        DotaHeroConstructor.displayCount();
        DotaHeroConstructor.display(hero4);
        DotaHeroConstructor.display(hero1, "Уровень");
    }
}
    




