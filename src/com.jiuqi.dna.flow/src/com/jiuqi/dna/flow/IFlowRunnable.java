/**
 * 
 */
package com.jiuqi.dna.flow;

import com.jiuqi.dna.core.Context;

/**
 * @author huangkaibin
 *
 */
public interface IFlowRunnable {

	void run(Context context, IFlow flow, IFlowProcess process) throws Throwable;

}
