package com.example.demo;

import com.example.demo.decorator.CellPhone;
import com.example.demo.decorator.CellPhoneDecorator;
import com.example.demo.decorator.SimplePhone;
import com.example.demo.decorator.SmartPhone;
import com.example.demo.factory.FactorySimple;
import com.example.demo.factory.Personne;
import com.example.demo.factory.abstracte.ConstantUtil;
import com.example.demo.factory.abstracte.FactoryCreator;
import com.example.demo.factory.abstracte.Khassida;
import com.example.demo.factory.abstracte.KhassidaAbstractFactory;
import com.example.demo.helper.Helper;
import com.example.demo.proxy.ProxyPersonSeeker;
import com.example.demo.singleton.MySingleton;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// Singleton
		final Object instance = MySingleton.getInstance();
		// Helper
		Helper.log("value");
		// Factory simple
		final Personne personne = FactorySimple.of("jean", "toto");
		// Abstract factory
		final KhassidaAbstractFactory factory = FactoryCreator.createFactory();
		final Khassida khassida = factory.createKhassida(ConstantUtil.KhassidaEnum.JAZBU);
		System.out.println(khassida.getAuthor());
		// Proxy
		ProxyPersonSeeker proxyPersonSeeker = new ProxyPersonSeeker(name -> new Personne(name, name+"ko"));
		proxyPersonSeeker.findPerson("toto");
		// Decorator
		CellPhone simplPhone = new SimplePhone();
		CellPhoneDecorator smartPhone = new SmartPhone(simplPhone);
		System.out.println(smartPhone);
	}
}

