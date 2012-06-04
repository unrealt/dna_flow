/**
 * 
 */
package com.jiuqi.dna.flow;

import com.jiuqi.dna.core.Context;

/**
 * @author huangkaibin
 *
 */
public interface IFlowExecutor {

	IFlow getFlow();

	IFlowProcess getProcess();

	void submitAction(Context context, IFlowAction action) throws Throwable;

}
