package CardModule.inter;

import PlayerModule.inter.IPlayer;

public interface ICard {
	
	/**
	 * Compares two cards, returns 1 if this is higher, 0 if equal or -1 else;
	 * @param card
	 * @return
	 */
	public int compare(ICard card);
	
	/**
	 * Checks if a player have permission to see the card
	 * @param player
	 * @return
	 */
	public boolean getPermission(IPlayer player);
	
	
}
