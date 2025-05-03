/*
 * (8) Inner Classes
 * (8 - 1L) Normal / Regular Inner Classes - Modifiers
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

public class ModifiersInnerClass {

    private class PrivateInner {

        public void m() {
            System.out.println("m(_) from PrivateInner");
        }

    }

    protected class ProtectedInner {

        public void m() {
            System.out.println("m(_) from ProtectedInner");
        }

    }

    static class StaticInner {

        public void m() {
            System.out.println("m(_) from PrivateInner");
        }

    }

    public static void main(String[] args) {

        new ModifiersInnerClass().new PrivateInner().m();
        new ModifiersInnerClass().new ProtectedInner().m();
//        new ModifiersInnerClass().new StaticInner().m();

    }


}

/*
m(_) from PrivateInner
m(_) from ProtectedInner
 */
