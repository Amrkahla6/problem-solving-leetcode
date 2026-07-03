<?php


        $x = 8;

       print_r(mySqrt($x));

function mySqrt($x) {
    $left = 0;
    $right = $x;

    while ($left <= $right) {
        $mid = $left + intdiv($right - $left, 2);
        $square = $mid * $mid;
        if ($square == $x) {
            return $mid;
        } elseif ($square < $x) {
            $left = $mid + 1;
        } else {
            $right = $mid - 1;
        }
    }

    return $right;
}


