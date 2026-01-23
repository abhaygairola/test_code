package com.learn;

import java.util.ArrayList;

public class compx_sort {

    private static void merge(int arr [],int top,int mid , int bottom){

        ArrayList<Integer> temp =new ArrayList<>();

        int i =top,j=mid+1;

        while(i<=mid && j<=bottom){

            if(arr[i]>=arr[j]){
                temp.add(arr[i]);
                i++;}
            else if(arr[j]>arr[i]){
                temp.add(arr[j]);
                j++;}
                }
            while(j<=bottom){
                temp.add(arr[j++]);
            }
            while(i<=mid){
                temp.add(arr[i++]);
            }

for(i=0;i<=bottom-top;i++){
    arr[top+i]=temp.get(i);
}


    }

    public static void merge_srt(int arr[],int top,int bottom){
        if(top>=bottom)return;

        int mid = (top+bottom)/2;
        
        merge_srt(arr, top, mid);
        merge_srt(arr, mid+1, bottom);
        
        merge(arr,top,mid,bottom);


    }
    
}
