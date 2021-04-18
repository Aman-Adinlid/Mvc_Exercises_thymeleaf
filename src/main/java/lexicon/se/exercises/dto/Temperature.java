package lexicon.se.exercises.dto;

import java.util.Objects;

public class Temperature {
    private String fever;
    private String normal;
    private String hyperthermia;

    public Temperature() {
    }

    public Temperature(String fever, String normal, String hyperthermia) {
        this.fever = fever;
        this.normal = normal;
        this.hyperthermia = hyperthermia;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getHyperthermia() {
        return hyperthermia;
    }

    public void setHyperthermia(String hyperthermia) {
        this.hyperthermia = hyperthermia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Objects.equals(fever, that.fever) && Objects.equals(normal, that.normal) && Objects.equals(hyperthermia, that.hyperthermia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fever, normal, hyperthermia);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "fever='" + fever + '\'' +
                ", normal='" + normal + '\'' +
                ", hyperthermia='" + hyperthermia + '\'' +
                '}';
    }
}
