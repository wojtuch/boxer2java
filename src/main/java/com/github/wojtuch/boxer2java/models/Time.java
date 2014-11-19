package com.github.wojtuch.boxer2java.models;

import org.simpleframework.xml.Element;

import com.github.wojtuch.boxer2java.models.unioninterfaces.DateTime;

public class Time implements DateTime
{
	@Element(name="time")
	private String time;
	
	public Time()
	{
	}

	public String getTime()
	{
		return time;
	}

	public void setTime(String time)
	{
		this.time = time;
	}
}
