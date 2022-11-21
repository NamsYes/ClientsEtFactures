package metier;

import java.time.Localdatefacture;


public class Facture
{
	private Client client;
	private Double montantFacture;
	private Localdatefacture dateFacture;
	private boolean reglementFacure;



	Facture (){}

	Facture (boolean reglementFacure, Localdatefacture dateFacture, Double montantFacture){
		if (montant>0) {
			this.reglementFacure = reglementFacure;
			this.dateFacture = dateFacture.now();
			this.montantFacture = montantFacture;
		}
	}

	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */

	public Client getClient()
	{
		return null;
	}

	/** GOOD
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */

	public Double getMontant()
	{
		return montant;
	}

	/** GOOD
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */

	public boolean estReglee()
	{
		return reglementFacure;
	}

	/**
	 * Retourne la datefacture de la facture.
	 * @return la datefacture de la facture.
	 */
	
	public Localdatefacture getdatefacture()
	{
		return this.dateFacture;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{

	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		Facture newFacture = new Facture ();
		return null;
	}
}