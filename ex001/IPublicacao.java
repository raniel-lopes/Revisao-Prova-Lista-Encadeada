package ex001;

public interface IPublicacao {
	
	public boolean adicionarPublicacao(String autor, String conteudo);
	public boolean atualizarPublicacao(String novoConteudo);
	public boolean removerPublicacao();
	public void listarPublicacao();
	
}
