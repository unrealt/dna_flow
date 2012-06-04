/**
 * 
 */
package com.jiuqi.dna.flow;

import com.jiuqi.dna.core.Context;

/**
 * @author huangkaibin
 *
 */
public interface IFlowAction {

	String getName();

	String getDescription();

	void run(Context context, IFlow flow, IFlowProcess process) throws Throwable;

}
