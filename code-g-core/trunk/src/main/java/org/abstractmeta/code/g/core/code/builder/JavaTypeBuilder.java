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
package org.abstractmeta.code.g.core.code.builder;


import org.abstractmeta.code.g.code.JavaConstructor;
import org.abstractmeta.code.g.code.JavaField;
import org.abstractmeta.code.g.code.JavaMethod;
import org.abstractmeta.code.g.code.JavaType;
import org.abstractmeta.code.g.core.code.JavaTypeImpl;
import org.abstractmeta.code.g.handler.JavaFieldHandler;
import org.abstractmeta.code.g.handler.JavaMethodHandler;
import org.abstractmeta.code.g.handler.JavaTypeHandler;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.*;


/**
 * Provide generateBuilder implementation of org.abstractmeta.toolbox.code.JavaType
 * This class has been auto-generated by code-g.
 */
public class JavaTypeBuilder {

    public static final String CODE_G_GENERATOR_SIGNATURE = "This source code was automatically generated by code-g plugin.";

    private JavaType sourceType;

    private List<JavaFieldHandler> fieldHandlers = new ArrayList<JavaFieldHandler>();

    private List<JavaTypeHandler> typeHandlers = new ArrayList<JavaTypeHandler>();

    private final List<JavaMethodHandler> methodHandlers = new ArrayList<JavaMethodHandler>();

    private List<JavaField> fields = new ArrayList<JavaField>();

    private List<JavaMethod> methods = new ArrayList<JavaMethod>();

    private List<JavaConstructor> constructors = new ArrayList<JavaConstructor>();

    private List<Type> genericTypeArguments = new ArrayList<Type>();
    
    private Map<String, Type> genericTypeVariables = new HashMap<String, Type>();

    private Set<Type> importTypes = new HashSet<Type>();

    private List<Type> superInterfaces = new ArrayList<Type>();

    private String packageName;

    private String kind;

    private List<String> body = new ArrayList<String>();

    private Type superType;

    private List<JavaType> nestedJavaTypes = new ArrayList<JavaType>();

    private List<String> modifiers = new ArrayList<String>();

    private String name;

    private List<Annotation> annotations = new ArrayList<Annotation>();

    private List<String> documentation = new ArrayList<String>();

    private boolean nested;

