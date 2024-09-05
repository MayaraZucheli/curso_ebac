package exceptions;

public class ExceptionElementoNaoConhecido extends Exception {

	

	private static final long serialVersionUID = -2784252569204746993L;

	public ExceptionElementoNaoConhecido(String mensagem) {
		this(mensagem,null);
		
	}
	
	public ExceptionElementoNaoConhecido(String mensagem, Throwable e) {
		super(mensagem,e);

	
}
