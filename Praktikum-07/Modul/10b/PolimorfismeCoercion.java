public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }

    public static void main(String[] args) {
        Integer bilangan = 10;

        int hasilKuadrat = kuadrat(bilangan);

        System.out.println("Hasil kuadrat " + bilangan + " adalah "+ hasilKuadrat);
    }
}
