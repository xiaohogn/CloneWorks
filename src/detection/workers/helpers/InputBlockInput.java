package detection.workers.helpers;

import input.block.InputBlock;

public interface InputBlockInput {

	public InputBlock take();
	public boolean isPoisoned();
	
}
