/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.dep.app;

import gradle.dep.list.LinkedList;

import static gradle.dep.utilities.StringUtils.join;
import static gradle.dep.utilities.StringUtils.split;
import static gradle.dep.app.MessageUtils.getMessage;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        // No guava here!!
        System.out.println(join(tokens));
    }
}
