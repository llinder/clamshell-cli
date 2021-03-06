/*
 * #%L
 * clamshell-api
 * %%
 * Copyright (C) 2011 ClamShell-Cli
 * %%
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
 * #L%
 */
package org.clamshellcli.api;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * This component represents a console object used for input/output interactivity.
 * @author vladimir.vivien
 */
public interface IOConsole extends Plugin{
    /**
     * Getter for the console's internal InputStream instance.  Most implementation
     * will return System.in.
     * @return InputStream
     */
    public InputStream getInputStream();
    
    /**
     * Getter for the console's internal OutputStream instance.  Most implementation
     * will return System.out.
     * @return OutputStream
     */
    public OutputStream getOutputStream();
    
    /**
     * Prompts user to provide an input from the console.
     * @param prompt the prompt value displayed 
     * @return  the value read from console's input
     */
    public String readInput(String prompt);
   
    /**
     * Writes a string value to the console's output stream.
     * @param value value to be written
     */
    public void writeOutput(String value);
}
