package metier;

import java.time.LocalDate;


public class Facture
{
	private Client client;
	private Double montant;
	private LocalDate date;
	private boolean estReglee;

	Facture (){}

	Facture (boolean estReglee, LocalDate date, Double montant){
		if (montant>0) {
			this.estReglee = estReglee;
			this.date = date.now();
			this.montant = montant;
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
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */

	public LocalDate getDate()
	{
		return this.date;
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