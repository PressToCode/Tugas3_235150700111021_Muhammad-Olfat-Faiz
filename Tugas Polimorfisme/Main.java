public class Main {
    public static void main(String[] args) throws Exception {
        // * 3 Object Pegawai Tetap
        PegawaiTetap[] pegawaiTetap = new PegawaiTetap[3];
        pegawaiTetap[0] = new PegawaiTetap("Muhammad Olfat Faiz", "123456789123456", 100000);
        pegawaiTetap[1] = new PegawaiTetap("Mahmud Pangestu"    , "234567891234567", 200000);
        pegawaiTetap[2] = new PegawaiTetap("Firman Gunarto"     , "345678912345678", 550000);

        // * 3 Object Pegawai Harian
        PegawaiHarian[] pegawaiHarian = new PegawaiHarian[3];
        pegawaiHarian[0] = new PegawaiHarian("Darman Thamrin"   , "456789123456789", 100000, 35);
        pegawaiHarian[1] = new PegawaiHarian("Purwa Sitompul"   , "567891234567891", 25000, 45);
        pegawaiHarian[2] = new PegawaiHarian("Mursita Budiman"  , "678912345678912", 50000, 40);

        // * 3 Object Sales
        Sales[] sales = new Sales[3];
        sales[0] = new Sales("Legawa Najmudin", "789123456789123", 60, 25000);
        sales[1] = new Sales("Yoga Prayoga", "891234567891234", 45, 20000);
        sales[2] = new Sales("Asweni Maheswara", "912345678912345", 10, 50000);

        // * Output Pegawai Tetap
        System.out.println("====" + "- Pegawai Tetap -" + "====");

        for(int i = 0; i < pegawaiTetap.length; i++) {
            System.out.println("Pegawai Tetap\t: " + pegawaiTetap[i].getName());
            System.out.println("No. KTP\t\t: " + pegawaiTetap[i].getNoKTP());
            System.out.println("Upah\t\t: " + pegawaiTetap[i].getUpah());
            System.out.println("Pendapatan\t: Rp " + pegawaiTetap[i].gaji());

            if(i != pegawaiTetap.length-1) {
                System.out.println();
            }
        }

        System.out.println("====" + "----" + "====" + "----" + "====\n");

        // * Output Pegawai Harian
        System.out.println("====" + "- Pegawai Harian -" + "====");
    
        for(int i = 0; i < pegawaiHarian.length; i++) {
            System.out.println("Pegawai Harian\t: " + pegawaiHarian[i].getName());
            System.out.println("No. KTP\t\t: " + pegawaiHarian[i].getNoKTP());
            System.out.println("Upah/jam\t: " + pegawaiHarian[i].getUpahPerJam());
            System.out.println("Total Jam Kerja\t: " + pegawaiHarian[i].getTotalJam());
            System.out.println("Pendapatan\t: Rp " + pegawaiHarian[i].gaji());
    
            if(i != pegawaiTetap.length-1) {
                System.out.println();
            }
        }
    
        System.out.println("====" + "----" + "====" + "----" + "====\n");

        // * Output Sales
        System.out.println("====" + "- Sales -" + "====");
    
        for(int i = 0; i < sales.length; i++) {
            System.out.println("Sales\t: " + sales[i].getName());
            System.out.println("No. KTP\t\t: " + sales[i].getNoKTP());
            System.out.println("Total Penjualan\t: " + sales[i].getPenjualan());
            System.out.println("Besaran Komisi\t: " + sales[i].getKomisi());
            System.out.println("Pendapatan\t: Rp " + sales[i].gaji());
    
            if(i != pegawaiTetap.length-1) {
                System.out.println();
            }
        }
    
        System.out.println("====" + "----" + "====" + "----" + "====\n");
    }
}
