import java.time.LocalDate;
import java.util.Objects;

public class Pacjent {
    private String imie;
    private String nazwisko;
    private LocalDate data_przyjecia;
    private String choroba;

    public Pacjent(String imie, String nazwisko,String choroba) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_przyjecia = LocalDate.now();
        this.choroba = choroba;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getData_przyjecia() {
        return data_przyjecia;
    }

    public String getChoroba() {
        return choroba;
    }

    @Override
    public String toString() {
        return "Imie pacjenta: " + imie + "\n"+"Nazwisko pacjenta: " + nazwisko + "\n" + "Data przyjecia: " +data_przyjecia + "\n"+"Choroba: " +choroba;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacjent pacjent = (Pacjent) o;
        return Objects.equals(imie, pacjent.imie) && Objects.equals(nazwisko, pacjent.nazwisko) && Objects.equals(data_przyjecia, pacjent.data_przyjecia) && Objects.equals(choroba, pacjent.choroba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, data_przyjecia, choroba);
    }

}
