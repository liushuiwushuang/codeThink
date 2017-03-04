package com.shlg.chuang.innerc;

class MNA {
    
    private void f() {}
    
    class A {
        
        private void g() {}
        
        public class B {
            void h() {
                g();
                f();
            }
        }
    }

}

public class MultiNestingAccess {
    
    public static void main(String[] args) {
        
        MNA mna = new MNA();
        MNA.A mna_a = mna.new A();
        
        MNA.A.B mna_a_b = mna_a.new B();
        mna_a_b.h();
        
    }
}
