package com.github.wojtuch.boxer2java.models;

import org.simpleframework.xml.Element;

import com.github.wojtuch.boxer2java.models.unioninterfaces.DateTime;

public class Date implements DateTime
{
	@Element(name="date")
	private String date;
	
	public Date()
	{
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}
}
