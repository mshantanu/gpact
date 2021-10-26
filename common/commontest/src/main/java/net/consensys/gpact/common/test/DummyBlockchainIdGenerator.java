/*
 * Copyright 2021 ConsenSys Software Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package net.consensys.gpact.common.test;

import org.apache.tuweni.bytes.Bytes;

import java.math.BigInteger;
import java.util.Random;

public class DummyBlockchainIdGenerator {

    public static BigInteger gen() {
        Random notVeryRandom = new Random();
        byte[] bcId = new byte[32];
        notVeryRandom.nextBytes(bcId);
        return new BigInteger(1, bcId);
    }
}
