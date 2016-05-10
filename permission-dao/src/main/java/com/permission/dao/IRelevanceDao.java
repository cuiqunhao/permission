package com.permission.dao;

import java.util.Map;

public interface IRelevanceDao {
	 void DeleteBy(String key, Integer... firstIds);
	 
     void AddRelevance(String key, Map<Integer, Integer>  idMaps);
}
