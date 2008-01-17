package org.jvnet.hk2.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Indicates that the component serves as a factory for the specified type.
 *
 * <p>
 * This annotation is useful to plug existing factory-created objects into HK2.
 * Normally goes with {@link Service} annotation, and this annotation must be placed
 * on a class that implements {@link org.jvnet.hk2.component.Factory}
 *
 * @see Factory
 * @author Kohsuke Kawaguchi
 */
@Contract
@Documented
@Retention(RUNTIME) @Target(TYPE)
public @interface FactoryFor {
    @Index
    Class<?> value();
}
