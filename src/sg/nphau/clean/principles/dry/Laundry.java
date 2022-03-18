/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles.dry;

/**
 * Every piece of knowledge must have a single, unambiguous, authoritative representation within a system.
 * <p>
 * Each significant piece of functionality in a program should be implemented in just one place in the source code.
 * Where similar functions are carried out by distinct pieces of code, it is generally beneficial to
 * combine them into one by abstracting out the varying parts.
 * <p>
 * Why
 * <p>
 * Duplication (inadvertent or purposeful duplication) can lead to maintenance nightmares, poor factoring, and logical contradictions.
 * A modification of any single element of a system does not require a change in other logically unrelated elements.
 * Additionally, elements that are logically related all change predictably and uniformly, and are thus kept in sync.
 * How
 * <p>
 * Put business rules, long expressions, if statements, math formulas, metadata, etc. in only one place.
 * Identify the single, definitive source of every piece of knowledge used in your system, and then use that source
 * to generate applicable instances of that knowledge (code, documentation, tests, etc).
 */
public class Laundry {

    // single unambiguous authoritative
    public void washWhiteClothes() {
        System.out.println("Putting in while clothes.");
        performCommonTasks();
    }

    public void washColorfulClothes() {
        System.out.println("Putting in colorful clothes.");
        performCommonTasks();
    }

    public void performCommonTasks() {
        System.out.println("Filling water to washing machine.");
        System.out.println("Setting configuration.");
        System.out.println("Draining out water");
    }
}
