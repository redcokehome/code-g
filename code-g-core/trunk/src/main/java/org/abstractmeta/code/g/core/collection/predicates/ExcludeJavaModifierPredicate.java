package org.abstractmeta.code.g.core.collection.predicates;

import com.google.common.base.Predicate;
import org.abstractmeta.code.g.code.JavaModifier;

import javax.annotation.Nullable;

/**
 * Represents ExcludeJavaModifierPredicate
 *
 * @author Adrian Witas
 */
public class ExcludeJavaModifierPredicate implements Predicate<JavaModifier> {

    private final JavaModifier excludeJavaModifier;

    public ExcludeJavaModifierPredicate(JavaModifier excludeJavaModifier) {
        this.excludeJavaModifier = excludeJavaModifier;
    }

    @Override
    public boolean apply(JavaModifier javaModifier) {
        return ! excludeJavaModifier.equals(javaModifier);
    }
}
