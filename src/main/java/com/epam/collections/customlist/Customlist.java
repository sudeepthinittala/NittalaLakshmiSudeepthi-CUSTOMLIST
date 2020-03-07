package com.epam.collections.customlist;

import java.util.AbstractList;
import java.util.Arrays;

public @SuppressWarnings("serial") class Customlist<T> extends AbstractList<T>implements java.io.Serializable{

	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object [] arr;

	Customlist() {
        arr =new Object[DEFAULT_CAPACITY];
    }
    public boolean add(T t) {
        if (size == arr.length) {
            addCapacity();
        }
        arr[size++] = t;
		return true;
    }
    
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("index: " + index + ", size " + index);
        }
        return (T) arr[index];
	}

	@Override
	public int size() {
		
		 return size;
	}
	@SuppressWarnings("unchecked")
	public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("index: " + index + ", size " + index);
        }
        Object item = arr[index];
        int numofele = arr.length - ( index + 1 ) ;
        System.arraycopy( arr, index + 1, arr, index, numofele ) ;
        size--;
        return (T) item;
    }
	public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(arr[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
	  private void addCapacity() {
	        int newSize = arr.length * 2;
	        arr = Arrays.copyOf(arr, newSize);
	   }

}
