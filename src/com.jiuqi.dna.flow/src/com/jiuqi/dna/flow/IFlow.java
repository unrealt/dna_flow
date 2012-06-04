/**
 * 
 */
package com.jiuqi.dna.flow;

/**
 * 
 * @author huangkaibin
 *
 */
public interface IFlow {

	void addActionListener(IFlowActionListener listener, String namePattern);

	void removeActionListener(IFlowActionListener listener);

}
