package com.concepts.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CheckMagaZine {
	
	
	// Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        List<String> list = new ArrayList<>();
        for(int i=0; i< note.length;i++){
            for(int j =i; j< magazine.length;j++){
                if(note[i] == magazine[j]){
                    list.add(note[i]);
                }
            }
            
        }
        if(list.size() == note.length){
                System.out.println("Yes");
        }else{
            System.out.println("No");

        }
        
    }
    
    public static void main(String[] args) {
    	checkMagazine(new String[] {"give", "me", "one", "grand", "today", "night"}, new String[] {"give", "one", "grand", "today"});
	}

}
