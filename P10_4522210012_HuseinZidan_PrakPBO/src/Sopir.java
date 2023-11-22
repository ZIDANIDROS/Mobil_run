class Sopir {
    private String nama;
    private Mobil mobil;

    public Sopir(String nama, Mobil mobil) {
        this.nama = nama;
        this.mobil = mobil;
    }

    public void mengemudi(String tujuan) {
        System.out.println("Sopir " + nama + " mengemudikan mobil menuju " + tujuan);
    }
}