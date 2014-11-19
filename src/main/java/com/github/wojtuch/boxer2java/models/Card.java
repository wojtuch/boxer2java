package com.github.wojtuch.boxer2java.models;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import com.github.wojtuch.boxer2java.models.unioninterfaces.TNPCRPNOIW;

public class Card implements TNPCRPNOIW
{
	@Attribute(name="arg")
	private String arg;

	@Attribute(name="value")
	private String value;

	@Attribute(name="type")
	private String type;
	
	@ElementList(inline=true, required=false)
	private List<Index> indexes;
	
	public Card()
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

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public List<Index> getIndexes()
	{
		return indexes;
	}

	public void setIndexes(List<Index> indexes)
	{
		this.indexes = indexes;
	}
}
