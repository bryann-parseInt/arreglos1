import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la cantidad de estudiantes:");
        int cantidadEstudiantes = Integer.parseInt(br.readLine());
        String[] arregloCadenas = new String[cantidadEstudiantes];

        for (int i = 0; i < arregloCadenas.length; i++) {
            System.out.print("Ingresa el nombre del estudiante:");
            String value = br.readLine();
            GuardarValor(arregloCadenas, i, value);

            System.out.println("Ingresa las 4 notas del estudiante");
            int[] notas = new int[4];
            for (int j = 0; j < notas.length; j++) {
                int nota = Integer.parseInt(br.readLine());
                notas[j] = nota;
            }
            ImprimirObjetos(notas);
            int promedio = CalcularPromedio(notas);
            System.out.println("El promedio de notas del estuiante es:" + promedio);
            int notaMasAlta = CalcularNotaMasAlta(notas);
            System.out.println("La nota mas alta es:" + notaMasAlta);
            int notaMasBaja = CalcularNotaMasBaja(notas);
            System.out.println("La nota mas baja es:" + notaMasBaja);
        }

        ImprimirObjetos(arregloCadenas);
    }

    private static int CalcularPromedio(int[] notas) {
        int sumaTotal = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaTotal += notas[i];
        }
        return sumaTotal / notas.length;
    }
    private static int CalcularNotaMasAlta(int[] notas){
        int notamasalta = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > notamasalta){
                notamasalta = notas[i];
            }

        }
        return notamasalta;
    }
    private static int CalcularNotaMasBaja(int[] notas){
        int notamasbaja = notas[0];
        for (int j = 0; j < notas.length; j++) {
            if(notas[j] < notamasbaja){
                notamasbaja = notas[j];
            }
        }
        return notamasbaja;
    }
    private static void GuardarValor(String[] arreglo, int position, String value) {
        if (arreglo.length <= position) return;
        arreglo[position] = value;
    }

    private static void ImprimirObjetos(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    private static void ImprimirObjetos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}