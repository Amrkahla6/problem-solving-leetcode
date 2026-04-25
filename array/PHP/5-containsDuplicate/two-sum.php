<?php

$nums = [1,2,3,4];

    print_r(containsDuplicate($nums));

    function containsDuplicate($nums)
    {
        sort($nums);
        for ($i = 0; $i < count($nums); $i++) {
            if ($nums[$i] == $nums[$i + 1]) {
                return "true";
            }
        }

        return "false";
    }


