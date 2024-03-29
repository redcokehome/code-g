package org.abstractmeta.code.g.core.generator;

import org.abstractmeta.code.g.core.builder.handler.field.IndexedCollectionFieldHandler;
import org.abstractmeta.code.g.core.builder.handler.field.RegistryFieldHandler;
import org.abstractmeta.code.g.core.builder.handler.type.EqualMethodHandler;
import org.abstractmeta.code.g.core.builder.handler.type.HashCodeMethodHandler;

/**
 * Represents ClassGeneratorConfig
 *
 * @author Arian Witas
 */
public class ClassGeneratorConfig implements EqualMethodHandler.Config, HashCodeMethodHandler.Config, RegistryFieldHandler.Config, IndexedCollectionFieldHandler.Config {

    private boolean generateEqualMethod;
    private boolean generateHashMethod;
    private int hashMultiplier;
    private String includeInHashAnnotation;
    private String registryCreateMapMethodName;
    private String registryFieldName;
    private boolean registryItemUseKeyProvider;
    private String registryKeyAnnotation;
    private String indexedCollectionItemKeyAnnotation;
    private boolean indexedCollectionUseCache;
    private boolean indexCollectionUseKeyProvider;
    private boolean generateBuilder;

    public boolean isGenerateEqualMethod() {
        return generateEqualMethod;
    }

    public void setGenerateEqualMethod(boolean generateEqualMethod) {
        this.generateEqualMethod = generateEqualMethod;
    }

    public boolean isGenerateHashMethod() {
        return generateHashMethod;
    }

    public void setGenerateHashMethod(boolean generateHashMethod) {
        this.generateHashMethod = generateHashMethod;
    }

    public int getHashMultiplier() {
        return hashMultiplier;
    }

    public void setHashMultiplier(int hashMultiplier) {
        this.hashMultiplier = hashMultiplier;
    }

    public String getIncludeInHashAnnotation() {
        return includeInHashAnnotation;
    }

    public void setIncludeInHashAnnotation(String includeInHashAnnotation) {
        this.includeInHashAnnotation = includeInHashAnnotation;
    }


    public String getRegistryCreateMapMethodName() {
        return registryCreateMapMethodName;
    }

    public void setRegistryCreateMapMethodName(String registryCreateMapMethodName) {
        this.registryCreateMapMethodName = registryCreateMapMethodName;
    }

    public String getRegistryFieldName() {
        return registryFieldName;
    }

    public void setRegistryKeyAnnotation(String registryKeyAnnotation) {
        this.registryKeyAnnotation = registryKeyAnnotation;
    }

    @Override
    public String getRegistryKeyAnnotation() {
        return registryKeyAnnotation;
    }

    public void setRegistryFieldName(String registryFieldName) {
        this.registryFieldName = registryFieldName;
    }

    public boolean isRegistryItemUseKeyProvider() {
        return registryItemUseKeyProvider;
    }

    public void setRegistryItemUseKeyProvider(boolean registryItemUseKeyProvider) {
        this.registryItemUseKeyProvider = registryItemUseKeyProvider;
    }

    public String getIndexedCollectionItemKeyAnnotation() {
        return indexedCollectionItemKeyAnnotation;
    }

    public void setIndexedCollectionItemKeyAnnotation(String indexedCollectionItemKeyAnnotation) {
        this.indexedCollectionItemKeyAnnotation = indexedCollectionItemKeyAnnotation;
    }

    public boolean isIndexedCollectionUseCache() {
        return indexedCollectionUseCache;
    }

    public void setIndexedCollectionUseCache(boolean indexedCollectionUseCache) {
        this.indexedCollectionUseCache = indexedCollectionUseCache;
    }

    public boolean isIndexCollectionUsePredicate() {
        return indexCollectionUseKeyProvider;
    }

    public void setIndexCollectionUseKeyProvider(boolean indexCollectionUseKeyProvider) {
        this.indexCollectionUseKeyProvider = indexCollectionUseKeyProvider;
    }

    public boolean isGenerateBuilder() {
        return generateBuilder;
    }

    public void setGenerateBuilder(boolean generateBuilder) {
        this.generateBuilder = generateBuilder;
    }

    @Override
    public String toString() {
        return "ClassGeneratorConfig{" +
                "generateEqualMethod=" + generateEqualMethod +
                ", generateHashMethod=" + generateHashMethod +
                ", hashMultiplier=" + hashMultiplier +
                ", includeInHashAnnotation='" + includeInHashAnnotation + '\'' +
                ", registryCreateMapMethodName='" + registryCreateMapMethodName + '\'' +
                ", registryFieldName='" + registryFieldName + '\'' +
                ", registryItemUseKeyProvider=" + registryItemUseKeyProvider +
                ", registryKeyAnnotation='" + registryKeyAnnotation + '\'' +
                ", indexedCollectionItemKeyAnnotation='" + indexedCollectionItemKeyAnnotation + '\'' +
                ", indexedCollectionUseCache=" + indexedCollectionUseCache +
                ", indexCollectionUseKeyProvider=" + indexCollectionUseKeyProvider +
                ", generateBuilder=" + generateBuilder +
                '}';
    }
}
