package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//testes Singleton
		SingletonLazy lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		
		System.out.println("----------------");
		
		SingletonEager eager = SingletonEager.getIntancia();
		System.out.println(eager);
		eager = SingletonEager.getIntancia();
		System.out.println(eager);
		
		System.out.println("----------------");
		
		SingletonLazyHolder LH = SingletonLazyHolder.getIntancia();
		System.out.println(LH);
		LH = SingletonLazyHolder.getIntancia();
		System.out.println(LH);
		
		//testes Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		
		//testes facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Tiago", "15076578");
		
	}
}
