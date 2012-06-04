/**
 * 
 */
package com.jiuqi.dna.internal.flow;

import com.jiuqi.dna.core.Context;
import com.jiuqi.dna.flow.IFlow;
import com.jiuqi.dna.flow.IFlowAction;
import com.jiuqi.dna.flow.IFlowProcess;
import com.jiuqi.dna.flow.IFlowRunnable;

/**
 * @author huangkaibin
 *
 */
public class FlowAction implements IFlowAction {

	private String name;

	private String description;

	private IFlowRunnable runnable;

	public FlowAction(String name, String description, IFlowRunnable runnable) {
		this.name = name;
		this.description = description;
		this.runnable = runnable;
	}

	/* (non-Javadoc)
	 * @see com.jiuqi.dna.flow.IFlowAction#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see com.jiuqi.dna.flow.IFlowAction#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see com.jiuqi.dna.flow.IFlowAction#run(com.jiuqi.dna.core.Context, com.jiuqi.dna.flow.IFlow, com.jiuqi.dna.flow.IFlowProcess)
	 */
	@Override
	public void run(Context context, IFlow flow, IFlowProcess process) throws Throwable {
		runnable.run(context, flow, process);
	}

}
