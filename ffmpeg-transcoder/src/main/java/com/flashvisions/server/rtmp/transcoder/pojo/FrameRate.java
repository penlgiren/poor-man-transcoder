package com.flashvisions.server.rtmp.transcoder.pojo;

import java.io.Serializable;

import com.flashvisions.server.rtmp.transcoder.pojo.base.PassThru;

public class FrameRate extends PassThru implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -276324663480345326L;
	private int framerate;

	public FrameRate(){
	}
	
	public FrameRate(int framerate){
		this.framerate = framerate;
	}
	
	public FrameRate(boolean sameAsSource){
		this.setSameAsSource(sameAsSource);
		this.framerate = -1;
	}

	public int getFramerate() 
	{
		return framerate;
	}

	public void setFramerate(int framerate) 
	{
		this.framerate = framerate;
	} 

}
