import java.util.Scanner;

public class Principal{
    public static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
        System.out.println("Porfavor ingrese la direccion del archivo");
        String path= t.next();
        MarcoDeDatos base = new MarcoDeDatos(path);
        System.out.println("que desea hacer");
        System.out.println("");
        opciones();
        while(true){
            int option=t.nextInt();
            if(option==0){
                System.out.println("Fin del programa");
                break;
            }
            switch (option){
                case 1:
                    System.out.println("a que le quiere sacar el valor maximo");
                    datas();
                    option=t.nextInt();
                    switch (option){
                        case 1:
                            System.out.println(base.precipitacionMaxima());
                            break;
                        case 2:
                            System.out.println(base.temperaturaMaxima());
                            break;
                        case 3:
                            System.out.println(base.temperaturaMaximaMaxima());
                            break;
                        case 4:
                            System.out.println(base.temperaturaMinimaMaxima());
                    }
                    break;
                case 2:
                    System.out.println("a que le quiere sacar el valor minimo");
                    datas();
                    option=t.nextInt();
                    switch (option){
                        case 1:
                            System.out.println(base.precipitacionMinima());
                            break;
                        case 2:
                            System.out.println(base.temperaturaMinima());
                            break;
                        case 3:
                            System.out.println(base.temperaturaMinimaMinima());
                            break;
                        case 4:
                            System.out.println(base.temperaturaMaximaMinima());
                    }
                    break;
                case 3:
                    System.out.println("a que le quiere sacar el promedio");
                    datas();
                    option=t.nextInt();
                    switch (option){
                        case 1:
                            System.out.println(base.precipitacionPromedio());
                            break;
                        case 2:
                            System.out.println(base.temperaturaPromedio());
                            break;
                        case 3:
                            System.out.println(base.temperaturaMinimaPromedio());
                            break;
                        case 4:
                            System.out.println(base.temperaturaMaximaPromedio());
                    }
                    break;

                case 4:
                    System.out.println("a que le quiere sacar la desviacion estandar");
                    datas();
                    option=t.nextInt();
                    switch (option){
                        case 1:
                            System.out.println(base.desviacionEstandarPrecipitacion());
                            break;
                        case 2:
                            System.out.println(base.desviacionEstandarTemp());
                            break;
                        case 3:
                            System.out.println(base.desviacionEstandartempMin());
                            break;
                        case 4:
                            System.out.println(base.desviacionEstandartempMax());
                    }
                    break;
                case 5:
                    System.out.println("como quieres ordenar el dataframe (menor que)");
                    datas();
                    option=t.nextInt();
                    switch (option){
                        case 1:
                            base.menorqueprecip();
                            break;
                        case 2:
                            base.menorquetemp();
                            break;
                        case 3:
                            base.menorquetempmax();
                            break;
                        case 4:
                            base.menorquetempmin();
                    }
                    break;
                case 6:
                    for(int i =0;i<base.getDatos().size();i++){
                        System.out.println(base.getDatos().get(i).toString());
                    }
            }
        }
    }

    public static void Menu(){
        System.out.println("Esto es un programa para sacar datos estádisticos referentes al clima de un dataframe");
        System.out.println("Este programa fue elaborado por: Jose Manuel Sanchez, Jose Alejandro Duque y Juan Alberto Rodriguez");
        System.out.println("");
    }

    public static void opciones(){
        System.out.println("terminar programa: 0");
        System.out.println("sacar maximos: 1");
        System.out.println("sacar minimos: 2");
        System.out.println("sacar promedio: 3");
        System.out.println("sacar desviacion estandar: 4");
        System.out.println("ordenar dataframe: 5");
        System.out.println("mostrar dataframe: 6");
    }
    public static void datas(){
        System.out.println("Precipitacion: 1");
        System.out.println("temperatura media: 2");
        System.out.println("temperatura maxima: 3");
        System.out.println("temperatura minima: 4");
    }
}
