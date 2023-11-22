class Mobil {
    private String nama;
    private Mesin mesin;
    private Ban ban;
    private HeadUnit headUnit;

    public Mobil(String nama, Mesin mesin, Ban ban, HeadUnit headUnit) {
        this.nama = nama;
        this.mesin = mesin;
        this.ban = ban;
        this.headUnit = headUnit;
    }

    public void jalan() {
        System.out.println("Mesin hidup!");
        ban.putar();
    }

    public void putarMusik() {
        headUnit.putarMusik();
    }

    // Nested class Mesin
    public static class Mesin {
        private int silinder;
        private int tenagaKuda;

        public Mesin(int silinder, int tenagaKuda) {
            this.silinder = silinder;
            this.tenagaKuda = tenagaKuda;
        }

        public void hidupkan() {
            System.out.println("Mesin dinyalakan.");
        }
    }

    // Nested class Ban
    public static class Ban {
        private String merek;
        private int ukuran;

        public Ban(String merek, int ukuran) {
            this.merek = merek;
            this.ukuran = ukuran;
        }

        public void putar() {
            System.out.println("Ban berputar!");
        }
    }

    // Nested class HeadUnit
    public static class HeadUnit {
        private String merek;
        private int ukuranLayar;

        public HeadUnit(String merek, int ukuranLayar) {
            this.merek = merek;
            this.ukuranLayar = ukuranLayar;
        }

        public void putarMusik() {
            System.out.println("Memutar musik di head unit.");
        }
    }
}