    public JavaTypeBuilder setSourceType(JavaType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public JavaTypeBuilder setTypeName(String typeName) {
        setName(typeName);
        int dotIndex = typeName.lastIndexOf('.');
        if (dotIndex != -1) {
            setPackageName(typeName.substring(0, dotIndex));
        } else {
            throw new IllegalStateException("Invalid type name: " + typeName);
        }
        return this;
    }


    public String getSimpleName() {
        if (name == null) {
            throw new IllegalArgumentException("name was null");
        }
        String name = this.name.replace('$', '.');
        int dotIndex = name.lastIndexOf('.');
        if (dotIndex != -1) {
            return name.substring(dotIndex + 1, name.length());
        } else {
            return name;
        }
    }

    public JavaTypeBuilder addFieldHandler(JavaFieldHandler fieldHandler) {
        this.fieldHandlers.add(fieldHandler);
        return this;
    }

    public JavaTypeBuilder addTypeHandler(JavaTypeHandler typeHandler) {
        this.typeHandlers.add(typeHandler);
        return this;
    }

    public JavaTypeBuilder addMethodHandler(JavaMethodHandler methodHandler) {
        this.methodHandlers.add(methodHandler);
        return this;
    }


    public List<JavaField> getFields() {
        return this.fields;
    }

    public JavaTypeBuilder setFields(List<JavaField> fields) {
        this.fields = fields;
        return this;
    }


    public JavaTypeBuilder addField(JavaField field) {
        if(containsField(field.getName())) {
            return this;
        }
        this.fields.add(field);
        return this;
    }

    public JavaTypeBuilder addFields(Collection<JavaField> fields) {
        for(JavaField field: fields) {
            addField(field);
        }
        return this;
    }


    public boolean containsField(String fieldName) {
        for (JavaField field : getFields()) {
            if (fieldName.equals(field.getName())) {
                return true;
            }
        }
        return false;
    }


    public boolean containsMethod(String methodName) {
        for (JavaMethod method : getMethods()) {
            if (methodName.equals(method.getName())) {
                return true;
            }
        }
        return false;
    }

    public JavaMethod getMethod(String methodName) {
        for (JavaMethod method : getMethods()) {
            if (methodName.equals(method.getName())) {
                return method;
            }
        }
        return null;
    }

    public List<JavaMethod> getMethods(String methodName) {
        List<JavaMethod> result = new ArrayList<JavaMethod>();
        for (JavaMethod method : getMethods()) {
            if (methodName.equals(method.getName())) {
                result.add(method);
            }
        }
        return result;
    }


    public List<JavaMethod> getMethods() {
        return this.methods;
    }

    public JavaTypeBuilder setMethods(List<JavaMethod> methods) {
        this.methods = methods;
        return this;
    }


    public JavaTypeBuilder addMethod(JavaMethod method) {
        this.methods.add(method);
        return this;
    }

    public JavaTypeBuilder addMethods(Collection<JavaMethod> methods) {
        this.methods.addAll(methods);
        return this;
    }

    public List<JavaConstructor> getConstructors() {
        return this.constructors;
    }

    public JavaTypeBuilder setConstructors(List<JavaConstructor> constructors) {
        this.constructors = constructors;
        return this;
    }

    public JavaTypeBuilder addConstructor(JavaConstructor constructor) {
        this.constructors.add(constructor);
        return this;
    }

    public JavaTypeBuilder addConstructors(Collection<JavaConstructor> constructors) {
        this.constructors.addAll(constructors);
        return this;
    }

    public List<Type> getSuperInterfaces() {
        return this.superInterfaces;
    }

    public JavaTypeBuilder setSuperInterfaces(List<Type> superInterfaces) {
        this.superInterfaces = superInterfaces;
        return this;
    }

    public JavaTypeBuilder addSuperInterface(Type superInterface) {
        this.superInterfaces.add(superInterface);
        return this;
    }

    public JavaTypeBuilder addSuperInterfaces(Collection<Type> superInterfaces) {
        this.superInterfaces.addAll(superInterfaces);
        return this;
    }


    public Set<Type> getImportTypes() {
        return this.importTypes;
    }

    public JavaTypeBuilder setImportTypes(Set<Type> importTypes) {
        this.importTypes = importTypes;
        return this;
    }

    public JavaTypeBuilder addImportType(Type importType) {
        this.importTypes.add(importType);
        return this;
    }

    public JavaTypeBuilder addImportTypes(Collection<Type> importTypes) {
        this.importTypes.addAll(importTypes);
        return this;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public JavaTypeBuilder setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public String getKind() {
        return this.kind;
    }

    public JavaTypeBuilder setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public List<String> getBody() {
        return this.body;
    }

    public JavaTypeBuilder setBody(List<String> body) {
        this.body = body;
        return this;
    }

    public JavaTypeBuilder addBody(String body) {
        this.body.add(body);
        return this;
    }

    public JavaTypeBuilder addBody(Collection<String> body) {
        this.body.addAll(body);
        return this;
    }


    public Type getSuperType() {
        return this.superType;
    }

    public JavaTypeBuilder setSuperType(Type superType) {
        this.superType = superType;
        return this;
    }

    public List<JavaType> getNestedJavaTypes() {
        return this.nestedJavaTypes;
    }

    public JavaTypeBuilder setNestedJavaTypes(List<JavaType> nestedJavaTypes) {
        this.nestedJavaTypes = nestedJavaTypes;
        return this;
    }

    public JavaTypeBuilder addNestedJavaType(JavaType classType) {
        this.nestedJavaTypes.add(classType);
        return this;
    }

    public JavaTypeBuilder addNestedJavaTypes(Collection<JavaType> classTypes) {
        this.nestedJavaTypes.addAll(classTypes);
        return this;
    }

    public List<String> getModifiers() {
        return this.modifiers;
    }

    public JavaTypeBuilder setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
        return this;
    }

    public JavaTypeBuilder addModifier(String modifier) {
        this.modifiers.add(modifier);
        return this;
    }

    public JavaTypeBuilder addModifiers(Collection<String> modifiers) {
        this.modifiers.addAll(modifiers);
        return this;
    }

    public String getName() {
        return this.name;
    }

    public JavaTypeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public JavaTypeBuilder setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
        return this;
    }

