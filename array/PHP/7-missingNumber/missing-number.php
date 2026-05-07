<?php

$nums = [9,6,4,2,3,5,7,0,1];

    print_r(missingNumber($nums));

    function missingNumber($nums)
    {
        $n = count($nums);
        $expectedSum= $n * ($n + 1) / 2;
        $actualSum = 0;
        foreach ($nums as $num) {
            $actualSum += $num;
        }

        return $expectedSum - $actualSum;
    }


