import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

import javax.lang.model.util.ElementScanner14;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Convertidor {
    public static void main(String [] args) {
        Object [] options = {"Conversor de Divisas", "Conversor de Temperatura", "Salir"};
        int elige = JOptionPane.showOptionDialog(null, "¿Que funcfion te gustaria utilizar?", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    
        if (elige == 2){
            JOptionPane.showMessageDialog(null, "Programa finalizado."); 
            System.exit(0);
        }
        if(elige == 0){
            DecimalFormat formatearDivisa = new DecimalFormat( "#.##");
            boolean continuarPrograma = true;

            while (continuarPrograma){
                String [] opciones = {"Pesos Argentinos a Dolares", "Pesos Argentinos a Euros","Pesos Argentinos a Pesos Colombianos","Pesos Argentinos a Yenes",};
                String cambio = (String) JOptionPane.showInputDialog(null,"Elija una opcion de cambio", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]);

                if(cambio != null){

                      String input = JOptionPane.showInputDialog(null, "Ingrese una cantidad de dinero" );
                      
                      double pesos = 0;

                try{
                    pesos = Double.parseDouble(input);
                }catch(NumberFormatException e ){
                    JOptionPane.showMessageDialog(null, "Valor no permitido, el programa finalizara");break;                    
                }
                   
                if(cambio.equals("Pesos Argentinos a Dolares")){
                    double dolares = pesos / 390;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Argentinos equivalen a " + formatearDivisa.format(dolares) + " Dolares.");
                }
                else if(cambio.equals("Pesos Argentinos a Euros")){
                    double euros = pesos / 414;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Argentinos equivalen a " + formatearDivisa.format(euros) + " Euros.");
                }
                else if(cambio.equals("Pesos Argentinos a Pesos Colombianos")){
                    double pesosColombianos = pesos / 22.54;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Argentinos equivalen a " + formatearDivisa.format(pesosColombianos) + " Pesos Colombianos.");
                }
                else if(cambio.equals("Pesos Argentinos a Yenes")){
                    double yen = pesos / 159;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Argentinos equivalen a " + formatearDivisa.format(yen) + " Yenes.");
                }else{continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa terminado");}
                }
             

                int confirma = JOptionPane.showConfirmDialog(null,"¿ Desea realizar alguna otra conversion ?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);

                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                }

            }
        }   
        if(elige == 1){
            DecimalFormat formatearDivisa = new DecimalFormat( "#.##");
            boolean continuarPrograma = true;

            while (continuarPrograma){
                String [] opciones = {"Grados Celsius a Grados Fahrenheit", "Grados Fahrenheit a Grados Celsius",};
                String cambio = (String) JOptionPane.showInputDialog(null,"Elija una opcion de cambio", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]);

                if(cambio != null){

                String input = JOptionPane.showInputDialog(null, "Ingrese un valor de temperatura");
                double grados = 0;

                try{
                    grados = Double.parseDouble(input);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor no permitido, el programa finalizara.");break;
                }

                if(cambio.equals("Grados Celsius a Grados Fahrenheit")){
                    double fahrenheit = (grados * 9/5) + 32;
                    JOptionPane.showMessageDialog(null, grados + " Grados Celsius equivalen a " + formatearDivisa.format(fahrenheit) + " Grados Fahrenheit.");
                }
                else if(cambio.equals("Grados Fahrenheit a Grados Celsius")){
                    double celcius = (grados - 32) * 5/9;
                    JOptionPane.showMessageDialog(null, grados + " Grados Fahrenheit equivalen a " + formatearDivisa.format(celcius) + " Grados Celsius.");
                }
                }

                int confirma = JOptionPane.showConfirmDialog(null,"¿ Desea realizar alguna otra conversion ?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);

                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                }

            }
    }
}
}

