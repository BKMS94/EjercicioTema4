public class Main {
    public static void main(String[] args) {
        int numeroif = 5;
        if (numeroif > 0) {
            System.out.println("POSITIVO");
        } else if (numeroif == 0) {
            System.out.println("0");
        } else {
            System.out.println("NEGATIVO");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }

        int numeroDoWile = 3;
        do{
            System.out.println(numeroDoWile);
            numeroDoWile ++;
        }
        while (numeroDoWile < 3);

        int numeroFor =0;
        for (int i = 0; i <= 3; i++ ){
            System.out.println(numeroFor++);
        }

        String estacion = "verano";

        switch (estacion){

            case "verano":
                System.out.println("Verano");
                break;
            case "otoño":
                System.out.println("Otoño");
                break;
            case "invierno":
                System.out.println("Invierno");
                break;
            case "primavera":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}