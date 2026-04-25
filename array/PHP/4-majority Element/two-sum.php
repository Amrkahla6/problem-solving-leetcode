<?php

$nums = [2,2,1,1,1,2,2];

    print_r(majorityElement($nums));

    function majorityElement($nums)
    {
        $candidate = 0;
        $count = 0;
        foreach ($nums as $num) {
            if ($count == 0){
                $candidate = $num;
            }

            if ($candidate == $num) {
                $count ++;
            }else{
                $count --;
            }
        }

        return $candidate;

    }


