/**
 * Copyright 2011 Adrian Witas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.abstractmeta.code.g.core.builder;

import org.abstractmeta.code.g.code.JavaType;
import org.abstractmeta.code.g.config.Descriptor;
import org.abstractmeta.code.g.core.code.builder.JavaTypeBuilder;
import org.abstractmeta.code.g.core.handler.field.*;
import org.abstractmeta.code.g.core.handler.type.BuilderMergeHandler;
import org.abstractmeta.code.g.core.handler.type.BuilderTypeHandler;

/**
 * BuilderClassBuilder
 *
 * @author Adrian Witas
 */
public class BuilderClassBuilder extends JavaTypeBuilder {

    private final JavaType buildType;
    private final Descriptor descriptor;
    public BuilderClassBuilder(JavaType builtType, Descriptor descriptor) {
        super();
        this.buildType = builtType;
        this.descriptor = descriptor;

        addFieldHandler(new BuilderSetterFieldHandler(this, descriptor));
        addFieldHandler(new BuilderCollectionFieldHandler(this, descriptor));
        addFieldHandler(new BuilderMapFieldHandler(this, descriptor));
        addFieldHandler(new BuilderArrayFieldHandler(this, descriptor));
        addFieldHandler(new GetterFieldHandler(this, descriptor));
        addTypeHandler(new BuilderTypeHandler(this, descriptor));
        addTypeHandler(new BuilderMergeHandler(this));
    }

    public JavaType getBuildType() {
        return buildType;
    }

    protected Descriptor getDescriptor() {
        return descriptor;
    }


}
