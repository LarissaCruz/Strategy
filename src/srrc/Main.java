package srrc;

public class Main {

	    public static void main(String[] args) {
	        Personagem personagem = new Personagem();

	        personagem.setMovimento(new Caminhar());
	        personagem.executarMovimento(); 

	        
	        personagem.setMovimento(new Correr());
	        personagem.executarMovimento(); 

	       
	        personagem.setMovimento(new Rastejar());
	        personagem.executarMovimento(); 
	    }
	

}
