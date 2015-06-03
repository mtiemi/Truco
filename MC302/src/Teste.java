import examples.fish.s01.IFish;
import anima.context.exception.ContextException;
import anima.factory.IGlobalFactory;
import anima.factory.context.componentContext.ComponentContextFactory;
import anima.factory.exception.FactoryException;

public class Teste {
	public static void main(String[] args) throws ContextException, FactoryException {
		IGlobalFactory factory = ComponentContextFactory.createGlobalFactory();
		IFish fish = factory.createInstance("http://purl.org/NET/dcc/examples.fish.s01.Fish");
	}
}
