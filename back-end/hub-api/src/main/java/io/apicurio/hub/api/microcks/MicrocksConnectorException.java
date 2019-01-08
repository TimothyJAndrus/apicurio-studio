/*
 * Copyright 2019 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apicurio.hub.api.microcks;

/**
 * Exception related to Microcks backend connnection.
 * @author laurent.broudoux@gmail.com
 */
public class MicrocksConnectorException extends Exception {

   /**
    * Cerate a MicrocksConnectorException with text message
    * @param message This exception text message
    */
   public MicrocksConnectorException(String message) {
      super(message);
   }
}
