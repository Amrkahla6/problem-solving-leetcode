<?php


        $nums = [5,7,7,8,8,10];
        $target = 8;

       print_r(searchRange($nums,$target));

    function searchRange($nums,$target)
    {
        if (count($nums) == 0){
            return [-1,-1];
        }

        $first = findFirst($nums,$target);
        $last  = findLast($nums,$target);

        return [$first,$last];
    }

   function findFirst($nums,$target){
        $left = 0;
        $right = count($nums) - 1; // 5

        while ($left < $right){
            $mid = $left + intdiv($right - $left, 2);// 3

            if ($nums[$mid] == $target){
                $right = $mid;
            }elseif ($nums[$mid] < $target){
                $left = $mid + 1;
            }else{
                $right = $mid - 1;
            }
        }

        if ($left >= count($nums) || $nums[$left] !== $target){
            return -1;
        }

        return $left;
   }

function findLast($nums,$target){
    $left = 0;
    $right = count($nums) - 1; // 5

    while ($left < $right){
        $mid = $left + intdiv($right - $left + 1, 2);

        if ($nums[$mid] == $target){
            $left = $mid;
        }elseif ($nums[$mid] < $target){
            $left = $mid + 1;
        }else{
            $right = $mid - 1;
        }
    }

    if ($left >= count($nums) || $nums[$left] !== $target){
        return -1;
    }

    return $left;
}


