<?php

    $array = [-1,0,3,5,9,12];
    $target = 9;

    print_r(search($array,$target));

    function search($nums,$target)
    {
        $countNum = count($nums);
        for ($i = 0; $i < $countNum; $i++){
            if ($nums[$i] == $target){
                return $i;
            }
        }

        return -1;
    }