    public JavaTypeBuilder addAnnotation(Annotation annotation) {
        this.annotations.add(annotation);
        return this;
    }

    public JavaTypeBuilder addAnnotations(Collection<Annotation> annotations) {
        this.annotations.addAll(annotations);
        return this;
    }

    public List<String> getDocumentation() {
        return this.documentation;
    }

    public JavaTypeBuilder setDocumentation(List<String> documentation) {
        this.documentation = documentation;
        return this;
    }

    public JavaTypeBuilder addDocumentation(String documentation) {
        this.documentation.add(documentation);
        return this;
    }

    public JavaTypeBuilder addDocumentation(Collection<String> documentation) {
        this.documentation.addAll(documentation);
        return this;
    }

    public JavaTypeBuilder setNested(boolean nested) {
        this.nested = nested;
        return this;
    }

    public boolean isNested() {
        return nested;
    }

    public JavaTypeBuilder setGenericTypeArguments(List<Type> genericTypeArguments) {
        this.genericTypeArguments = genericTypeArguments;
        return this;
    }

    public JavaTypeBuilder addGenericTypeArguments(Type... genericTypeArguments) {
        Collections.addAll(this.genericTypeArguments, genericTypeArguments);
        return this;
    }

    public JavaTypeBuilder addGenericTypeArguments(Collection<Type> genericTypeArguments) {
        this.genericTypeArguments.addAll(genericTypeArguments);
        return this;
    }

    public Map<String, Type> getGenericTypeVariables() {
        return genericTypeVariables;
    }

    public JavaTypeBuilder setGenericTypeVariables(Map<String, Type> genericTypeVariables) {
        this.genericTypeVariables = genericTypeVariables;
        return this;
    }

    public JavaTypeBuilder addGenericTypeVariables(Map<String, Type> genericTypeVariables) {
        this.genericTypeVariables.putAll(genericTypeVariables);
        return this;
    }

    public JavaTypeBuilder addGenericTypeVariable(String key, Type value) {
        this.genericTypeVariables.put(key, value);
        return this;
    }

    public JavaType build() {

        for (JavaMethod method : getMethods()) {
            for (JavaMethodHandler methodHandler : methodHandlers) {
                methodHandler.handle(sourceType, method);
            }
        }

        for (JavaField field : new ArrayList<JavaField>(getFields())) {
            for (JavaFieldHandler fieldHandler : fieldHandlers) {
                fieldHandler.handle(sourceType, field);
            }
        }

        for (JavaTypeHandler typeHandler : typeHandlers) {
            typeHandler.handle(sourceType);
        }
        addDocumentation(CODE_G_GENERATOR_SIGNATURE);
        return new JavaTypeImpl(getFields(), getMethods(), getConstructors(), importTypes, superInterfaces, packageName, kind, body, superType, nestedJavaTypes, modifiers, name, annotations, documentation, nested, getSimpleName(), genericTypeArguments, genericTypeVariables);
    }


    public JavaTypeBuilder merge(JavaType instance) {
        if (instance.getFields() != null) {
            addFields(instance.getFields());
        }
        if (instance.getMethods() != null) {
            addMethods(instance.getMethods());
        }
        if (instance.getConstructors() != null) {
            addConstructors(instance.getConstructors());
        }
        if (instance.getImportTypes() != null) {
            addImportTypes(instance.getImportTypes());
        }
        if (instance.getSuperInterfaces() != null) {
            addSuperInterfaces(instance.getSuperInterfaces());
        }
        if (instance.getPackageName() != null) {
            setPackageName(instance.getPackageName());
        }
        if (instance.getKind() != null) {
            setKind(instance.getKind());
        }
        if (instance.getBody() != null) {
            addBody(instance.getBody());
        }
        if (instance.getSuperType() != null) {
            setSuperType(instance.getSuperType());
        }
        if (instance.getNestedJavaTypes() != null) {
            addNestedJavaTypes(instance.getNestedJavaTypes());
        }
        if (instance.getModifiers() != null) {
            addModifiers(instance.getModifiers());
        }
        if (instance.getName() != null) {
            setName(instance.getName());
        }
        if (instance.getAnnotations() != null) {
            addAnnotations(instance.getAnnotations());
        }
        if (instance.getDocumentation() != null) {
            addDocumentation(instance.getDocumentation());
        }
        return this;
    }

}