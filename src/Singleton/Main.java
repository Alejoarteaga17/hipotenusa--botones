package Singleton;

public class Main {
    public static void main(String[] args) {
        Plantas plantas1= Plantas.getInstance();
        plantas1.setHojas(57);
        System.out.println("hojas de la planta 1 : "+ plantas1.getHojas()+
                ", La memoria está en: "+ plantas1);
        Plantas plantas2= Plantas.getInstance();
        plantas2.setHojas(100);
        System.out.println("hojas de la planta 2: "+
                plantas1.getHojas()+", la memoria esta en: "+ plantas2);
    }



}
