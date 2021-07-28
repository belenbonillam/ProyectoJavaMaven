public class Rapido{
    public static void seleccion(int[]matrix){
        int i, k, p, buffer, limit = matrix.length-1;
        for(k = 0; k < limit; k++){
            p = k;
            for(i = k+1; i <= limit; i++){
                if(matrix[i] < matrix[p]) p = i;
                if(p != k){
                    buffer = matrix[p];
                    matrix[p] = matrix[k];
                    matrix[k] = buffer;
                }
            }
        }
    }
}