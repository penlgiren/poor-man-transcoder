package com.flashvisions.server.rtmp.transcoder.interfaces;

import java.io.File;

import com.flashvisions.server.rtmp.transcoder.exception.TranscoderException;

public interface ITranscoderFacade {

	public void init() throws TranscoderException;
	
	public void setFFmpegPath(String ffmpegPath);
	public String getFFmpegPath();
	
	public void setOperatingMediaServer(String serverName);
	public String getOperatingMediaServer();
	
	public void setWorkingDirectory(String workingDirectoryPath);
	public String getWorkingDirectory();
	
	public void setHomeDirectory(String homeDirectoryPath);
	public String getHomeDirectory();
	
	public void setTemplateDirectory(String templateDirectoryPath);
	public String getTemplateDirectory();
	
	public void doTranscode(ITranscoderResource input, String usingTemplate) throws TranscoderException;
	public void doTranscode(ITranscoderResource input, String usingTemplate, File workingDirectory) throws TranscoderException;
	
	public void abortTranscode();
}
