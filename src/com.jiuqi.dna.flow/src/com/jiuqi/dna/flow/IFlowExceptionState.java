/**
 * 
 */
package com.jiuqi.dna.flow;

import com.jiuqi.dna.core.Context;

/**
 * @author huangkaibin
 *
 */
public interface IFlowExceptionState {

	String getName();

	String getNamePattern();

	String getDescription();

	String getTypeId();

	void actionFailed(Context context, IFlow flow, String actionName,
			Throwable cause, IFlowExecutor actionExecutor) throws Throwable;

}
