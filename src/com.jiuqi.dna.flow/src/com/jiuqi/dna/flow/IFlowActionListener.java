/**
 * 
 */
package com.jiuqi.dna.flow;

import org.eclipse.core.runtime.IProgressMonitor;

import com.jiuqi.dna.core.Context;

/**
 * @author huangkaibin
 *
 */
public interface IFlowActionListener {

	void before(Context context, IFlow flow, IFlowProcess process,
			IProgressMonitor monitor) throws Throwable;

	void after(Context context, IFlow flow, IFlowProcess process,
			IProgressMonitor monitor) throws Throwable;

}
