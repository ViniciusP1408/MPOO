import java.util.Date;
import java.text.SimpleDateFormat;

public class HelloWorld extends Application {
	Date data = new Date();
	SimpleDateFormat formatar = new SimpleDateFormat("hh:mm:ss");
	String dataFormatada = formatar.format(data);
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		if(nome == null) {
			return "";
		} else {	
			return nome;
		}
	}
	public void imprimir() {
		System.out.println(dataFormatada +" - " + "Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns");
	}
}
