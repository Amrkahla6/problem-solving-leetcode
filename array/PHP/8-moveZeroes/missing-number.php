<?php

$nums = [0,1,0,3,12];

    moveZeroes($nums);

    function moveZeroes($nums)
    {
        $insertPosition =0;

        for ($i=0; $i < count($nums); $i++){
            if ($nums[$i] != 0){
                $nums[$insertPosition] = $nums[$i];
                $insertPosition++;
            }
        }

        while ($insertPosition < count($nums)){
            $nums[$insertPosition] = 0;
            $insertPosition++;
        }

        print_r($nums);
    }


