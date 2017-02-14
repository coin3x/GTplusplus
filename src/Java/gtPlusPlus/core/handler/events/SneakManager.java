package gtPlusPlus.core.handler.events;

import gtPlusPlus.core.util.Utils;
import net.minecraft.client.Minecraft;

public class SneakManager {

	//We make this a singleton for clientside data storage.
	public static SneakManager instance = new SneakManager();
	protected static final Minecraft mc = Minecraft.getMinecraft();
	public static boolean		canSprint		= true;
	public static boolean		isSneaking		= true;
	public static boolean		optionDoubleTap			= true;
	public static boolean		wasSprintDisabled		= false;

	private static State Sprinting = State.ON;
	private static State Crouching = State.OFF;

	public static boolean Sneaking(){
		return Crouching.getState();
	}

	public static boolean Sprinting(){
		return Sprinting.getState();
	}

	public static State getSneakingState(){
		return Crouching;
	}

	public static State getSprintingDisabledState(){
		return Sprinting;
	}

	public static void toggleSneaking(){
		toggleState(Crouching);
	}

	public static void toggleSprinting(){
		toggleState(Sprinting);
	}

	private static State toggleState(State state){
		Utils.LOG_INFO("State Toggle");
		if (state == State.ON) {
			return State.OFF;
		}		
		return State.ON;
	}

	public static State setCrouchingStateON(){
		return Crouching = State.ON;
	}

	public static State setCrouchingStateOFF(){
		return Crouching = State.OFF;
	}

	public static State setSprintingStateON(){
		return Sprinting = State.ON;
	}

	public static State setSprintingStateOFF(){
		return Sprinting = State.OFF;
	}

	public static enum State {
		ON(true),
		OFF(false);

		private boolean STATE;
		private State (final boolean State)
		{
			this.STATE = State;
		}

		public boolean getState() {
			return STATE;
		}

	}

}
