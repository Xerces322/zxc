package oop.inheritance.lesson9.task2;

public class Country {
    private long countOfPopulation;
    private String language;
    private String continent;

    public Country(long countOfPopulation, String language, String continent) {
        this.countOfPopulation = countOfPopulation;
        this.language = language;
        this.continent = continent;
    }

    public long getCountOfPopulation() {
        return countOfPopulation;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }


}
