package com.github.wojtuch.boxer2java.models;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import com.github.wojtuch.boxer2java.models.unioninterfaces.TNPCRPNOIW;

public class Rel implements TNPCRPNOIW
{
	@ElementList(inline=true, required=false)
	private List<Index> indexes;

	@Attribute(name="arg1")
	private String arg1;

	@Attribute(name="arg2")
	private String arg2;

	@Attribute(name="symbol")
	private String symbol;

	@Attribute(name="sense")
	private String sense;
	
	public Rel()
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

	public String getArg1()
	{
		return arg1;
	}

	public void setArg1(String arg1)
	{
		this.arg1 = arg1;
	}

	public String getSymbol()
	{
		return symbol;
	}

	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	public String getArg2()
	{
		return arg2;
	}

	public void setArg2(String arg2)
	{
		this.arg2 = arg2;
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
