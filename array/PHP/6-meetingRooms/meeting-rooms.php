<?php

$nums = [[0, 30],[5, 10],[15, 20]];

    print_r(meetingRooms($nums));

    function meetingRooms($nums)
    {
        usort($nums, function($a, $b) {
            return $a[0] <=> $b[0];
        });
        for ($i=1; $i < count($nums); $i++) {
            $currentStart  = $nums[$i][0];
            $previousEnd = $nums[$i-1][1];

            if ($currentStart < $previousEnd) {
                return "false";
            }
        }

        return "true";
    }


