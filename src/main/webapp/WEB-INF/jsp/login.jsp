<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		background-image: url("/mybatis-test/images/bg2.jpg") ;
		background-size: cover; 

	}
	
	#loginDiv{
	
		border:1px dashed;
		width:50%;
		margin-left: auto;
		margin-right: auto;
		margin-top: 100px;	
	}
	
	#loginForm{
		width:100%;
	}
	
	#loginDiv p{
		
	
		margin-bottom: 20px;
		margin-left: 20px;
	}
	
	.loginFont{
		text-shadow:2px 2px 1px gray;
		color: red;
	}
</style>
</head>
<body>
	<div id="loginDiv">
		<form id="loginForm" method="post" action="">
			<p>
				<span class="loginFont">用户名：</span><input id="userName" type="text" name="userName"/>
			</p>
			<p>
				<span class="loginFont">密码：</span><input id="password" type="text" name="password"/>
			</p>
			<p>
				<input id="loginButton" type="submit" value="登录"/>
			</p>
		</form>
	</div>
</body>
</html>