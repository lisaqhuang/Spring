package tw.ispan.model;

import org.springframework.stereotype.Component;

@Component
public class CreditCardHappy implements CreditCard {

	public CreditCardHappy() {
	}

	@Override
	public void useCard(String messages) {

		System.out.println("Happy Card:"+ messages);
	}

}
