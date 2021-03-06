/* -*-mode:java; c-basic-offset:2; indent-tabs-mode:nil -*- */
/*
Copyright (c) 2002-2010 ymnk, JCraft,Inc. All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

  1. Redistributions of source code must retain the above copyright notice,
     this list of conditions and the following disclaimer.

  2. Redistributions in binary form must reproduce the above copyright 
     notice, this list of conditions and the following disclaimer in 
     the documentation and/or other materials provided with the distribution.

  3. The names of the authors may not be used to endorse or promote products
     derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL JCRAFT,
INC. OR ANY CONTRIBUTORS TO THIS SOFTWARE BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package com.jcraft.jsch;

/**
 * <p>SignatureDSA interface.</p>
 *
 * @author <a href="https://github.com/ymnk"">Atsuhiko Yamanaka</a>
 * @version $Id: $Id
 */
public interface SignatureDSA{
  /**
   * <p>init.</p>
   *
   * @throws java.lang.Exception if any.
   * @since 0.1.53
   */
  void init() throws Exception;
  /**
   * <p>setPubKey.</p>
   *
   * @param y an array of byte.
   * @param p an array of byte.
   * @param q an array of byte.
   * @param g an array of byte.
   * @throws java.lang.Exception if any.
   */
  void setPubKey(byte[] y, byte[] p, byte[] q, byte[] g) throws Exception;
  /**
   * <p>setPrvKey.</p>
   *
   * @param x an array of byte.
   * @param p an array of byte.
   * @param q an array of byte.
   * @param g an array of byte.
   * @throws java.lang.Exception if any.
   */
  void setPrvKey(byte[] x, byte[] p, byte[] q, byte[] g) throws Exception;
  /**
   * <p>update.</p>
   *
   * @param H an array of byte.
   * @throws java.lang.Exception if any.
   */
  void update(byte[] H) throws Exception;
  /**
   * <p>verify.</p>
   *
   * @param sig an array of byte.
   * @return a boolean.
   * @throws java.lang.Exception if any.
   */
  boolean verify(byte[] sig) throws Exception;
  /**
   * <p>sign.</p>
   *
   * @return an array of byte.
   * @throws java.lang.Exception if any.
   */
  byte[] sign() throws Exception;
}
