package com.shlg.chuang.exception;

public class StormyInning extends Inning implements Storm {
	
	public StormyInning() throws RainedOut, BaseballException {
		
	}
	
	public StormyInning(String s) throws Foul, BaseballException {
		
	}

	@Override
	public void rainHard() throws RainedOut {
		
	}
	
	public void event() {}

	@Override
	public void atBat() throws PopFoul {
		
	}
	
	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch(PopFoul e) {
			System.out.println("Pop foul");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		
		try{
			Inning i = new StormyInning();
			i.atBat();
		} catch (Strike e) {
			System.out.println("Strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}

}
