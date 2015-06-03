package PlayerModule.inter;

import CardModule.inter.ICardPile;

public interface IPlayer {
	public int getPoints();
	
	public ICardPile getHand();
}
