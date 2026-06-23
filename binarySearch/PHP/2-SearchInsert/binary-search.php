<?php

    $array = [1,3,5,6];
    $target = 2;

    print_r(search($array,$target));

    function search($nums,$target)
    {
      $left = 0;
      $right = count($nums) - 1;

      while ($left <= $right){
          $mid = floor($left + $right) / 2;

          if ($nums[$mid] == $target){
              return (int) $mid;
          }

          if ( $nums[$mid] < $target){
              $left = $mid + 1;
          }else{
              $right = $mid - 1;
          }
      }

      return (int) $left;
    }


