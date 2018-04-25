<!DOCTYPE HTML>
<html lang="ja">

<head>
<meta charset="UTF-8">
<title>4eachblog 掲示板</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<img src="4eachblog_logo.jpg" class="logo">

<header>
    <ul>
        <li>トップ</li>
        <li>プロフィール</li>
        <li>4eachについて</li>
        <li>登録フォーム</li>
        <li>問い合わせ</li>
        <li>その他</li>
    </ul>
</header>

<body>
	<div class="mainbox">
    	<div class="leftside">
        	<h1>プログラミングに役立つ掲示板</h1>
    	</div>

	
			<div class="leftbox1">
					<form method="post" action="insert.php">
						<h2>入力フォーム</h2>
						
						<lable>ハンドルネーム</lable><br>
						<input type="text" size="30" name="handlename"><br>
						
						<label>タイトル</label><br>
						<input type="text" size="30" name="title">
					
						<label>コメント</label><br>
					</form> 
			</div>
		

    
		<div class="rightside">
        	<h3>人気の記事</h3>
            	<ul>
					<li>PHPオススメ本</li>
                	<li>PHP　MyAdminの使い方</li>
                	<li>いま人気のエディタTop5</li>
                	<li>HTMLの基礎</li>
            	</ul>
			<h3>オススメリンク</h3>
				<ul>
					<li>インターノウス株式会社</li>
                	<li>XAMPPのダウンロード</li>
                	<li>Eclipseのダウンロード</li>
                	<li>Braketsのダウンロード</li>
            	</ul>
        	<h3>カテゴリ</h3>
            	<ul>
                	<li>HTML</li>
                	<li>PHP</li>
                	<li>MySQL</li>
                	<li>JavaScript</li>
            	</ul>    
    	</div>
	</div>
    
</body> 

<footer>copyright internous | 4each blog is the one which provides A to Z about programming.
</footer>
    
</html>