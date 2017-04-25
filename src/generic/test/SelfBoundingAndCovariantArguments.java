package generic.test;

public class SelfBoundingAndCovariantArguments {

    void testA(Setter s1, Setter s2, SelfBoundSetter sbs) {
        s1.set(s2);
//        s1.set(sbs);  // Erreo
//        set(Setter) in SelfBoundSetter<Setter> 
//        connot be applied to (SelfBoundSetter)
    }
}

interface SelfBoundSetter<T extends SelfBoundSetter<T>> {
    
    void set(T arg);
    
}

interface Setter extends SelfBoundSetter<Setter> {
    
}
