public class correcao_Exercicio04 {
    public static void main(String[] args) {
        Data_Correcao data = new Data_Correcao(28, 2, 2024); // ano bissexto
	System.out.println("Data inicial: " + data);

	Data_Correcao hoje = new Data_Correcao();
        System.out.println("Data atual: " + hoje);       

        data.avancarDia();
 	System.out.println("Depois de avançar 1 dia: " + data);

        Data_Correcao outraData = new Data_Correcao(1, 3, 2024);

        int resultado = Data_Correcao.comparar(outraData, data);
	if (resultado == 0) {
    		System.out.println("As datas são iguais.");
	} else if (resultado > 0) {
    		System.out.println("Data 1 é mais recente que Data 2.");
	} else {
    		System.out.println("Data 2 é mais recente que Data 1.");
	}
    }
}
