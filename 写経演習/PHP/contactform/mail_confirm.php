<!doctype html>
<html lang="ja">

<head>
<meta charset="UTF-8">
<title>お問い合わせフォームを作る</title>
<link rel="stylesheet" type="text/css" href="style2.css"> 
</head>

<body>
	<h1>お問い合わせ内容確認</h1>
    
	<div class="box">
		<p>お問い合わせ内容はこちらで宜しいでしょうか？<br>
		よろしければ、「送信する」ボタンを押して下さい。
		</p>
	
	<div class="box1">
		名前<br>
	<?php echo $_POST['name'];?><br>
	
	メールアドレス<br>
	<?php echo $_POST['mail'];?><br>
	
	
	年齢<br>
	<?php echo $_POST['age'];?><br>
	

	コメント<br>
	<?php echo $_POST['comments'];?><br>
	
	</div>
	
	
	<form action="index.html">
		<input type="submit" class="submit1" value="戻って修正する"/>
	</form>
	
	<form method="POST" action="insert.php" >
	<input type="submit" class="submit2" value="登録する">
	<input type="hidden" name="name" value="<?php echo $_POST['name'];?>">
	<input type="hidden" name="mail" value="<?php echo $_POST['mail'];?>">
	<input type="hidden" name="age" value="<?php echo $_POST['age'];?>">
	<input type="hidden" name="comments" value="<?php echo $_POST['comments'];?>">
	</form>
	</div>
	
</body>
</html>