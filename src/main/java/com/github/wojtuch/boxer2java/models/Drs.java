package com.github.wojtuch.boxer2java.models;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;

import com.github.wojtuch.boxer2java.models.unioninterfaces.DrsMergeAlfa;
import com.github.wojtuch.boxer2java.models.unioninterfaces.TNPCRPNOIW;

public class Drs implements DrsMergeAlfa
{
	@ElementList(inline=true, required=false)
	private List<Dr> drs;
	
	@ElementListUnion({
			@ElementList(entry="timex", inline=true, required=false, type=Timex.class),
			@ElementList(entry="named", inline=true, required=false, type=Named.class),
			@ElementList(entry="pred", inline=true, required=false, type=Pred.class),
			@ElementList(entry="card", inline=true, required=false, type=Card.class),
			@ElementList(entry="rel", inline=true, required=false, type=Rel.class),
			@ElementList(entry="prop", inline=true, required=false, type=Prop.class),
			@ElementList(entry="not", inline=true, required=false, type=Not.class),
			@ElementList(entry="or", inline=true, required=false, type=Or.class),
			@ElementList(entry="imp", inline=true, required=false, type=Imp.class),
			@ElementList(entry="whq", inline=true, required=false, type=Whq.class)
	})
	private List<TNPCRPNOIW> alternatives;
	
	public Drs()
	{
	}

	public List<Dr> getDrs()
	{
		return drs;
	}

	public void setDrs(List<Dr> drs)
	{
		this.drs = drs;
	}

	public List<TNPCRPNOIW> getAlternatives()
	{
		return alternatives;
	}

	public void setAlternatives(List<TNPCRPNOIW> alternatives)
	{
		this.alternatives = alternatives;
	}	
}
