import java.time.LocalDate;
import java.util.ArrayList;

public class Lekarz {
    private String imie;
    private String nazwisko;
    private ArrayList<Pacjent>lista_leczonych_pacjentow = new ArrayList<>();

    public Lekarz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Pacjent> getLista_leczonych_pacjentow() {
        return lista_leczonych_pacjentow;
    }

//    public void dodajPacjenta(String imie_pacjenta, String nazwisko_pacjenta, LocalDate data_przyjecia, String choroba_pacjenta){
//        Pacjent pacjent = new Pacjent(imie_pacjenta,nazwisko_pacjenta,choroba_pacjenta);
//        lista_leczonych_pacjentow.add(pacjent);
//    }

    public void dodajPacjenta(Pacjent pacjent1) {
        lista_leczonych_pacjentow.add(pacjent1);
    }
}
