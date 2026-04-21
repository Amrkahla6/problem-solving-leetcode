<?php

    $prices = [7,1,5,3,6];

    print_r(maxProfit($prices));

    function maxProfit($prices)
    {
        $minPrice = PHP_INT_MAX;
        $maxProfit = 0;

        foreach ($prices as $price){
            if ($price < $minPrice){
                $minPrice = $price;
            }else{
                $profit = $price - $minPrice;
                if ($profit > $maxProfit){
                    $maxProfit = $profit;
                }
            }
        }

        return $maxProfit;
    }


