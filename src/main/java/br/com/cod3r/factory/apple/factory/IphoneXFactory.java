package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IphoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIphone(String level) {
        if (level.toUpperCase().equals("STANDART")){
            return new IPhoneX();
        } else if (level.toUpperCase().equals("HIGHEND")){
            return new IPhoneXSMax();
        } else {
            return null;
        }
    }
}
