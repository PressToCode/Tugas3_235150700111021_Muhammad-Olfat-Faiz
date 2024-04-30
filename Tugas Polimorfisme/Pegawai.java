// * Class Abstract
public abstract class Pegawai {
    private String name;
    private String noKTP;

    public Pegawai() {}

    public Pegawai(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }

    public String getName(){
        return name;
    }

    public String getNoKTP(){
        return noKTP;
    }

    public String toString(){
        return String.format(getName()+"\nNo. KTP\t\t: "+getNoKTP());
    }
    
    // * Polimorphism
    public abstract double gaji();
}
