package com.flashvisions.server.rtmp.transcoder.pojo.base;

import com.flashvisions.server.rtmp.transcoder.interfaces.IPassThru;

public abstract class PassThru extends TranscoderEntity implements IPassThru {

	private boolean sameAsSource;
	
	public void setSameAsSource(boolean same) {
		// TODO Auto-generated method stub
		sameAsSource = same;
	}

	public boolean getSameAsSource() {
		// TODO Auto-generated method stub
		return sameAsSource;
	}

}
