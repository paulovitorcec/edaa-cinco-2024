public class BuscaBinariaUm {

    public static void main(String[] args) {
         int[] listaNumeros = { 242, 243, 255, 268, 270, 275, 285, 289,
             293, 296,  306, 307, 310, 315, 318, 323, 334, 337, 350, 
             351,355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
             391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
             429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
             483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
             511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
             554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
             613, 616, 623, 624, 625, 626, 632, 643, 645, 647,
             652, 654, 655, 662, 667, 671, 673, 674, 695, 696};

             int indice415 = BuscaBinaria(listaNumeros, 415);
             System.out.println("O índice do número 415 é: " +indice415+ "!");

             int indice545 = BuscaBinaria(listaNumeros, 545);
             System.out.println("O índice do número 545 é: " +indice545+ "!");

             int indice390 = BuscaBinaria(listaNumeros, 390);
             System.out.println("O índice do número 390 é: " +indice390+ "!");

             int indice609 = BuscaBinaria(listaNumeros, 609);
             System.out.println("O índice do número 609 é: " +indice609+ "!");

             int indice296 = BuscaBinaria(listaNumeros, 296);
             System.out.println("O índice do número 296 é: " +indice296 + "!");
    }

    public static int BuscaBinaria(int[] lista, int alvo) {
        int esquerda = 0;
        int direita = lista.length -1;

        while(esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (lista [meio] == alvo)
            return meio;

            if (lista [meio] < alvo)
            esquerda = meio +1;
            else
            direita = meio -1;
 
        }
        return -1;
    }
}