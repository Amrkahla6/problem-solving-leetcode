<?php

$nums = [1,2,3,1];

    print_r(containsDuplicate($nums));

    function containsDuplicate($nums)
    {
       $set = [];
       foreach ($nums as $num) {
           if (isset($set[$num])) {
               return "true";
           }
           $set[$num] = true;
       }

       return "false";
    }


