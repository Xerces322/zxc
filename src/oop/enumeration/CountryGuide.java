package oop.enumeration;

public enum CountryGuide {
    JAPAN("Япония", 140_000_000, "Японский"),
    GREECE("Греция", 32_000_000, "Греческий"),
    ARGENTINA("Аргентина", 44_000_000,"Испанский");

    private String name;
    private int population;
    private String language;

    CountryGuide(String name, int population, String language) {
        this.name = name;
        this.population = population;
        this.language = language;
    }

    @Override
    public String toString() {
        return "CountryGuide{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", language='" + language + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getLanguage() {
        return language;
    }
}
