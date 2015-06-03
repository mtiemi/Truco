package CardModule.inter;

import java.util.List;

import PlayerModule.inter.IPlayer;

public interface ICardPile {
	
	/**
	 * Draw the card from the top
	 * @return
	 */
	public ICard draw();
	
	/**
	 * Shuffle the card pile
	 */
	public void shuffle();
	
	/**
	 * Get all cards visible to the player
	 * @param player
	 * @return
	 */
	public List<ICard> getCards(IPlayer player);
	
	/**
	 * Add an card to the top of the pile
	 * @param card
	 */
	public void addToTop(ICard card);
	
	/**
	 * Add an card to the bottom of the pile
	 * @param card
	 */
	public void addToBottom(ICard card);
	
	/**
	 * Add an card to a random position of the pile
	 * @param card
	 */
	public void addAtRandom(ICard card);
}
