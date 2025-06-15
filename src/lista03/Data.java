
package lista03;

import java.time.LocalDate;


public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        dataSO();
    }
    
    private void dataSO() {
        LocalDate hoje = LocalDate.now();
        dia = hoje.getDayOfMonth();
        mes = hoje.getMonthValue();
        ano = hoje.getYear();
    }

    public Data(int dia, int mes, int ano) {
        if(isData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else {
            System.out.println("Data invalida! Usando a data do SO.");
            dataSO();          
        }
    }
    
    public int comparaData(Data outra){
        //fazer em casa, não entendi bem
        return 0;
    }
    
    public String toString(){
        return dia +"/"+ mes+"/"+ano;
    }
    
    public void avancarData(){
        dia++;
        if(dia > diasMes(mes, ano)){
            dia = 1;
            mes++;
            if(mes>12){
                mes = 1;
                ano++;
            }
        }
    }
    
    public boolean isBissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    public int diasMes(int mes, int ano){
        int qtdDias;
        if((mes == 2)){
           if(isBissexto(ano)){ 
               qtdDias = 29;
           }else qtdDias = 28;
        }else if((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)){
            qtdDias = 30;
        }else qtdDias = 31;
        return qtdDias;
    }
    
    private boolean isData(int dia, int mes, int ano){
        boolean r = true;        
        if(((mes < 1) || (mes > 12)) && ((dia < 1) || (dia > 31))){
            r = false; 
        }else{            
            if(dia > diasMes(mes, ano)){
                r = false;
            }                
        }                
        return r;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
             
}
