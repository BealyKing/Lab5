package LAB5;

import java.util.*;

public class DataStorage<T>{
	
	private int size;
	private Object[] data;

	
	public DataStorage(int capacity){
		data = new Object[capacity];
		size = 0;
	}
	
	public void add(T element){
		if(!contains(element)){
			if(size < data.length){
				data[size++] = element;
			}else{
				System.out.println("Массив полон");
			}
		}else{
			System.out.println("Элемент:" + element + " уже есть");
		}
	}
	
	public boolean contains(T element){
		for (int i = 0; i < size; i++) {
			if(data[i].equals(element))
				return true;
		}
		
		return false;
	}
	
	//
	public boolean remove(T element) {
	    for (int i = 0; i < size; i++) {
	        if (data[i].equals(element)) {
	            // Сдвиг элементов после удаления
	            for (int j = i; j < size - 1; j++) {
	                data[j] = data[j + 1]; // Перемещаем элементы на одну позицию влево
	            }
	            data[size - 1] = null; // Освобождаем память для последнего элемента
	            size--; // Уменьшаем размер хранилища
	            return true;
	        }
	    }
	    return false; // Если элемент не найден
	}
	
	public void info(){
		if (size == 0){
			System.out.println("Массив пуст");
		}else{
			System.out.println("Элементы массива:");
			for (int i = 0; i < size; i++){
				System.out.println(data[i]);
			}
		}
	}
	
}