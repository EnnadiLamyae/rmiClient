

import java.rmi.Naming;

import com.bank.demo.entities.Compte;
import com.bank.demo.rmi.BankRMI;

public class RMIClient {

	public static void main(String[] args) {

		try {
			BankRMI proxy = (BankRMI) Naming.lookup("rmi://localhost:1099/BankRMIService");
			Compte compte = proxy.consultCompte("CC1");
			System.out.println("Code du Compte : "+compte.getCodeCompte());
			System.out.println("Solde : "+compte.getSolde());
			System.out.println("Client : "+compte.getClient().getNomClient());
			System.out.println("Employe : "+compte.getEmploye().getNomEmploye());
			System.out.println("Date de creation  : "+compte.getDateCreation());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
