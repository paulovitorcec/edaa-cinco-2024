public class InfoGalaxias {

    private int[] array;

    
    public InfoGalaxias(int[] array) {
        this.array = array;
    }
    
    public int BuscarGuardaVolume(int[] array, int guardavolume) {
        int esquerda = 0;
        int direita = array.length -1;

        while(esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) /2;

            if(array [meio] == guardavolume)
            return meio +1;

            if(array [meio] < guardavolume)
            esquerda = meio+1;
            else
            direita = meio -1;
        }
            return -1;
    }
}

