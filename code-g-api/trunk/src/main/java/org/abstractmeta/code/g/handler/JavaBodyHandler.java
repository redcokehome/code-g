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
package org.abstractmeta.code.g.handler;

import com.sun.xml.internal.ws.api.model.JavaMethod;
import org.abstractmeta.code.g.code.JavaConstructor;
import org.abstractmeta.code.g.code.JavaField;
import org.abstractmeta.code.g.code.JavaType;
import org.abstractmeta.code.g.config.Descriptor;

import java.util.Collection;

/**
 * This handler supposed to be customized by an individual plugin,
 * to extend basic functionality, i.e. before assigning a value to a field.
 * See plugin documentation for more details.
 *
 * @author Adrian Witas
 */
public interface JavaBodyHandler {

    void handle(Descriptor descriptor, JavaType sourceType, JavaField javaField, Collection<String> resultBody, String argument);

    void handle(Descriptor descriptor, JavaType sourceType, JavaMethod javaMethod, Collection<String> resultBody, String ... arguments);

    void handle(Descriptor descriptor, JavaType sourceType, JavaConstructor javaConstructor, Collection<String> resultBody, String ... arguments);

}

        