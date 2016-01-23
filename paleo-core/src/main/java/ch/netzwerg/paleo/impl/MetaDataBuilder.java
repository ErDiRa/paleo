/*
 * Copyright 2016 Rahel Lüthy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.netzwerg.paleo.impl;

import javaslang.collection.Map;

import java.util.LinkedHashMap;
import java.util.Objects;

public final class MetaDataBuilder {

    private final java.util.LinkedHashMap<String, String> metaData = new LinkedHashMap<>();

    public void withMetaData(Map<String, String> metaData) {
        Objects.requireNonNull(metaData, "metaData is null");
        this.metaData.clear();
        metaData.forEach(t -> this.metaData.put(t._1, t._2));
    }

    public javaslang.collection.LinkedHashMap<String, String> build() {
        return LinkedHashMapUtil.ofAll(metaData);
    }

}
