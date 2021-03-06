package com.flashvisions.server.rtmp.transcoder.interfaces;

import java.io.IOException;

public interface IOverlay extends IMutable {

	public String getLabel();
	public void setLabel(String label);
	public int getZindex();
	public void setZindex(int zindex);
	public String getOverlayImagePath();
	public void setOverlayImagePath(String overlayImagePath) throws IOException;
	public int getOpacity();
	public void setOpacity(int opacity);
	public IOverlayLocation getLocation();
	public void setLocation(IOverlayLocation location);
	public int getOverlayImageHeight();
	public int getOverlayImageWidth();
}
