package controle;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "AcessoBean")
@RequestScoped
public class AcessoBean {
	private String usuarioAdmin = "admin";
	private String senhaAdmin = "admin";
	
	private String emailAcesso;
	private String senhaAcesso;
	
	public AcessoBean () { }
	
	private static final String VISUALIZACAO = "";
	
	public void entrar () throws IOException {
		if (this.emailAcesso.equals(this.usuarioAdmin) &&
			this.senhaAcesso.equals(this.senhaAdmin)) {
			FacesContext.getCurrentInstance().getExternalContext().redirect(VISUALIZACAO);
		}else {
		
			System.out.println("SENHA OU USUARIO INCORRETOS.");
		
		}
	}
	
	
	public String getUsuarioAdmin() {
		return usuarioAdmin;
	}
	public void setUsuarioAdmin(String usuarioAdmin) {
		this.usuarioAdmin = usuarioAdmin;
	}
	public String getSenhaAdmin() {
		return senhaAdmin;
	}
	public void setSenhaAdmin(String senhaAdmin) {
		this.senhaAdmin = senhaAdmin;
	}
	public String getEmailAcesso() {
		return emailAcesso;
	}
	public void setEmailAcesso(String emailAcesso) {
		this.emailAcesso = emailAcesso;
	}
	public String getSenhaAcesso() {
		return senhaAcesso;
	}
	public void setSenhaAcesso(String senhaAcesso) {
		this.senhaAcesso = senhaAcesso;
	}
	
	

}
