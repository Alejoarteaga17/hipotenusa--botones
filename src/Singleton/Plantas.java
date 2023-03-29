package Singleton;

public class Plantas {
    private static Plantas plantas;

    public int getHojas() {
        return hojas;
    }
    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    int hojas;
    private Plantas(){}
    public static Plantas getInstance(){
        if(plantas== null){
            plantas= new Plantas();
        } else {
            System.out.println("ya tienes plantas arriba");
        }
    return plantas;}
}
