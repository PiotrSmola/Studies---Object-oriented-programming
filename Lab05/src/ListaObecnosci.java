import java.sql.*;

public class ListaObecnosci {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:lista_obecnosci.db";
        return DriverManager.getConnection(url);
    }
    public static void stworzTabele() {
        String sql = "CREATE TABLE IF NOT EXISTS obecnosc (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "prowadzacy TEXT," +
                "nazwa_przedmiotu TEXT," +
                "imie_i_nazwisko TEXT," +
                "nr_albumu TEXT," +
                "data DATE," +
                "czas_zalogowania TIME," +
                "czas_wylogowania TIME," +
                "dlugosc_sesji INTEGER)";
        try (Connection polacz = getConnection();
             Statement stmt = polacz.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela z listą obecności została utworzona");
        } catch (SQLException e) {
            System.out.println("Wystąpił błąd podczas tworzenia tabeli z listą obecności: " + e.getMessage());
        }
    }
    
    public static void dodajObecnosc(String prowadzacy, String przedmiot, String imieNazwisko,
                                     String nrAlbumu, Date data, Time czasZalogowania,
                                     Time czasWylogowania, int dlugoscSesji) {
        String sql = "INSERT INTO obecnosc (prowadzacy, nazwa_przedmiotu, imie_i_nazwisko, nr_albumu, data, czas_zalogowania, czas_wylogowania, dlugosc_sesji) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection polacz = getConnection();
             PreparedStatement pstmt = polacz.prepareStatement(sql)) {
            pstmt.setString(1, prowadzacy);
            pstmt.setString(2, przedmiot);
            pstmt.setString(3, imieNazwisko);
            pstmt.setString(4, nrAlbumu);
            pstmt.setDate(5, data);
            pstmt.setTime(6, czasZalogowania);
            pstmt.setTime(7, czasWylogowania);
            pstmt.setInt(8, dlugoscSesji);
            pstmt.executeUpdate();
            System.out.println("Obecność studenta została dodana do listy");
        } catch (SQLException e) {
            System.out.println("Wystąpił błąd podczas dodawania obecności studenta: " + e.getMessage());
        }
    }
public static void wyswietlWszystkieObecnosci() {
        String sql = "SELECT * FROM obecnosc";
        try (Connection polacz = getConnection();
             Statement stmt = polacz.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String prowadzacy = rs.getString("prowadzacy");
                String przedmiot = rs.getString("nazwa_przedmiotu");
                String imieNazwisko = rs.getString("imie_i_nazwisko");
                String nrAlbumu = rs.getString("nr_albumu");
                Date data = rs.getDate("data");
                Time czasZalogowania = rs.getTime("czas_zalogowania");
                Time czasWylogowania = rs.getTime("czas_wylogowania");
                int dlugoscSesji = rs.getInt("dlugosc_sesji");

                System.out.println("ID: " + id);
                System.out.println("Prowadzący: " + prowadzacy);
                System.out.println("Przedmiot: " + przedmiot);
                System.out.println("Imię i nazwisko studenta: " + imieNazwisko);
                System.out.println("Numer albumu: " + nrAlbumu);
                System.out.println("Data zajęć: " + data);
                System.out.println("Czas zalogowania: " + czasZalogowania);
                System.out.println("Czas wylogowania: " + czasWylogowania);
                System.out.println("Długość czasu spędzonego na sesji: " + dlugoscSesji);
                System.out.println("-----------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Wystąpił błąd podczas wyświetlania obecności: " + e.getMessage());
        }
    }
    
        public static void main(String[] args) {
        stworzTabele();

        // Dodawanie przykładowych obecności
        dodajObecnosc("Jan Kowalski", "matematyka", "Wiktoria Podsiadło", "123456",
                Date.valueOf("2023-05-10"), Time.valueOf("09:00:00"),
                Time.valueOf("10:30:00"), 90);
        dodajObecnosc("Kamil Zagórski", "język angielski", "Matylda Pociecha", "789012",
                Date.valueOf("2023-05-10"), Time.valueOf("09:01:00"),
                Time.valueOf("10:29:00"), 88);
        dodajObecnosc("Zdzisław Ciosek", "informatyka", "Mateusz Gogola", "135790",
                Date.valueOf("2023-05-13"), Time.valueOf("09:01:00"),
                Time.valueOf("10:20:00"), 79);

        wyswietlWszystkieObecnosci();
    }
}
