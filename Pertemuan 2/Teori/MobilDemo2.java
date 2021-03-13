package MobilDemo2;

public class MobilDemo2 {

    public static void main(String[] args) throws InterruptedException {
        MobilDemo mMobilDemo = new MobilDemo();
        mMobilDemo.setColor("Merah");
        mMobilDemo.setProduction(2015);
        mMobilDemo.startMobilDemo();
        mMobilDemo.setTransmision();
        mMobilDemo.setTransmision();
        mMobilDemo.setTransmision();
        mMobilDemo.setTransmision();
        mMobilDemo.setTransmision();

        System.out.println("Warna Mobil   : "+mMobilDemo.getColor());
        System.out.println("Produksi Tahun  : "+mMobilDemo.getProduction());
        System.out.println("Status Mobil  : "+mMobilDemo.getStatusMobilDemo());
        mMobilDemo.getTransmision();
        System.out.println("Mematikan Mesin");
        mMobilDemo.turnOffMobilDemo();
    }
    
}
