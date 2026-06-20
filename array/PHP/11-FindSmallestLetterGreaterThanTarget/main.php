<?php

$letters = ["c","f","j"];
$target = "a";

print_r(nextGreatestLetter($letters,$target));

/**
 * @param $letters
 * @param $target
 * @return Integer[]
 */
function nextGreatestLetter($letters,$target) {
    foreach ($letters as $letter){
        if($letter > $target){
            return $letter;
        }
    }

    return $letters[0];
}