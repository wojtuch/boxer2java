package com.github.wojtuch.boxer2java.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Netag
{
	@Attribute(name="index")
	private String index;
	
	@Text
	private String netag;
	
	public Netag()
	{
	}
	

	public String getIndex()
	{
		return index;
	}

	public void setIndex(String index)
	{
		this.index = index;
	}

	public String getNetag()
	{
		return netag;
	}

	public void setNetag(String netag)
	{
		this.netag = netag;
	}
}
