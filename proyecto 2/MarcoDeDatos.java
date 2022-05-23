import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class MarcoDeDatos {
    private ArrayList<Dato> Datos;

    MarcoDeDatos(String path){
        Datos = new ArrayList<>();
        File archivo = new File(path);
        Scanner lector;
        try{
            lector= new Scanner(archivo);
            lector.nextLine();
            String linea="";
            while(lector.hasNextLine()){
                linea = lector.nextLine();
                Dato d = new Dato(linea);
                Datos.add(d);
                System.out.println(d.toString());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String temperaturaMaxima(){
        Dato max = Datos.get(0);
        for(int i =0;i<Datos.size();i++) {
            if (Datos.get(i).getTMAX() != 0) {
                if (Datos.get(i).getTMAX() > max.getTMAX())
                    max = Datos.get(i);
            }
        }
        return max.toString();
    }

    public String temperaturaMinima(){
        Dato min = Datos.get(0);
        for(int i =1;i<Datos.size();i++) {
            if (Datos.get(i).getTMIN() != 0) {
                if (Datos.get(i).getTMIN() < min.getTMIN())
                    min = Datos.get(i);
            }
        }
        return min.toString();
    }

    public String precipitacionMinima(){
        Dato min = Datos.get(0);
        for(int i =1;i<Datos.size();i++){
            if(Datos.get(i).getTMIN()!=0) {
                if (Datos.get(i).getTMIN() < min.getTMIN())
                    min = Datos.get(i);
            }
        }
        return min.toString();
    }

    public String precipitacionMaxima(){
        Dato max = Datos.get(0);
        for(int i =0;i<Datos.size();i++) {
            if (Datos.get(i).getTMAX() != 0) {
                if (Datos.get(i).getTMAX() > max.getTMAX())
                    max = Datos.get(i);
            }
        }
        return max.toString();
    }

    public double temperaturaPromedio(){
        int prom= 0;
        int cont=0;
        for(int i =0;i<Datos.size();i++){
            prom+=Datos.get(i).getTAVG();
            if(Datos.get(i).getTAVG()==0)
                cont++;
        }
        return prom/(Datos.size()-cont);
    }

    public double temperaturaMaximaPromedio(){
        int prom= 0;
        int cont=0;
        for(int i =0;i<Datos.size();i++){
            prom+=Datos.get(i).getTMAX();
            if(Datos.get(i).getTAVG()==0)
                cont++;
        }
        return prom/(Datos.size()-cont);
    }

    public double temperaturaMinimaPromedio(){
        int prom= 0;
        for(int i =0;i<Datos.size();i++){
            prom+=Datos.get(i).getTMIN();
        }
        return prom/Datos.size();
    }

    public double precipitacionPromedio(){
        int prom= 0;
        for(int i =0;i<Datos.size();i++){
            prom+=Datos.get(i).getPRCP();
        }
        return prom/Datos.size();
    }

    public double desviacionEstandarTemp(){
        double tp = temperaturaPromedio();
        double acum=0;
        int cont=0;
        for(int i =0;i< Datos.size();i++){
            if(Datos.get(i).getTAVG()==0)
                cont++;
            acum+=Math.pow((Datos.get(i).getTAVG()-tp),2);
        }
        return Math.sqrt(acum/(Datos.size()-cont));
    }

    public double desviacionEstandartempMax(){
        double tp = temperaturaMaximaPromedio();
        double acum=0;
        int cont=0;
        for(int i =0;i< Datos.size();i++){
            if(Datos.get(i).getTMAX()==0)
                cont++;
            acum+=Math.pow((Datos.get(i).getTMAX()-tp),2);
        }
        return Math.sqrt(acum/(Datos.size()-cont));
    }

    public double desviacionEstandartempMin(){
        double tp = temperaturaMinimaPromedio();
        double acum=0;
        int cont=0;
        for(int i =0;i< Datos.size();i++){
            if(Datos.get(i).getTMIN()==0)
                cont++;
            acum+=Math.pow((Datos.get(i).getTMIN()-tp),2);
        }
        return Math.sqrt(acum/(Datos.size()-cont));
    }

    public double desviacionEstandarPrecipitacion(){
        double tp = temperaturaPromedio();
        double acum=0;
        int cont=0;
        for(int i =0;i< Datos.size();i++){
            if(Datos.get(i).getPRCP()==0)
                cont++;
            acum+=Math.pow((Datos.get(i).getPRCP()-tp),2);
        }
        return Math.sqrt(acum/(Datos.size()-cont));
    }
}