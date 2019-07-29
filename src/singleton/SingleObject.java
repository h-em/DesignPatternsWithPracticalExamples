package singleton;

import javax.sound.midi.Soundbank;

public class SingleObject {
    //avem un membru privat de tipul clasei
    private static SingleObject insance;

    //constructorul este privat pentru a nu putea fi accesat din exterior
    private SingleObject(){}

    //metoda publica statica ce returneaza instanta. In caz ca este nula se instantiaza
    public static SingleObject getInstance(){
        if(insance == null) {
            insance = new SingleObject();
            return insance;
        }else return insance;
    }

    public void display(){
        System.out.println("Singleton!");
    }
}
