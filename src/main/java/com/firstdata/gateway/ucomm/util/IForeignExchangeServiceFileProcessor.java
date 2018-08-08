package com.firstdata.gateway.ucomm.util;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IForeignExchangeServiceFileProcessor<T>
{	
	public List<T> parseCSVToBeanList(String fileName, Map<String,String> headerColumnMap, Class<T> t) throws IOException;
}
