public class TestTV {
	
    public static void main(String[] args) {
		
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);


        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("TV 1 channel : " + tv1.channel + " volume tv 1 :" + tv1.volume);
        System.out.println("TV 2 channel : " + tv2.channel + " volume tv 2 : " + tv2.volume);



        Manusia man1 = new Manusia("Rony Gunawan");
        System.out.println(man1.namaku());
		
        Manusia tvku = new Manusia();
        man1.beli();
		
        System.out.println(man1.check());
        man1.jualtv();
        System.out.println(man1.check());
    }
}

