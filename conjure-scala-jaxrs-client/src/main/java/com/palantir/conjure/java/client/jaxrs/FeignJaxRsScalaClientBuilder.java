/*
 * (c) Copyright 2017 Palantir Technologies Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.conjure.java.client.jaxrs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.palantir.conjure.java.client.config.ClientConfiguration;
import com.palantir.conjure.java.serialization.ScalaObjectMappers;

public final class FeignJaxRsScalaClientBuilder extends AbstractFeignJaxRsClientBuilder {

    private static final ObjectMapper JSON_OBJECT_MAPPER = ScalaObjectMappers.newClientObjectMapper();
    private static final ObjectMapper CBOR_OBJECT_MAPPER = ScalaObjectMappers.newCborClientObjectMapper();

    FeignJaxRsScalaClientBuilder(ClientConfiguration config) {
        super(config);
    }

    @Override
    protected ObjectMapper getObjectMapper() {
        return JSON_OBJECT_MAPPER;
    }

    @Override
    protected ObjectMapper getCborObjectMapper() {
        return CBOR_OBJECT_MAPPER;
    }
}
