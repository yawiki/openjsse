/*
 * Copyright (c) 1998, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * Copyright 2019 Azul Systems, Inc.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.openjsse.java.security.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/**
 * This class extends java.security.spec.RSAPrivateKeySpec class
 * to implement RSASSA-PSS signature algorithms
 */

public class RSAPrivateKeySpec extends java.security.spec.RSAPrivateKeySpec {

    private final AlgorithmParameterSpec params;

    /**
     * Creates a new RSAPrivateKeySpec.
     *
     * @param modulus the modulus
     * @param privateExponent the private exponent
     */
    public RSAPrivateKeySpec(BigInteger modulus, BigInteger privateExponent) {
        this(modulus, privateExponent, null);
    }

    /**
     * Creates a new RSAPrivateKeySpec with additional key parameters.
     *
     * @param modulus the modulus
     * @param privateExponent the private exponent
     * @param params the parameters associated with this key, may be null
     * @since 11
     */
    public RSAPrivateKeySpec(BigInteger modulus, BigInteger privateExponent,
            AlgorithmParameterSpec params) {
        super(modulus, privateExponent);
        this.params = params;
    }

    /**
     * Returns the parameters associated with this key, may be null if not
     * present.
     *
     * @return the parameters associated with this key
     * @since 11
     */
    public AlgorithmParameterSpec getParams() {
        return this.params;
    }
}
