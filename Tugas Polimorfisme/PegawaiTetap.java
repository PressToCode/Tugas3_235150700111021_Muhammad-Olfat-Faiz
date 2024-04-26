public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap() {
        super();
    }

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    // * Polimorphism
    public double gaji() {
        return getUpah();
    }
}
