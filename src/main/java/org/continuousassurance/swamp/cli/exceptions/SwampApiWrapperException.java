/*
*  java-cli
*
*  Copyright 2016 Vamshi Basupalli <vamshi@cs.wisc.edu>, Malcolm Reid <mreid3@wisc.edu>, Jared Sweetland <jsweetland@wisc.edu>
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

package org.continuousassurance.swamp.cli.exceptions;

public abstract class SwampApiWrapperException  extends RuntimeException {
	SwampApiWrapperExitCodes exit_code;
	
	SwampApiWrapperException(Exception exception){
		super(exception.getMessage());
		this.setStackTrace(exception.getStackTrace());
	}
	
	SwampApiWrapperException(String msg){
	    super(msg);
	}
	
	public void setExitCode(SwampApiWrapperExitCodes ec){
		exit_code = ec;
	}

	public int getExitCode(){
		return exit_code.getExitCode();
	}
}
