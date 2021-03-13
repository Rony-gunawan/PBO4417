public class TestSepeda {
	
    public static void main(String[] args) {
		
        Sepeda sepeda_1 = new Sepeda();
        sepeda_1.setmerk("Samsung");
        sepeda_1.setwarna("Merah Putih");

        System.out.println("Merk Sepeda : " + sepeda_1.merk);
        System.out.println("Warna Sepeda : " + sepeda_1.warna);
			
        sepeda_1.speedUp(10, 2);
        System.out.println("Kecepatan sepeda bertambah cepat " + sepeda_1.kecepatan + " M/s");

        sepeda_1.speedDown(10, 2);
        System.out.println("Kecepatan sepeda bertambah lambat " + sepeda_1.kecepatan + " M/s");

    }
}

class Sepeda {
	
    public String merk;
    public String warna;
    public int kecepatan;

    public Sepeda(){
        kecepatan = 0;
    }

    public void setmerk(String newmerk){
        merk = newmerk;
    }

    public void setwarna(String newwarna){
        warna = newwarna;
    }

    public String getmerk(){
        return merk;
    }

    public String getwarna(){
        return warna;
    }

    public void speedUp(int percepatan, int waktu){
        kecepatan = kecepatan + (percepatan * waktu);
    }

    public void speedDown(int perlambatan, int waktu){
        kecepatan = kecepatan - (perlambatan * waktu);
    }

    public int cekKecepatan(){
        return kecepatan;
    }
}