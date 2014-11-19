package com.github.wojtuch.boxer2java.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;

import com.github.wojtuch.boxer2java.models.unioninterfaces.DateTime;
import com.github.wojtuch.boxer2java.models.unioninterfaces.TNPCRPNOIW;

public class Timex implements TNPCRPNOIW
{
	@Attribute(name="arg")
	private String arg;
	
	@ElementUnion({
		@Element(name="date", type=Date.class),
		@Element(name="time", type=Time.class)
	})
	private DateTime dateTime;
	
	public Timex()
	{
	}

	public String getArg()
	{
		return arg;
	}

	public void setArg(String arg)
	{
		this.arg = arg;
	}

	public DateTime getDateTimeAlternative()
	{
		return dateTime;
	}

	public void setDateTimeAlternative(DateTime dateTime)
	{
		this.dateTime = dateTime;
	}
}
