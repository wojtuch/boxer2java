package com.github.wojtuch.boxer2java.models;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementUnion;

import com.github.wojtuch.boxer2java.models.unioninterfaces.DrsMergeAlfa;
import com.github.wojtuch.boxer2java.models.unioninterfaces.TNPCRPNOIW;

public class Not implements TNPCRPNOIW
{
	@ElementList(inline=true, required=false)
	private List<Index> indexes;

	
	@ElementUnion({
		@Element(name="merge", type=Merge.class),
		@Element(name="drs", type=Drs.class),
		@Element(name="alfa", type=Alfa.class)
	})
	private DrsMergeAlfa dma;
	
	public Not()
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

	public DrsMergeAlfa getDMAAlternative()
	{
		return dma;
	}

	public void setDMAAlternative(DrsMergeAlfa dma)
	{
		this.dma = dma;
	}
}
