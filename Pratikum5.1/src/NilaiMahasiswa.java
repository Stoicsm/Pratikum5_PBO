public class NilaiMahasiswa {
    String NamaMahasiswa;
    int NPM, NilaiKehadiran, NilaiTugas, NilaiUTS, NilaiUAS;
    
    
    public NilaiMahasiswa(String NamaMahasiswa, int NPM, int NilaiKehadiran, int NilaiTugas, int NilaiUTS, int NilaiUAS){
        this.NamaMahasiswa = NamaMahasiswa;
        this.NPM = NPM;
        this.NilaiKehadiran = NilaiKehadiran;
        this.NilaiTugas = NilaiTugas;
        this.NilaiUTS = NilaiUTS;
        this.NilaiUAS = NilaiUAS;
    }
    public double NilaiAkhir(){
        return(0.10 * NilaiKehadiran) + (0.20 * NilaiTugas) + (0.30 * NilaiUTS) + (0.40 * NilaiUAS);
    }
    public String grade(double NilaiAkhir){
        if(NilaiAkhir >= 76 && NilaiAkhir <= 100){
            return "A";
        }else if(NilaiAkhir >= 66 && NilaiAkhir <= 75){
            return "B";
        }else if(NilaiAkhir >= 56 && NilaiAkhir <= 65){
            return "C";
        }else if(NilaiAkhir >= 46 && NilaiAkhir <= 45){
            return "D";
        }else{
            return "E";
        }
    }
    public String Keterangan(String grade){
        switch (grade){
            case "A":
                return "ISTIMEWA";
            case "B":
                return "BAIK";
            case "C":
                return "CUKUP";
            case "D":
                return "KURANG";
            case "E":
                return "KURANG SEKALI";
            default:
                return "";
        }
    }
     public int getNPM(){
        return NPM;
    }
    public String getNama(){
        return NamaMahasiswa;       
    }
}