<?php

    $array = [2,7,11,15];
    $target = 9;

    print_r(twoSum($array,$target));

    function twoSum($nums,$target)
    {
        $map = [];
        foreach ($nums as $i => $num) {
            $complement = $target - $num;
            if (isset($map[$complement])) {
                return [$map[$complement], $i];
            }
            $map[$num] = $i;
        }
        return [];
    }


