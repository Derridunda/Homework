package Homework.task1;

public class DotaHeroConstructor {

    private int lvl;
    private String name, mainSpec;
    private static int count;
    
    //Статический блок инициализации
    static {
        count = 0;
    }

    //Нестатический блок инициализации
    {
        count++;
    }

    //Конструкторы
    DotaHeroConstructor(String name, String mainSpec, int lvl) {
        this.name = name;
        this.mainSpec = mainSpec;
        this.lvl = lvl;
        
    }
    DotaHeroConstructor(String name, String mainSpec) {
        lvl = 1;
        this.name = name;
        this.mainSpec = mainSpec;
    }
    DotaHeroConstructor(String name) {
        lvl = 1;
        this.name = name;
        mainSpec = "Без атрибута";
    }
    DotaHeroConstructor() {
        lvl = 1;
        name = "Без имеени";
        mainSpec = "Без атрибута";
        
    }

    //Статический метод
    static void displayCount() {
        System.out.println("Количество вызванных героев: " + count);
    }

    //Нестатический метод
    void setLvl(int lvl) {
        this.lvl = lvl;
    }
    void setName(String name) {
        this.name = name;
    }
    void setMainSpec(String mainSpec) {
        this.mainSpec = mainSpec;
    }

    //Перегрузка методов
    void set(String name, String mainSpec, int lvl) {
        this.lvl = lvl;
        this.name = name;
        this.mainSpec = mainSpec;
    }
    void set(String mainSpec, int lvl) {
        this.lvl = lvl;
        this.mainSpec = mainSpec;
    }
    void set(int lvl) {
        this.lvl = lvl;
    }
    static void display(DotaHeroConstructor o) {
        System.out.println("Уровень героя: " + o.lvl);
        System.out.println("Имя героя: " + o.name);
        System.out.println("Основной атрибут: " + o.mainSpec);
    }
    static void display(DotaHeroConstructor o, String option) {
        if(option == "Уровень")      System.out.println("Уровень героя: " + o.lvl);
        else if(option == "Имя")     System.out.println("Имя героя: " + o.name);
        else if(option == "Атрибут") System.out.println("Основной атрибут: " + o.mainSpec);
    }

}
