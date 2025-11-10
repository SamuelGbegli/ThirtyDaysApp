<!--
    The following code initialises and compares two variables, a and b,
    and outputs a value to the web page depending on the variable's values.
-->
<?php
    $a = 3;
    $b = 6;
    if($a < $b) {
        echo "a is smaller than b";
    }
    elseif ($b < $a) {
        echo "b is smaller than a";
    }
    else {
        echo "a and b are equal";
    }
?>