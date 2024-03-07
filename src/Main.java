
public class Main {
    public static void main(String[] args) {
        Choroba glupota = new Choroba("Głupota",1);
        Choroba lenistwo = new Choroba("Lenistwo",5);
        System.out.println("------ CHOROBY ------");
        System.out.println(glupota);
        System.out.println("----------------------");
        System.out.println(lenistwo);
        System.out.println("------ PACJENCI ------");
        Pacjent pacjent1 = new Pacjent("Marek","Markowski","Lenistwo");
        Pacjent pacjent2 = new Pacjent("Kajetan","Kawka","Głupota");
        System.out.println(pacjent1);
        System.out.println("----------------------");
        System.out.println(pacjent2);
        System.out.println("------ LEKARZE ------");
        Lekarz lekarz = new Lekarz("Dominik","Jarkowski");
        System.out.println("LISTA PACJENTOW DOMINIKA JARKOWSKIEGO " + "\n");
        lekarz.dodajPacjenta(pacjent2);
        System.out.println(lekarz.getLista_leczonych_pacjentow());
    }
}