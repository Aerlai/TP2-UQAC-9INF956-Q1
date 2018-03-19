package compte;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public interface Compte {
	
	String getNumero();
	String getService();
	String getNom();
	String getNumeroTel();
	double getSolde();
	void deposer( double montant );
	String retirer( double montant );
}
