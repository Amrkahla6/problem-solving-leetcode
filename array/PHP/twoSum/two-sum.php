<?php

    $array = [2,7,11,15];
    $target = 9;

    print_r(sum($array,$target));

    function sum($nums,$target)
    {
        for ($i=0; $i < count($nums); $i++) {
            for ($j= $i+1; $j < count($nums); $j++) {
                if($nums[$i] + $nums[$j] == $target) {
                    return [$i, $j];
                }
            }
        }
        return [];
    }


