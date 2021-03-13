package MobilDemo2;

import java.util.concurrent.TimeUnit;

public class MobilDemo {
    private String color;
    private int productionYear;
    private boolean power;
    private int transmision;
    MobilDemo(){
        //set warna default
        this.color = "Putih";
        this.power = false;
        this.transmision = 0;
    }
    
    public boolean startMobilDemo(){
       return this.power = true;
    }
    public void turnOffMobilDemo() throws InterruptedException{
        this.power = false;
        for (int j = this.transmision; j>= 1; j--) {
            //add delay
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Transmision : "+j);
        }
        System.out.println("Status  : "+this.power);
        
    }
    public void setTransmision(){
        this.transmision +=1;
    }
    public void getTransmision() throws InterruptedException{
        for (int i = 1; i <= this.transmision; i++) {
            //add delay
            TimeUnit.SECONDS.sleep(1);
            if(i == 1){
                System.out.println("Transmision : "+i);
            }else{
               System.out.println("Transmision : "+i);  
            }
           
        }
    }
    public boolean getStatusMobilDemo(){
        return this.power;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public int setProduction(int production){
        return this.productionYear = production;
    }
    public int getProduction(){
        return this.productionYear;
    }
}
