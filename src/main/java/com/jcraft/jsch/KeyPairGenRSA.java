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
 * <p>KeyPairGenRSA interface.</p>
 *
 * @author <a href="https://github.com/ymnk"">Atsuhiko Yamanaka</a>
 * @version $Id: $Id
 */
public interface KeyPairGenRSA{
  /**
   * <p>init.</p>
   *
   * @param key_size a int.
   * @throws java.lang.Exception if any.
   */
  void init(int key_size) throws Exception;
  /**
   * <p>getD.</p>
   *
   * @return an array of byte.
   */
  byte[] getD();
  /**
   * <p>getE.</p>
   *
   * @return an array of byte.
   */
  byte[] getE();
  /**
   * <p>getN.</p>
   *
   * @return an array of byte.
   */
  byte[] getN();

  /**
   * <p>getC.</p>
   *
   * @return an array of byte.
   */
  byte[] getC();
  /**
   * <p>getEP.</p>
   *
   * @return an array of byte.
   */
  byte[] getEP();
  /**
   * <p>getEQ.</p>
   *
   * @return an array of byte.
   */
  byte[] getEQ();
  /**
   * <p>getP.</p>
   *
   * @return an array of byte.
   */
  byte[] getP();
  /**
   * <p>getQ.</p>
   *
   * @return an array of byte.
   */
  byte[] getQ();
}
