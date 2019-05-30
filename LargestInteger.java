 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int x = integers [0];
        int y = integers.length;
        
        for (int i = 1; i < y; i++){
            if (integers[i] > x){
                x = integers [i];
    }
}
    return x;
}

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int x = integers [0];
        int y = integers.length;
        
        for (int i = 1; i < y; i++){
            x = Math.max (integers[i], x);
    }
    return x;
}
}
