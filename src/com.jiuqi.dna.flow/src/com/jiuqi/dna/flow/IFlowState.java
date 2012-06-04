/**
 * 
 */
package com.jiuqi.dna.flow;

import com.jiuqi.dna.core.Context;

/**
 * @author huangkaibin
 *
 */
public interface IFlowState {

	String getName();

	String getDescription();

	String getTypeId();

	void actionFinished(Context context, IFlow flow, String actionName,
			IFlowExecutor actionExecutor) throws Throwable;

}
