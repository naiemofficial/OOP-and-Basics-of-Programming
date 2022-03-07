class calculateInsideConcat {
    public static void main(String[] args) {
        System.out.println( "Sum is = " + (2+3) );
    }
}
/*
 * ===================================
 * System.out.println(2+3); 
 * :::Result::: 5
 * [Note: It will return valid calculation result]
 * 
 * System.out.println("Sum is = " + 2+3); 
 * :::Result::: Sum is = 23
 * [Note: It's an invalid calculation because the concatenation will combind the all data with plus '+'. So calculation won't work here.
 * In that case, you need to wrap the calculation area with parentheses like (2+2)]
 */