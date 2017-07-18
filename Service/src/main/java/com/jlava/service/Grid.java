package com.jlava.service;
import com.jlava.model.*;

public interface Grid {
	
	void print();
	
	void edit(int option, int xIndex, int yIndex, String newVal);
    
    void edit(int xIndex, int yIndex, String newKey, String newVal);
	
	void addUpdate(int cols, MapKey[] key, String[] values);
	
	void sort(int col);
	
	void search(String sub);

    String getFileName();
    
    int getMaxY(int xIndex);
    int getMaxX();
}
