public class Main {
    public static void main(String[] args) {
        Mobil.Mesin mesinMobil = new Mobil.Mesin(4, 200);
        Mobil.Ban banMobil = new Mobil.Ban("Michelin", 18);
        Mobil.HeadUnit headUnitMobil = new Mobil.HeadUnit("Pioneer", 10);
        Mobil mobilHRV = new Mobil("HRV", mesinMobil, banMobil, headUnitMobil);
        Sopir sopirHusein = new Sopir("Husein Zidan", mobilHRV);

        mobilHRV.jalan();
        for (int i = 0; i < 4; i++) {
            banMobil.putar();
        }

        sopirHusein.mengemudi("Kota Malang Provinsi Jawa Timur");
    }
}