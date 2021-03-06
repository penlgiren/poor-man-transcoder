package com.flashvisions.server.rtmp.transcoder.interfaces;

import java.util.ArrayList;

public interface IAudio extends IMutable {

	public ICodec getCodec();
	public void setCodec(ICodec codec);
	public ICodecImplementation getImplementation();
	public void setImplementation(ICodecImplementation implementation);
	public IAudioBitrate getBitrate();
	public void setBitrate(IAudioBitrate bitrate);
	public IAudioSampleRate getSamplerate();
	public void setSamplerate(IAudioSampleRate samplerate);
	public IAudioChannel getChannel();
	public void setChannel(IAudioChannel channels);
	public ArrayList<IParameter> getExtraParams();
	public void setExtraParams(ArrayList<IParameter> extraParams);
	public ArrayList<IProperty> getExtraProperties();
	public void setExtraProperties(ArrayList<IProperty> extraProperties);
}
