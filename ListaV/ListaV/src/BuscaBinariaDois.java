public class BuscaBinariaDois {

    public static void main(String[] args) {
        
        int[] listaNumero = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
            178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
            243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
            317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
            396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
            443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
            525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
            626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
            723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
            824, 826, 832, 848, 854, 856, 858, 867, 873, 880
            };

            int indice824 = BuscaBinaria(listaNumero, 824);
            System.out.println("O índice do número 824 é: " +indice824+ "!");

            int indice599 = BuscaBinaria(listaNumero, 599);
            System.out.println("O índice do número 599 é:" +indice599+ "!");
            
            int indice700 = BuscaBinaria(listaNumero, 700);
            System.out.println("O índice do número 700 é: " +indice700+ "!");

            int indice858 = BuscaBinaria(listaNumero, 858);
            System.out.println("O índice do número 858 é: " +indice858+ "!");

            int indice269 = BuscaBinaria(listaNumero, 269);
            System.out.println("O índice do número 269 é: " +indice269+ "!");

            int indice351 = BuscaBinaria(listaNumero, 351);
            System.out.println("O índice do número 351 é: " +indice351+ "!");

            int indice42 = BuscaBinaria(listaNumero, 42);
            System.out.println("O índice do número 42 é: " +indice42+ "!");

            int indice317 = BuscaBinaria(listaNumero, 317);
            System.out.println("O índice do número 317 é: " +indice317+ "!");

            int indice525 = BuscaBinaria(listaNumero, 525);
            System.out.println("O índice do número 525 é: " +indice525+ "!");

            int indice550 = BuscaBinaria(listaNumero, 550);
            System.out.println("O índice do número 550 é: " +indice550+ "!");

            int indice143 = BuscaBinaria(listaNumero, 143);
            System.out.println("O índice do número 143 é: " +indice143+ "!");

            int indice421 = BuscaBinaria(listaNumero, 421);
            System.out.println("O índice do número 421 é: " +indice421+ "!");

            int indice422 = BuscaBinaria(listaNumero, 422);
            System.out.println("O índice do número 422 é: " +indice422+ "!");


    } 

    public static int BuscaBinaria(int[] lista, int alvo){

        int esquerda = 0;
        int direita = lista.length -1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) /2;

            if(lista[meio] == alvo)
            return meio;

            if(lista[meio] < alvo)
            esquerda = meio +1;

            else
            direita = meio -1;
        }
                return -1;
    }
}