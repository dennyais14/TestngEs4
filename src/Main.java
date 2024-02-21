import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console
public class Main {
    public static void main(String[] args) {
        String date1 = "2023-03-01T13:00:00Z";
        OffsetDateTime data1 = OffsetDateTime.parse(date1);
        String anno = data1.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println(anno);
        String mese = data1.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println(mese);
        String giorno = data1.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println(giorno);
        String giornoSettimana = String.valueOf(data1.getDayOfWeek());
        System.out.println(giornoSettimana);
    }


    public int trovaAnno (OffsetDateTime data1){
        return data1.getYear();
    }

    public DayOfWeek trovaGiornoDellaSettimana (OffsetDateTime data1){
        return data1.getDayOfWeek();
    }
}