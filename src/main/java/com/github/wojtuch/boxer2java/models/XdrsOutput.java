package com.github.wojtuch.boxer2java.models;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="xdrs-output")
public class XdrsOutput
{
	@ElementList(inline=true)
	private List<Xdrs> xdrs;
	
	@Attribute(name="version")
	private String version;
	
	public XdrsOutput()
	{
	}

	
	public List<Xdrs> getXdrs()
	{
		return xdrs;
	}

	public void setXdrs(List<Xdrs> xdrs)
	{
		this.xdrs = xdrs;
	}


	public String getVersion()
	{
		return version;
	}


	public void setVersion(String version)
	{
		this.version = version;
	}
}
