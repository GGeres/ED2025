/**
 *
 * @author Gustavo
 */
public class Function_countDigitos {
    public int contarDigitos(int x){
        // A condição de parada: Apenas quando o número (var x) tiver apenas um dígito
        if(Math.abs(x) < 10){
            return 1;
        } else{
            // Chamada recursiva para reduzir o número (var x) e somando 1 para cada chamada da função
            return 1 + contarDigitos(x / 10);
        }
    }
}
