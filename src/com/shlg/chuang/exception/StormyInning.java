package com.shlg.chuang.exception;

public class StormyInning extends Inning implements Storm {
	
    /*
     * 父类构造器有异常说明，子类就必须有异常说明
     */
	public StormyInning() throws RainedOut, BaseballException {
		
	}
	
	public StormyInning(String s) throws Foul, BaseballException {
		
	}
	
	/*
	 * 父类该方法没有异常说明，子类覆盖的方法就不能有异常说明
	 * @see com.shlg.chuang.exception.Inning#walk()
	 */
	public void walk() {
	    
	}

	@Override
	public void rainHard() throws RainedOut {
		
	}
	
	/*
	 * 父类的方法有异常说明，子类的方法可以没有异常说明
	 * 
	 * 基类和接口的该方法的异常说明不一样，这里即使基类和接口 的异常说明 都 声明了也会报编译错误
	 * 即使异常说明 用基类的异常说明的公共异常的基类 Exception 也没用
	 * 基类和接口的该方法的异常说明一样 时，子类的方法可以有跟父类一致的异常说明
	 * @see com.shlg.chuang.exception.Inning#event()
	 */
	public void event() //throws RainedOut, BaseballEcxeption 
	{
	    
	}

	/*
	 * 子类可以有父类方法不一致的 异常说明
	 * @see com.shlg.chuang.exception.Inning#atBat()
	 */
	@Override
	public void atBat() throws PopFoul {
		
	}
	
	public static void main(String[] args) {
	    try {
            StormyInning sk = new StormyInning();
            // 捕获的异常，根据引用本身，不随引用指向的对象
            sk.event();
        } catch (RainedOut | BaseballException e1) {
            e1.printStackTrace();
        }
	    
	    try {
            Inning sp = new StormyInning();
            sp.event();
        } catch (RainedOut | BaseballException e1) {
            e1.printStackTrace();
        } 
	    
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
		} catch (Foul e) {
            e.printStackTrace();
        } catch (Strike e) {
            e.printStackTrace();
        } catch (RainedOut e) {
            e.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        }
		
	}

}
