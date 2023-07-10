package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;

import java.util.Optional;

public abstract class IPhoneFactory {

    public Optional<IPhone> orderIphone(String level){
        IPhone device = null;

        device = createIphone(level);

        if (device != null){
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
            return Optional.of(device);
        } else {
            return Optional.empty();
        }

    }
	protected abstract IPhone createIphone(String level);
}
