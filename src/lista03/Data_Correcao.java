import java.time.LocalDate;

public class Data_Correcao {

    public Data_Correcao(int par, int par1, int par2) {
    }
    private int dia;
    private int mes;
    private int ano;

    // Construtor que recebe os valores diretamente
    public Data_Correcao (int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Construtor que utiliza a data atual (único que usa LocalDate)
    public Data_Correcao() {
        LocalDate hoje = LocalDate.now();
        this.dia = hoje.getDayOfMonth();
        this.mes = hoje.getMonthValue();
        this.ano = hoje.getYear();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasNoMes() {
        return switch (mes) {
            case 2 -> isBissexto() ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    public void avancarDia() {
        dia++;
        if (dia > diasNoMes()) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                ano++;
            }
        }
    }
    
    // Método estático para comparar duas datas
    public static int comparar(Data_Correcao d1, Data_Correcao d2) {
        if (d1.ano != d2.ano)
            return d1.ano > d2.ano ? 1 : -1;
        if (d1.mes != d2.mes)
            return d1.mes > d2.mes ? 1 : -1;
        if (d1.dia != d2.dia)
            return d1.dia > d2.dia ? 1 : -1;
        return 0;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
