package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.Iphone11Factory;
import br.com.cod3r.factory.apple.factory.IphoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

import java.util.Optional;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iPhoneXFactory = new IphoneXFactory();
		IPhoneFactory iPhone11Factory = new Iphone11Factory();

		System.out.println("### Ordering an iPhone X");
		Optional<IPhone> optionalIPhone= iPhoneXFactory.orderIphone("standart");
		optionalIPhone.ifPresent(System.out::println);
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		Optional<IPhone> optionalIPhone11 = iPhone11Factory.orderIphone("highEnd");
		optionalIPhone11.ifPresent(System.out::println);
	}
}
