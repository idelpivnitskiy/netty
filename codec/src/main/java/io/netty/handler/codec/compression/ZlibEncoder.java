/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.codec.compression;

import io.netty.buffer.ByteBuf;

/**
 * Compresses a {@link ByteBuf} using the deflate algorithm.
 */
public abstract class ZlibEncoder extends AbstractClosableCompressionEncoder {

    protected ZlibEncoder(CompressionFormat format) {
        super(format, false);
        if (format == CompressionFormat.ZLIB_OR_NONE) {
            throw new IllegalArgumentException(
                    "format '" + CompressionFormat.ZLIB_OR_NONE + "' is not " +
                    "allowed for compression.");
        }
    }
}
