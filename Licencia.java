public class Licencia {
 public static void main(String[] args) {
    int edad = 22;
    String tieneLicencia = "si";
    if (edad >22 && tieneLicencia == "si"){
        System.out.println("puede conducir");
    }
    if (edad <18 && tieneLicencia == "no"){
        System.out.println("no puede conducir");
    }
 }
}