/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.milvus.v2.client;

import io.milvus.v2.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MilvusClientV2Test extends BaseTest {

    @Test
    void testMilvusClientV2() {
    }
    @Test
    void testUseDatabase() {
        try {
            client_v2.useDatabase("test");
        }catch (Exception e) {
            Assertions.assertEquals("Database test not exist", e.getMessage());
        }

    }
    @Test
    void testListDatabase() {
        List<String> dbNames = client_v2.listDatabase();
        Assertions.assertEquals(dbNames.get(0), "default");
    }

}
