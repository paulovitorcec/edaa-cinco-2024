        public class BuscandoPlacas{
            
            private int[] lista;
        
        public BuscandoPlacas(int[] lista) {
                this.lista = lista;
            }

        public int BuscarPlaca(int[] lista, int alvo) {
            int esquerda = 0;
            int direita = lista.length -1;
    
            while(esquerda <= direita) {
                int meio = esquerda + (direita - esquerda) / 2;
    
                if (lista [meio] == alvo)
                return meio +1;
    
                if (lista [meio] < alvo)
                esquerda = meio +1;
                else
                direita = meio -1;
     
            }
            return -1;
        }
    }
