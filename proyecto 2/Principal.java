import java.util.Scanner;

public class Principal{
    public static Scanner t = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
        System.out.println("Porfavor ingrese la direccion del archivo");
        String path= t.next();
        MarcoDeDatos base = new MarcoDeDatos(path);
        System.out.println("");
    }

    public static void Menu(){
        System.out.println("Esto es un programa para sacar datos estádisticos referentes al clima de un dataframe");
        System.out.println("Este programa fue elaborado por: Jose Manuel Sanchez, Jose Alejandro Duque y Juan Alberto Rodriguez");
        System.out.println("");
    }
}
