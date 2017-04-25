package com.shlg.chuang.collection_17_09;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SpringDetector {
    
    public static <T extends Groundhog>
            void detectSpring(Class<T> type) throws Exception {
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++)
            map.put(ghog.newInstance(i), new Prediction());
        System.out.println(map);
        Groundhog gh = ghog.newInstance(3);
        System.out.println(gh);
        if (map.containsKey(gh)) {
            System.out.println(map.get(gh));
        } else {
            System.out.println(gh);
        }
    }

    public static void main(String[] args) {
        try {
//            detectSpring(Groundhog.class);
            detectSpring(Groundhog2.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Groundhog {
    
    protected int number;
    
    public Groundhog(int n) {
        number = n;
    }
    
    @Override
    public String toString() {
        return "Groundhog #" + number;
    }
}

class Prediction {
    
    private static Random rand = new Random(47);
    
    private boolean shadow = rand.nextDouble() > 0.5;
    
    @Override
    public String toString() {
        if (shadow)
            return "Six more weeks of Winter!";
        else
            return "Early Spring!";
    }
    
}

class Groundhog2 extends Groundhog {

    public Groundhog2(int n) {
        super(n);
    }
    
    @Override 
    public int hashCode() {
        return number;
    }
    
    @Override
    public boolean equals(Object o) {
        return o instanceof Groundhog2 &&
                this.number == ((Groundhog2) o).number;
    }
    
}
