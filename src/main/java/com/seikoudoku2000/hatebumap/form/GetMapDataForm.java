package com.seikoudoku2000.hatebumap.form;

import org.seasar.struts.annotation.IntegerType;

public class GetMapDataForm {
	
	@IntegerType
	public int level = 10;
	
	@IntegerType
	public int minX = 584;
	
	@IntegerType
	public int minY = -209;
	
	@IntegerType
	public int maxX = 585;
	
	@IntegerType
	public int maxY = -208;
	
	@IntegerType
	public int hexLimit = 5;
}
