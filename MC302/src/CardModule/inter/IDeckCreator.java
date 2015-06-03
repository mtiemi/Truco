package CardModule.inter;


public interface IDeckCreator {
	
	/**
	 * Create an card pile with the specifications of the deck
	 * @return
	 */
	public ICardPile createDeck();
	
	/**
	 * Add a card to the deck model
	 * @param card
	 */
	public void addCard(ICard card);
	
	/**
	 * Remove a card from the deck model
	 * @param card
	 */
	public void removeCard(ICard card);
	
}
