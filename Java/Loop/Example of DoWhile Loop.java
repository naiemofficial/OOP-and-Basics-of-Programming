class do_while_loop {
    public static void main(String[] args){
        // print 1 - 10
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);
        /* 
         * Difference between while and do_while loop:
         * =================================================
         * WHILE    => check the condition first then go to the loop body if it's true
         * DO_WHILE => execute the loop body for a single time
         *             then check the condition and go to the loop body again if it's true
         */
    }
}