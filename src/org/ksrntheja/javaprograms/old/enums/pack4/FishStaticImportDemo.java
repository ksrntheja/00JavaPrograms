/*
 * (17) Enum
 * (8 - 4) Importing Enums
 */

package org.ksrntheja.javaprograms.old.enums.pack4;

import org.ksrntheja.javaprograms.old.enums.pack1.Fish;

import static org.ksrntheja.javaprograms.old.enums.pack1.Fish.STAR;

public class FishStaticImportDemo {

    public static void main(String[] args) {

        Fish fish = Fish.GUPPY;
        System.out.println(fish);
        System.out.println(STAR);

    }

}

/*
GUPPY
STAR
 */
