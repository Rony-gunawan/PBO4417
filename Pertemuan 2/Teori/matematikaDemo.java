public class matematikaDemo{
    public static void main(String[] args) {
        matematika operator = new matematika();
    
        operator.setAngka(20, 20);
        System.out.println("Perhitungan hasil pertambahan : " + operator.angka_x + " + " + operator.angka_y + " = " + operator.pertambahan());

        operator.setAngka(10, 5);
        System.out.println("Perhitungan hasil pengurangan : " + operator.angka_x + " - " + operator.angka_y + " = "  + operator.pengurangan());

        operator.setAngka(10, 20);
        System.out.println("Perhitungan hasil perkalian : " + operator.angka_x + " x " + operator.angka_y + " = "  + operator.perkalian());

        operator.setAngka(20, 2);
        System.out.println("Perhitungan hasil pembagian : " + operator.angka_x + " / " + operator.angka_y + " = "  + operator.pembagian());
    }
}

class matematika {
    public int angka_x;
    public int angka_y;

    public matematika(){

    }

    public void setAngka(int angka_pertama, int angka_kedua){
        angka_x = angka_pertama;
        angka_y = angka_kedua;
    }

    public int pertambahan(){
        return angka_x + angka_y;
    }

    public int pengurangan(){
        return angka_x - angka_y;
    }

    public int perkalian(){
        return angka_x * angka_y;
    }

    public int pembagian(){
        return angka_x / angka_y;
    }
}