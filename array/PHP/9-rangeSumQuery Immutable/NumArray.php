<?php
class NumArray
{
   private $prefix = [];
    /**
     * @param Integer[] $nums
     */
    function __construct($nums) {
        //[-2,0,3,-5,2,-1];
        $this->prefix[0] = $nums[0];
        $n = count($nums);
        for ($i = 1; $i < $n; $i++) {
                              //= -2 + 0 = -2
                              // -2 + 3 = 1
                              // 1 + -5 = -4
                             //prefix = [-2,-2,1,-4,-2,-3]

            $this->prefix[$i] = $this->prefix[$i - 1] + $nums[$i];
        }
    }

    /**
     * @param Integer $left
     * @param Integer $right
     * @return Integer
     */
    function sumRange($left, $right) {
        if ($left == 0){
            return $this->prefix[$right];
        }

        return $this->prefix[$right] - $this->prefix[$left - 1];
    }
}