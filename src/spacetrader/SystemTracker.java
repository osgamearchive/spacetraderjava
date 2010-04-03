package spacetrader;

import spacetrader.enums.StarSystemId;

public interface SystemTracker
{
	void SelectNextSystemWithinRange(boolean forward);
 	StarSystem TrackedSystem();

	boolean TargetWormhole();
	void TargetWormhole(boolean value);
	StarSystem WarpSystem();

	void selectTargetWormholeFrom(StarSystemId value);

	StarSystem[] Universe();
	int[] Wormholes();
	StarSystem SelectedSystem();

	StarSystemId SelectedSystemId();
	void SelectedSystemId(StarSystemId value);
	void setSelectedSystemByName(String value, boolean track);

	void setCanSuperWarp(boolean canSuperWarp);
	boolean getCanSuperWarp();
	void jumpWithSingularity();
	void jumpWithoutSingularity();
	void setTrackedSystemId(StarSystemId trackedSystemId);

	// TODO this is UI method, needs to be removed from here, implmntd in UI.
	boolean isShowTrackedRange();
}
