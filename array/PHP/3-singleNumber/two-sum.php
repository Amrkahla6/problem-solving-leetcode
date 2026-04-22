<?php

$nums = [4,1,2,1,2];

    print_r(singleNumber($nums));

    function singleNumber($nums)
    {
       $result = 0;

       foreach ($nums as $num) {
           $result ^= $num;
       }

       return $result;
    }


