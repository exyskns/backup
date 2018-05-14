<?php
mb_internal_encoding("utf8");


$pdo=new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");



$pdo->exec("insert into 4each_keijiban(handlename,title,comments)values
    ('".$_POST['handlename']."','".POST_['title']."','".POST_['comments']."');");



header("Location:http://localhost/4each_keijiban/index.php");
?>
