public class Dato {
    private String STATION;
    private String NAME;
    private String DATE;
    private double PRCP;
    private double TAVG;
    private double TMAX;
    private double TMIN;

    public Dato(String linea){
        String acum=linea.replaceAll("\"", "");
        this.STATION=acum.substring(0,acum.indexOf(',')).replaceAll(",","");
        acum=acum.substring(acum.indexOf(',')+1);
        this.NAME=acum.substring(0,acum.indexOf(',',acum.indexOf(',')+1)).replaceAll(",","");
        acum=acum.substring(acum.indexOf(',',acum.indexOf(',')+1)+1);
        this.DATE=acum.substring(0,acum.indexOf(',')).replaceAll("\"", "").replaceAll(",","");
        acum=acum.substring(acum.indexOf(',')+1);
        if(acum.substring(0,acum.indexOf(',')).replaceAll(",","").length()<1){ this.PRCP=0; }
        else{ this.PRCP=Double.parseDouble(acum.substring(0,acum.indexOf(',')).replaceAll(",","")); }
        acum=acum.substring(acum.indexOf(',')+1);
        if(acum.substring(0,acum.indexOf(',')).replaceAll(",","").length()<1){ this.TAVG=0; }
        else{ this.TAVG=Double.parseDouble(acum.substring(0,acum.indexOf(',')).replaceAll(",","")); }
        acum=acum.substring(acum.indexOf(',')+1);
        if(acum.substring(0,acum.indexOf(',')).replaceAll(",","").length()<1){ this.TMAX=0; }
        else{ this.TMAX=Double.parseDouble(acum.substring(0,acum.indexOf(',')).replaceAll(",","")); }
        acum=acum.substring(acum.indexOf(',')+1);
        if(acum.replaceAll("\"", "").replaceAll(",","").length()<1){ this.TMIN=0; }
        else{ this.TMIN=Double.parseDouble(acum.replaceAll("\"", "").replaceAll(",","")); }
    }

    public String getSTATION() {
        return STATION;
    }

    public String getNAME() {
        return NAME;
    }

    public String getDATE() {
        return DATE;
    }

    public double getPRCP() {
        return PRCP;
    }

    public double getTAVG() {
        return TAVG;
    }

    public double getTMAX() {
        return TMAX;
    }

    public double getTMIN() {
        return TMIN;
    }

    public void setSTATION(String STATION) {
        this.STATION = STATION;
    }

    public void setNAME(String NAME) { this.NAME = NAME; }

    public void setDATE(String DATE) { this.DATE = DATE; }

    public void setPRCP(double PRCP) { this.PRCP = PRCP; }

    public void setTAVG(double TAVG) { this.TAVG = TAVG; }

    public void setTMAX(double TMAX) { this.TMAX = TMAX; }

    public void setTMIN(double TMIN) { this.TMIN = TMIN; }

    @Override
    public String toString() {
        return "Dato" +
                " STATION='" + STATION + '\'' +
                ", NAME='" + NAME + '\'' +
                ", DATE='" + DATE + '\'' +
                ", PRCP=" + PRCP +
                ", TAVG=" + TAVG +
                ", TMAX=" + TMAX +
                ", TMIN=" + TMIN ;
    }
}
