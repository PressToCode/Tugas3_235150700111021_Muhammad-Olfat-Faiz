public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    // * Polimorphism
    public double gaji() {
        // * Jika total jam dibawah 40
        if(getTotalJam() <= 40) {
            return (getUpahPerJam()*getTotalJam());
        }

        // * Jika total jam diatas 40
        return ((getUpahPerJam()*40)+(getUpahPerJam()*(getTotalJam()-40)*1.5));
    }
}
