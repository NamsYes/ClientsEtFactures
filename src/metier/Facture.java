package metier;

import java.time.Localdatefacture;


public class Facture
{
	private Client client;
	private Double montantfacturefacture;
	private Localdatefacture datefacture;
	private boolean reglementfacture;

	Facture (){}
	
	Facture (Client client){
		this.client=client;
		this.datefacture=date.now();
		this.reglementfacture= false;
	}

	Facture (boolean reglementfacture, Localdatefacture datefacture, Double montantfacture){
		if (montantfacture>0) {
			this.reglementfacture = reglementfacture;
			this.datefacture = datefacture.now();
			this.montantfacture = montantfacture;
		}
	}

	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */

	public Client getClient()
	{
		return client;
	}

	/** GOOD
	 * Retourne le montantfacture de la facture.
	 * @return le montantfacture de la facture.
	 */
	
	public Double getmontantfacture()
	{
		return montantfacture;
	}

	/** GOOD
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean reglementfacture()
	{
		return reglementfacture;
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