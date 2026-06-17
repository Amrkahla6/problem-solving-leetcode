<?php

$nums = [4,3,2,7,8,2,3,1];

print_r(findDisappearedNumbers($nums));

/**
 * @param Integer[] $nums
 * @return Integer[]
 */
function findDisappearedNumbers($nums) {
    $set = [];
    $missing = [];

    foreach ($nums as $num) {
        $set[$num] = true;
    }

    $n = count($nums);

    for ($i = 1; $i <= $n; $i++) {
        if (!isset($set[$i])) {
            $missing[] = $i;
        }
    }

    return $missing;
}