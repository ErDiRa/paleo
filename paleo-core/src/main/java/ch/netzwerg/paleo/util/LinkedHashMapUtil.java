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

package ch.netzwerg.paleo.util;

import javaslang.Tuple2;
import javaslang.collection.LinkedHashMap;

import java.util.stream.Stream;

// TODO: Replace once Javaslang RC3 is out
public final class LinkedHashMapUtil {

    public static LinkedHashMap<String, String> ofAll(java.util.Map<String, String> javaMap) {
        Stream<Tuple2<String, String>> entries = javaMap.entrySet().stream().map(e -> new Tuple2<>(e.getKey(), e.getValue()));
        return entries.collect(LinkedHashMap.collector());
    }

}
