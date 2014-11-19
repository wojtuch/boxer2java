package com.github.wojtuch.boxer2java.models;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;

import com.github.wojtuch.boxer2java.models.unioninterfaces.DrsMergeAlfa;

public class Alfa implements DrsMergeAlfa
{
	@Attribute(name="type")
	private String type;

	@ElementListUnion({
			@ElementList(entry="drs", inline=true, type=Drs.class),
			@ElementList(entry="merge", inline=true, type=Merge.class),
			@ElementList(entry="alfa", inline=true, type=Alfa.class)
	})
	private List<DrsMergeAlfa> dmas;
	
	public Alfa()
	{	
	}


	public List<DrsMergeAlfa> getDMAAlternatives()
	{
		return dmas;
	}


	public void setDMAAlternatives(List<DrsMergeAlfa> dmas)
	{
		this.dmas = dmas;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
}
