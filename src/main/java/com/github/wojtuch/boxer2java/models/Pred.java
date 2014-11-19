package com.github.wojtuch.boxer2java.models;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import com.github.wojtuch.boxer2java.models.unioninterfaces.TNPCRPNOIW;

public class Pred implements TNPCRPNOIW
{
	@ElementList(inline=true, required=false)
	private List<Index> indexes;

	@Attribute(name="arg")
	private String arg;

	@Attribute(name="symbol")
	private String symbol;

	@Attribute(name="type")
	private String type;

	@Attribute(name="sense")
	private String sense;
	
	public Pred()
	{
	}

	public List<Index> getIndexes()
	{
		return indexes;
	}

	public void setIndexes(List<Index> indexes)
	{
		this.indexes = indexes;
	}

	public String getArg()
	{
		return arg;
	}

	public void setArg(String arg)
	{
		this.arg = arg;
	}

	public String getSymbol()
	{
		return symbol;
	}

	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getSense()
	{
		return sense;
	}

	public void setSense(String sense)
	{
		this.sense = sense;
	}
}
