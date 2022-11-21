package metier;

import java.time.Localdatefacture;


public class Facture
{
	private boolean estReglee;
	private Localdatefacture datefacture;
	private Double montant;

	Facture (){}

	Facture (boolean estReglee, Localdatefacture datefacture, Double montant){
		if (montant>0) {
			this.estReglee = estReglee;
			this.datefacture = datefacture.now();
			this.montant = montant;
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
		return estReglee;
	}

	/**
	 * Retourne la datefacture de la facture.
	 * @return la datefacture de la facture.
	 */
	
	public Localdatefacture getdatefacture()
	{
		return this.datefacture;
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