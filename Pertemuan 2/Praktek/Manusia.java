class Manusia {
    private String nama;
    private boolean punyaTV;

    public Manusia() {
        nama = "noname";
        punyaTV = false;
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String namaku(){
        return nama;
    }

    public void beli() {
        punyaTV = true;
    }

    public void jualtv() {
        punyaTV = false;
    }

    public boolean check(){
        return punyaTV;
    }
}