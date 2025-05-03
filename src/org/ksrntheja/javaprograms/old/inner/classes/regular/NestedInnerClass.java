/*
 * (8) Inner Classes
 * (8 - 1L) Normal / Regular Inner Classes - Modifiers
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

public class NestedInnerClass {

    class BInner {

        class CInner {

            public void m() {
                System.out.println("m(_) from CInner");
            }

        }

    }

    public static void main(String[] args) {

        NestedInnerClass aInner = new NestedInnerClass();
        NestedInnerClass.BInner bInner = aInner.new BInner();
        NestedInnerClass.BInner.CInner cInner01 = bInner.new CInner();
        cInner01.m();

        NestedInnerClass.BInner.CInner cInner02 = new NestedInnerClass().new BInner().new CInner();
        cInner02.m();

        new NestedInnerClass().new BInner().new CInner().m();

    }

}

/*
m(_) from CInner
m(_) from CInner
m(_) from CInner
 */
