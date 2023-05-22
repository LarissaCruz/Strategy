package srrc;

public class Personagem {
	private Movimento movimentar;
	
	public void setMovimento(Movimento movimenta) {
        this.movimentar = movimenta;
    }
	
	public void executarMovimento() {
        if (movimentar != null) {
        	movimentar.executarMovimento();
        }
    }
}
