package com.learn;

public class quick_sortt {

    public static void qck_srt(Integer arr[],int low , int high){
        if (low>=high) return;

        int pivot = partition(arr,low,high);
        
        qck_srt(arr, low, pivot-1);
        qck_srt(arr, pivot+1, high);



    }

    private static int partition(Integer arr[],int low,int high){
        
    Integer pivot = arr[low];
    int pivot_psn= low;
    int x=low;
    
    for(int i = low+1; i<=high;i++){
        if(arr[i]<pivot){if(x==pivot_psn)pivot_psn=i;swap(arr, x++, i);}
    }
    swap(arr, pivot_psn, x);
    return x;
    }

    private static void swap(Integer arr[],int z, int y){
        Integer temp= arr[z];
        arr[z]=arr[y];
        arr[y]= temp;

    }
    
}
