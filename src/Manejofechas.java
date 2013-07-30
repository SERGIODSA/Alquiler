import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Manejofechas {
    Boolean bandera;
    int dia;
    int mes;
    int ano;
    long diferencia;
    String desgloce[];
    String fecha;
    Calendar c;
    SimpleDateFormat fechas;
    public Manejofechas(){
        bandera = false;
        c = Calendar.getInstance();
    }
    public Boolean formato(String fecha){
        bandera = false;
        desgloce = fecha.split("-");
        dia = Integer.parseInt(desgloce[2]);
        mes = Integer.parseInt(desgloce[1]);
        ano = Integer.parseInt(desgloce[0]);
        if(((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12))&&(dia>31))
            bandera=true;
        if((mes==2)&&((ano%4)==0)&&(dia>29))
            bandera=true;
        if((mes==2)&&((ano%4)!=0)&&(dia>28))
            bandera=true;
        if(((mes==4)||(mes==6)||(mes==9)||(mes==11))&&(dia>30))
            bandera=true;
        return bandera;
    }
    public String fecha(){
        mes = (c.get(Calendar.MONTH))+1;
        ano = c.get(Calendar.YEAR);
        dia = c.get(Calendar.DATE);
        String diaa = Integer.toString(dia);
        String mess = Integer.toString(mes);
        String anoo = Integer.toString(ano);
        if(diaa.length()==1)
            diaa="0"+diaa;
        if(mess.length()==1)
            mess="0"+mess;
        fecha=diaa+"-"+mess+"-"+anoo;
        return fecha;
    }
    public long dias(String fechas1,String fechas2) throws ParseException{
        final long MILLSECS_PER_DAY = 24*60*60*1000; //Milisegundos al día 
        fechas = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaa1 = fechas.parse(fechas1);
        Date fechaa2 = fechas.parse(fechas2);
        diferencia = (fechaa2.getTime()-fechaa1.getTime())/MILLSECS_PER_DAY;
        return diferencia;
    }
}
