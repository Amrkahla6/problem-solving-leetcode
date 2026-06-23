<?php


    $n = 2;

    print_r(firstBadVersion($n));

    function firstBadVersion($n)
    {
        $start = 1;
        $end = $n;

        while ($start <= $end){
            $mid = $end + intdiv($start - $end, 2);

            if (isBadVersion($mid)){
                $end = $mid;
            }else{
                $start = $mid + 1;
            }
        }

        return $start;
    }


