public class Titik{
    //Atribut
    double absis;
    double ordinat;
    static int counterTitik;

    //Konstruktor
    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }

    //Mutator
    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    //Selektor
    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }
}